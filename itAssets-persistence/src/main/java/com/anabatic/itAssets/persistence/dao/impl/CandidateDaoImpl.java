package com.anabatic.itAssets.persistence.dao.impl;

import java.math.BigInteger;
import java.sql.Time;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.itAssests.core.constant.UsersErrorConstant;
import org.itAssests.core.exception.UsersException;
import org.springframework.beans.factory.annotation.Autowired;

import com.anabatic.itAssets.persistence.dao.CandidateDao;
import com.anabatic.itAssets.persistence.dao.UsersDao;
import com.anabatic.itAssets.persistence.model.Candidate;
import com.anabatic.logging.executor.Logging;

@Transactional
public class CandidateDaoImpl implements CandidateDao {

	private static final Logging LOGGING = new Logging(CandidateDaoImpl.class);
	@PersistenceContext
	EntityManager manager;
	@Autowired
	UsersDao usersdao;

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
			String comment, Time startTime,  String location) {
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
			candidate.setSelectinStatus(status);
			candidate.setInterviewStartTime(startTime);
			candidate.setComment(comment);
			candidate.setLocation(location);
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
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public List<Candidate> getByStatusAndStep(Integer status, Integer step) {
		LOGGING.INFO("getByStatusAndStep Of Candidate Dao");
		try {
			Query query = manager.createQuery("select u from Candidate u where u.status =:status and u.step =:step ORDER BY id");
			query.setParameter("status", status);
			query.setParameter("step", step);
			return query.getResultList();
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public List<Candidate> getByStatusAndStep(Integer step) {
		LOGGING.INFO("getByStatusAndStep Of Candidate Dao");
		try {
			Query query = manager.createQuery("select u from Candidate u where u.step =:step ORDER BY id");
			query.setParameter("step", step);
			return query.getResultList();
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public Candidate updateStepAndStatus(Integer status, Integer step, Long id, Integer selection, String comment) {
		LOGGING.INFO("updateStepAndStatus Of Candidate Dao");
		try {
			Candidate byId = getById(id);
			byId.setStatus(status);
			byId.setStep(step);
			byId.setSelectinStatus(selection);
			byId.setComment(comment);
			return manager.merge(byId);
		} catch (Exception e) {
			throw e;
		}

	}

	@Override
	public Candidate updateSelection(Long id, Integer selection) {
		LOGGING.INFO("updateStepAndStatus Of Candidate Dao");
		try {
			Candidate byId = getById(id);
			byId.setSelectinStatus(selection);
			return manager.merge(byId);
		} catch (Exception e) {
			throw e;
		}
	}
	@Override
	public Candidate updateSelectionAndComment(Long id,String comment,Integer selection) {
		try {
			Candidate candidate=getById(id);
			candidate.setComment(comment);
			candidate.setSelectinStatus(selection);
		return manager.merge(candidate);
		}catch (Exception e) {
			throw e;
		}
	}

	@Override
	public List<Candidate> getByStatusStepSelection(Integer status, Integer step, Integer selection) {
		LOGGING.INFO("getByStatusStepSelection Of Candidate Dao");
		try {
			Query query = manager.createQuery(
					"select u from Candidate u where u.status =:status and u.step =:step and u.selectinStatus =:selection ORDER BY id");
			query.setParameter("status", status);
			query.setParameter("step", step);
			query.setParameter("selection", selection);

			return query.getResultList();
		} catch (Exception e) {
			throw e;
		}
	}

	public void deleteById(Long id) {
		try {
			Candidate candidate = getById(id);
			manager.remove(candidate);
		} catch (Exception e) {
			throw new UsersException(UsersErrorConstant.CANDIDATE);
		}
	}

	@Override
	public Candidate joiningDate(Long id, Date dateOfJoining, String comment, Integer selection, Integer status,
			Integer step) {
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
			candidate.setComment(comment);
			candidate.setSelectinStatus(selection);
			candidate.setStatus(status);
			candidate.setStep(step);
			Candidate update = update(candidate);
			return update;
		} catch (Exception e) {
			LOGGING.ERROR("joiningDate Candidate Dao" + e.getMessage());
			throw e;
		}
	}

	@Override
	public Candidate checkCin(String cin) {
		LOGGING.INFO("getByStatusStepSelection Of Candidate Dao");
		try {
			Query query = manager.createQuery("select u from Candidate u where u.cin =:cin");
			query.setParameter("cin", cin);
			return (Candidate) query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public BigInteger getNextSequence(String sequenceName) {
		try {
			String str = "select nextval('" + sequenceName + "')";
			Query q = manager.createNativeQuery(str);
			return (BigInteger) q.getSingleResult();
		} catch (Exception e) {
			throw new UsersException(UsersErrorConstant.SEQUENCE);
		}
	}

	@Override
	@Transactional
	public void createSequence(String sequenceName) {
		String str = "CREATE SEQUENCE IF NOT EXISTS " + sequenceName + " MINVALUE 1 MAXVALUE 99 START 1 INCREMENT 1";
		Query query = manager.createNativeQuery(str);
		query.executeUpdate();
	}

	@Override
	public List<Candidate> getByStatusStepHm(Integer status, Integer step, Long hmId) {
		LOGGING.INFO("getByStatusStepHm Of Candidate Dao");
		try {
			Query query = manager.createQuery(
					"select u from Candidate u where u.status =:status and u.step =:step and u.step =:step and manager_id =:hmId ORDER BY selection DESC");
			query.setParameter("status", status);
			query.setParameter("step", step);
			query.setParameter("hmId", hmId);
			return query.getResultList();
		} catch (Exception e) {
			throw e;
		}
	}

	

}
