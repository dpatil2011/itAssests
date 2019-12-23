package com.anabatic.itAssets.services.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.anabatic.itAssets.persistence.dao.CandidateDao;
import com.anabatic.itAssets.persistence.model.Candidate;
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

}
