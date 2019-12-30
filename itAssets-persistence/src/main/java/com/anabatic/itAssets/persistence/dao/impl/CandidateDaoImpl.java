package com.anabatic.itAssets.persistence.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.anabatic.itAssets.persistence.dao.CandidateDao;
import com.anabatic.itAssets.persistence.model.AvailableAsset;
import com.anabatic.itAssets.persistence.model.Candidate;
import com.anabatic.itAssets.persistence.model.Request;

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

	@Override
	public Candidate getById(Long can) {
		  Candidate response = manager.find(Candidate.class,
	                can);
	        return response;
	}

	@Override
	public List<Candidate> getAll() {
		try {
            return manager.createNativeQuery("SELECT * FROM candidate", Candidate.class).getResultList();
        } catch (Exception e) {
            throw e;
        }
	}

	@Override
	public Candidate update(Candidate req) {
		Candidate request = manager.merge(req);
		return request;
	}

	@Override
	public Boolean validatePhone(Candidate can) {
		try {
			//return manager.createNativeQuery("SELECT * FROM faq where ", Faq.class).getResultList();
			Query query = manager
					.createQuery("select u from Candidate u where u.phoneNo =:phone");
			query.setParameter("phone", can.getPhoneNo());
	//	return null;
			if (query.getResultList().isEmpty())
				return false;
			else
				return true;
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public Boolean validateEmail(Candidate can) {
		try {
			//return manager.createNativeQuery("SELECT * FROM faq where ", Faq.class).getResultList();
			Query query = manager
					.createQuery("select u from Candidate u where u.email =:email");
			query.setParameter("email", can.getEmail());
	//	return null;
			if (query.getResultList().isEmpty())
				return false;
			else
				return true;
		} catch (Exception e) {
			throw e;
		}
	}
	}


