package com.anabatic.itAssets.persistence.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.itAssests.core.constant.UsersErrorConstant;
import org.itAssests.core.exception.UsersException;

import com.anabatic.itAssets.persistence.dao.CandidateDao;
import com.anabatic.itAssets.persistence.model.Candidate;
import com.anabatic.logging.executor.Logging;

@Transactional
public class CandidateDaoImpl implements CandidateDao {

	private static final Logging LOGGING = new Logging(CandidateDaoImpl.class);
	@PersistenceContext
	EntityManager manager;

	@Override
	public Candidate insert(Candidate candidate) {
		try {
			LOGGING.INFO("Insert Candidate Dao");
			return manager.merge(candidate);
		} catch (Exception e) {
			LOGGING.ERROR("Insert Candidate Dao " + e.getMessage());
			throw e;
		}
	}

	@Override
	public Candidate getById(Long can) {
		Candidate response = manager.find(Candidate.class, can);
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
		// try {
		// return manager.createNativeQuery("SELECT * FROM faq where ",
		// Faq.class).getResultList();
		Query query = manager.createQuery("select u from Candidate u where u.phoneNo =:phone");
		query.setParameter("phone", can.getPhoneNo());
		if (query.getResultList().isEmpty()) {
			return false;
		} else {
			throw new UsersException(UsersErrorConstant.PHONE_NO);
		}
		/*
		 * } catch (Exception e) { throw e; }
		 */
	}

	@Override
	public Boolean validateEmail(Candidate can) {
		// try {
		// return manager.createNativeQuery("SELECT * FROM faq where ",
		// Faq.class).getResultList();
		Query query = manager.createQuery("select u from Candidate u where u.email =:email");
		query.setParameter("email", can.getEmail());
		// return null;
		if (query.getResultList().isEmpty()) {
			return false;
		} else {
			throw new UsersException(UsersErrorConstant.EMAIL_ID);
		}
		/*
		 * } catch (Exception e) { throw e; }
		 */
	}

	@Override
	public Candidate getByCIN(String cin) {
		try {
		Query query = manager.createQuery("select u from Candidate u where u.cin =:cin");
		query.setParameter("cin", cin);
		return (Candidate) query.getSingleResult();
				}  catch (Exception e) {
					throw e;
				}
	}
}
