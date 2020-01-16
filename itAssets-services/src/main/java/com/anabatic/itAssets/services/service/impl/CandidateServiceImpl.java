package com.anabatic.itAssets.services.service.impl;

import java.sql.Time;
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
	public List<Candidate> getByHm(Long hmId) {
		
		return candidateDao.getByHm(hmId);
	}

	@Override
	public List<Candidate> getByRecuriter(Long id) {
		return candidateDao.getByRecuriter(id);
	}

	@Override
	public Candidate scheduleInterview(Long id, Date interviewDate, String mode, Time time, Integer status, Integer step,String comment) {
		return candidateDao.scheduleInterview(id,interviewDate,mode,time,status,step,comment);
	}

	@Override
	public Candidate joiningDate(Date dateOfJoining, Long id) {
		return candidateDao.joiningDate(id,dateOfJoining);
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
			return candidateDao.getByStatusAndStep(status,step);
		}

		@Override
		public List<Candidate> getByStep(Integer step) {
			// TODO Auto-generated method stub
			return candidateDao.getByStatusAndStep(step);
		}

		@Override
		public Candidate updateStepAndStatus(Integer status, Integer step, Long id) {
			// TODO Auto-generated method stub
			return candidateDao.updateStepAndStatus(status,step, id);
		}

		@Override
		public void deleteById(Long id) {
			candidateDao.deleteById(id);	
		}

	

}
