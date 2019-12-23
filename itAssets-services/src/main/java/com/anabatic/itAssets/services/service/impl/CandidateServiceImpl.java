package com.anabatic.itAssets.services.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.anabatic.itAssets.persistence.dao.CandidateDao;
import com.anabatic.itAssets.persistence.model.AvailableAsset;
import com.anabatic.itAssets.persistence.model.Candidate;
import com.anabatic.itAssets.persistence.model.Request;
import com.anabatic.itAssets.services.service.CandidateService;

public class CandidateServiceImpl implements CandidateService {
	
	@Autowired
	private CandidateDao candidateDao;

	@Override
	public Candidate insert(Candidate can) {
		// TODO Auto-generated method stub
		Candidate can1=candidateDao.insert(can);
		
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

}
