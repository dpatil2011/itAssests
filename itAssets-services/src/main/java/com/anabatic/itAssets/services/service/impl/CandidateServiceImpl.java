package com.anabatic.itAssets.services.service.impl;

import java.util.List;

import org.itAssests.core.constant.UsersErrorConstant;
import org.itAssests.core.exception.UsersException;
import org.springframework.beans.factory.annotation.Autowired;

import com.anabatic.itAssets.persistence.dao.CandidateDao;
import com.anabatic.itAssets.persistence.model.Candidate;
import com.anabatic.itAssets.services.service.CandidateService;

public class CandidateServiceImpl implements CandidateService {
	
	@Autowired
	private CandidateDao candidateDao;

	@Override
	public Candidate insert(Candidate can) {
		Boolean validEmail=candidateDao.validateEmail(can);
		Boolean validPhone = candidateDao.validatePhone(can);
		Candidate can1= new Candidate();
		 if ((validPhone && validEmail)) {
				throw new UsersException(UsersErrorConstant.CANDIDATE_EXISTS); 
		 }
		 /*else if(validEmail) {
			throw new UsersException(UsersErrorConstant.EMAIL_ID);
//			throw new UsersException(UsersErrorConstant.INVALID_EMAIL_KEY);
		}
		else if (validPhone) {
			throw new UsersException(UsersErrorConstant.PHONE_NO);
		}*/
		
		else {
			 can1=candidateDao.insert(can);
			
		}
		return can1;
	}

	@Override
	public Candidate getById(Long can) {
		Candidate response = candidateDao.getById(can);
	        return response;
	}

	@Override
	public List<Candidate> getAll() {
		 return candidateDao.getAll();
	}

	@Override
	public Candidate update(Candidate request) {
		Candidate req = candidateDao.update(request);
		return req;
	}

	@Override
	public Candidate getByCIN(String cin) {
		Candidate response = candidateDao.getByCIN(cin);
        return response;
}

}
