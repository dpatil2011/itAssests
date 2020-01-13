package com.anabatic.itAssets.services.service;

import java.sql.Time;
import java.util.Date;
import java.util.List;

import com.anabatic.itAssets.persistence.model.Candidate;

public interface CandidateService {

	Candidate insert(Candidate can);

	Candidate getById(Long id);

	List<Candidate> getAll();

	Candidate update(Candidate request);

	List<Candidate> getByHm(Long hmId);

	List<Candidate> getByRecuriter(Long id);

	Candidate scheduleInterview(Long id, Date interviewDate, String mode, Time time, Integer status, Integer step, String comment);

	Candidate joiningDate(Date dateOfJoining, Long id);


	Candidate getByCIN(String cin);

	List<Candidate> update(List<Candidate> request2);

}
