package com.anabatic.itAssets.persistence.dao.impl;

import java.sql.Time;
import java.util.Date;
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
	public Candidate getById(Long id) {
		try {
			LOGGING.INFO("getById Candidate Dao");
			Candidate response = manager.find(Candidate.class, id);
			return response;
		} catch (Exception e) {
			LOGGING.ERROR("getById Candidate Dao " + e.getMessage());
			throw e;
		}
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
		try {
			LOGGING.INFO("update Candidate Dao");
			Candidate request = manager.merge(req);
			return request;
		} catch (Exception e) {
			LOGGING.ERROR("update Candidate Dao " + e.getMessage());
			throw e;
		}
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
	public List<Candidate> getByHm(Long hmId) {
		try {
			LOGGING.INFO("GetBy Hiring Manager Candidate Dao");
			@SuppressWarnings("unchecked")
			List<Candidate> query = manager.createQuery("select c from Candidate c where manager_id =:hmId")
					.setParameter("hmId", hmId).getResultList();
			return query;
		} catch (Exception e) {
			LOGGING.ERROR("GetBy Hiring Manager Candidate Dao" + e.getMessage());
			throw e;
		}

	}

	@Override
	public List<Candidate> getByRecuriter(Long id) {
		try {
			LOGGING.INFO("GetBy Recuriter Candidate Dao");
			@SuppressWarnings("unchecked")
			List<Candidate> query = manager.createQuery("select c from Candidate c where recruiter_id =:id")
					.setParameter("id", id).getResultList();
			return query;
		} catch (Exception e) {
			LOGGING.ERROR("GetBy Recuriter Candidate Dao" + e.getMessage());
			throw e;
		}
	}

	@Override
	public Candidate scheduleInterview(Long id, Date interviewDate, String mode, Time time, Integer status,
			Integer step, String comment) {
		try {
			LOGGING.INFO("scheduleInterview Candidate Dao");
			Candidate candidate = getById(id);
			if (candidate == null) {
				UsersException exception = new UsersException(UsersErrorConstant.CANDIDATE);
				exception.getError().getField().clear();
				exception.getError().addField("id");
				throw exception;
			}
			candidate.setInterviewDate(interviewDate);
			candidate.setModeOfInterview(mode);
			candidate.setInterviewEndTime(time);
			candidate.setStatus(status);
			candidate.setStep(step);
			candidate.setComment(comment);
			Candidate update = update(candidate);
			return update;
		} catch (Exception e) {
			LOGGING.ERROR("scheduleInterview Candidate Dao" + e.getMessage());
			throw e;
		}
	}

	@Override
	public Candidate joiningDate(Long id, Date dateOfJoining) {
		try {
			LOGGING.INFO("joiningDate Candidate Dao");
			Candidate candidate = getById(id);
			if (candidate == null) {
				UsersException exception = new UsersException(UsersErrorConstant.CANDIDATE);
				exception.getError().getField().clear();
				exception.getError().addField("id");
				throw exception;
			}
			candidate.setDateOfJoining(dateOfJoining);
			Candidate update = update(candidate);
			return update;
		} catch (Exception e) {
			LOGGING.ERROR("joiningDate Candidate Dao" + e.getMessage());
			throw e;
		}
	}

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
