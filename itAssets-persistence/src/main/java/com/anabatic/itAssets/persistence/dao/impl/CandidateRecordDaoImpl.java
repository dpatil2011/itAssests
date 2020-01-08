package com.anabatic.itAssets.persistence.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.anabatic.itAssets.persistence.dao.CandidateRecordDao;
import com.anabatic.itAssets.persistence.model.CandidateRecord;
import com.anabatic.itAssets.persistence.model.Request;

@Transactional
public class CandidateRecordDaoImpl implements CandidateRecordDao {

	@PersistenceContext
	EntityManager entityManager;

	@Override
	public CandidateRecord insert(CandidateRecord record) {
		CandidateRecord record2 = entityManager.merge(record);
		return record2;
	}

	@Override
	public CandidateRecord getById(CandidateRecord record) {
		CandidateRecord record2 = entityManager.find(CandidateRecord.class, record.getId());
		return record2;
	}

	@Override
	public List<CandidateRecord> getAll() {
		try {
			return entityManager.createNativeQuery("SELECT * FROM candidate_record", CandidateRecord.class)
					.getResultList();

		} catch (Exception e) {
			throw e;
		}

	}

	@Override
	public void delete(CandidateRecord record) {
		try {
			CandidateRecord byId = getById(record);
			entityManager.remove(byId);
		} catch (Exception e) {
			throw e;
		}
	}


	@Override
	public List<CandidateRecord> getByStatus(Integer status) {
		try {
			//return manager.createNativeQuery("SELECT * FROM faq where ", Faq.class).getResultList();
			Query query = entityManager.createQuery("select u from CandidateRecord u where u.status =: status");
			query.setParameter("status", status);
			List<CandidateRecord> resultList = query.getResultList();
	//	return null;
			return query.getResultList();
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public List<CandidateRecord> getByStep(CandidateRecord req) {
		try {
			//return manager.createNativeQuery("SELECT * FROM faq where ", Faq.class).getResultList();
			Query query = entityManager.createQuery("select u from CandidateRecord u where u.steps =:step");
			query.setParameter("step", req.getSteps());
	//	return null;
			return query.getResultList();
		} catch (Exception e) {
			throw e;
		}
	}

	

	@Override
	public List<CandidateRecord> getBy(CandidateRecord can) {
		try {
			Query query = entityManager
					.createQuery("select u from candidate_record u where u.status=:status");
			query.setParameter("requestTo", can.getStatus());
			return query.getResultList();
		} catch (Exception e) {
			throw e;
		}
	}

}
