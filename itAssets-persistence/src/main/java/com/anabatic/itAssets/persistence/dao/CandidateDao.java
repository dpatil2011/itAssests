package com.anabatic.itAssets.persistence.dao;

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

	public Candidate scheduleInterview(Long id, Date interviewDate, String mode, Time time, Integer status, Integer step, String comment);

	public Candidate joiningDate(Long id, Date dateOfJoining);

	public Candidate getByCIN(String cin);

	public List<Candidate> update(List<Candidate> request2);

	public List<Candidate> getByStatusAndStep(Integer status, Integer step);

	public List<Candidate> getByStatusAndStep(Integer step);


}
