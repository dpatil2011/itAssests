package com.anabatic.itAssets.services.service.impl;

import java.math.BigInteger;
import java.sql.Time;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.itAssests.core.constant.UsersErrorConstant;
import org.itAssests.core.exception.UsersException;
import org.springframework.beans.factory.annotation.Autowired;

import com.anabatic.itAssets.persistence.dao.CandidateDao;
import com.anabatic.itAssets.persistence.dao.UsersDao;
import com.anabatic.itAssets.persistence.dto.BulkUpdateCandidateFailedDto;
import com.anabatic.itAssets.persistence.dto.BulkUpdateCandidateResponseDto;
import com.anabatic.itAssets.persistence.model.Candidate;
import com.anabatic.itAssets.persistence.model.CandidateRecord;
import com.anabatic.itAssets.persistence.model.Users;
import com.anabatic.itAssets.services.service.CandidateService;
import com.anabatic.logging.executor.Logging;

public class CandidateServiceImpl implements CandidateService {
	private static final Logging LOGGING = new Logging(CandidateServiceImpl.class);
	@Autowired
	private CandidateDao candidateDao;
	@Autowired
	UsersDao usersdao;

	@Override
	public Candidate insert(Candidate can) {
		Boolean validEmail = candidateDao.validateEmail(can);
		Boolean validPhone = candidateDao.validatePhone(can);

	
		Candidate can1= new Candidate();
		 if ((validPhone && validEmail)) {
				throw new UsersException(UsersErrorConstant.CANDIDATE_EXISTS); 
		 }
		 /*else if(validEmail) {
			throw new UsersException(UsersErrorConstant.EMAIL_ID);
//			throw new UsersException(UsersErrorConstant.INVALID_EMAIL_KEY);
=======
		Candidate can1 = new Candidate();
		if ((validPhone && validEmail)) {
			throw new UsersException(UsersErrorConstant.CANDIDATE_EXISTS);
>>>>>>> branch 'master' of https://github.com/dpatil2011/itAssests.git
		}

		/*
		 * else if(validEmail) { throw new UsersException(UsersErrorConstant.EMAIL_ID);
		 * // throw new UsersException(UsersErrorConstant.INVALID_EMAIL_KEY); } else if
		 * (validPhone) { throw new UsersException(UsersErrorConstant.PHONE_NO); }
		 */

		else {
			can.setCin(generateSequence());
			can1 = candidateDao.insert(can);

		}
		return can1;
	}

	public String generateSequence() {
		String cin = "";
		LocalDate localDate = LocalDate.now();
		String dateformat = DateTimeFormatter.ofPattern("yyMMdd").format(localDate);
		String sequenceName = "C" + dateformat;
		candidateDao.createSequence(sequenceName);
		BigInteger sequence = candidateDao.getNextSequence(sequenceName);
		if (sequence.compareTo(new BigInteger("10")) < 0) {
			cin = sequenceName + String.format("%02d", sequence);
		} else {
			cin = sequenceName + sequence;
		}
		return cin;
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
	public List<Candidate> getByHm(Long hmId) {

		return candidateDao.getByHm(hmId);
	}

	@Override
	public List<Candidate> getByRecuriter(Long id) {
		return candidateDao.getByRecuriter(id);
	}

	@Override
	public Candidate scheduleInterview(Long id, Date interviewDate, String mode, Time time, Integer status,
			String comment, Time startTime,  String location) {
		return candidateDao.scheduleInterview(id, interviewDate, mode, time, status, comment, startTime, location);
	}

	@Override
	public Candidate joiningDate(Date dateOfJoining, Long id) {
		return candidateDao.joiningDate(id, dateOfJoining);
	}

	public Candidate getByCIN(String cin) {
		Candidate response = candidateDao.getByCIN(cin);
		return response;
	}

	@Override
	public BulkUpdateCandidateResponseDto update(List<Candidate> request2) {
		LOGGING.INFO("Bulk Update Candidate Service Method Accessed");
		List<Candidate> successfulRecords = new ArrayList<>();
		List<BulkUpdateCandidateFailedDto> failedRecords = new ArrayList<>();

		for (Candidate candidate : request2) {
			try {
				Candidate existingCandidate = candidateDao.getById(candidate.getId());
				existingCandidate.setSlot(candidate.getSlot());
				
				if (candidate.getUsers() != null) {
					Users manager = usersdao.getById(candidate.getUsers().getId());
					if (manager == null) {
						throw new UsersException(UsersErrorConstant.USER_NOT_FOUND);
					}
					existingCandidate.setUsers(manager);
				}
				successfulRecords.add(candidateDao.update(existingCandidate));
			} catch (Exception e) {
				BulkUpdateCandidateFailedDto bUCF = new BulkUpdateCandidateFailedDto();
				bUCF.setId(candidate.getId());
				failedRecords.add(bUCF);
			}
		}
		BulkUpdateCandidateResponseDto response = new BulkUpdateCandidateResponseDto();
		response.setTotalRecords(request2.size());
		response.setFailed(failedRecords.size());
		response.setFailedRecords(failedRecords);
		response.setSuccessful(successfulRecords.size());
		return response;
	}

	@Override
	public List<Candidate> getByStatusAndStep(Integer status, Integer step) {
		// TODO Auto-generated method stub
		return candidateDao.getByStatusAndStep(status, step);
	}

	@Override
	public List<Candidate> getByStep(Integer step) {
		// TODO Auto-generated method stub
		return candidateDao.getByStatusAndStep(step);
	}

	@Override
	public Candidate updateStepAndStatus(Integer status, Integer step, Long id, Integer selection, String comment) {
		// TODO Auto-generated method stub
		return candidateDao.updateStepAndStatus(status, step, id, selection, comment);
	}

	@Override
	public Candidate updateSelection(Long id, Integer selection) {
		// TODO Auto-generated method stub
		return candidateDao.updateSelection(id, selection);
	}

	@Override
	public List<Candidate> getByStatusStepSelection(Integer status, Integer step, Integer selection) {
		return candidateDao.getByStatusStepSelection(status, step, selection);
	}

	@Override
	public void deleteById(Long id) {
		candidateDao.deleteById(id);
	}

	@Override
	public Candidate joiningDate(Date dateOfJoining, Long id, String comment, Integer selection, Integer status,
			Integer step) {
		return candidateDao.joiningDate(id, dateOfJoining, comment, selection, status, step);
	}

	@Override
	public Candidate checkCin(String random2) {
		// TODO Auto-generated method stub
		return candidateDao.checkCin(random2);
	}

	@Override
	public List<Candidate> getByStatusStepHm(Integer status, Integer step, Long hmId) {
		// TODO Auto-generated method stub
		return candidateDao.getByStatusStepHm(status,step,hmId);
	}

	
	@Override
	public Candidate updateSelectionAndComment(Long id,String comment,Integer selection) {
		return candidateDao.updateSelectionAndComment(id, comment, selection);
	}
}
