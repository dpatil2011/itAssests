package com.anabatic.itAssets.persistence.dao;

import java.math.BigInteger;
import java.sql.Time;
import java.util.Date;
import java.util.List;

import com.anabatic.itAssets.persistence.model.Candidate;

public interface CandidateDao {

	/**
	 * 
	 * @param can
	 * @return
	 */
	public Candidate insert(Candidate can);

	public Candidate getById(Long can);

	public List<Candidate> getAll();

	public Candidate update(Candidate request);

	public Boolean validatePhone(Candidate can);

	public Boolean validateEmail(Candidate can);

	public List<Candidate> getByHm(Long hmId);

	public List<Candidate> getByRecuriter(Long id);

	public Candidate scheduleInterview(Long id, Date interviewDate, String mode, Time time, Integer status,
			String comment, Time startTime, String location);

	public Candidate joiningDate(Long id, Date dateOfJoining);

	public Candidate getByCIN(String cin);

	public List<Candidate> getByStatusAndStep(Integer status, Integer step);

	public List<Candidate> getByStatusAndStep(Integer step);

	public Candidate updateStepAndStatus(Integer status, Integer step, Long id, Integer selection, String comment);

	public Candidate updateSelection(Long id, Integer selection);

	public List<Candidate> getByStatusStepSelection(Integer status, Integer step, Integer selection);

	public void deleteById(Long id);

	public Candidate joiningDate(Long id, Date dateOfJoining, String comment, Integer selection, Integer status,
			Integer step);

	public Candidate checkCin(String random2);

	public BigInteger getNextSequence(String sequenceName);

	public void createSequence(String sequenceName);


	public List<Candidate> getByStatusStepHm(Integer status, Integer step, Long hmId);
	public Candidate updateSelectionAndComment(Long id, String comment, Integer selection);

}
