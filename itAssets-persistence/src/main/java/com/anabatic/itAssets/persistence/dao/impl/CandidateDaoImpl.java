package com.anabatic.itAssets.persistence.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.anabatic.itAssets.persistence.dao.CandidateDao;
import com.anabatic.itAssets.persistence.model.Candidate;

@Transactional
public class CandidateDaoImpl implements CandidateDao {
	
	@PersistenceContext
	EntityManager manager;

	@Override
	public Candidate insert(Candidate can) {
		// TODO Auto-generated method stub
		try {
			Candidate can1=manager.merge(can);
			return can1;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		//Candidate can1=manager.merge(can);
		return null;
	}

}
