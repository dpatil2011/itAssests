package com.anabatic.itAssets.services.service;

import java.sql.Time;
import java.util.Date;
import java.util.List;

import com.anabatic.itAssets.persistence.dto.BulkUpdateCandidateResponseDto;
import com.anabatic.itAssets.persistence.model.Candidate;

public interface CandidateService {

	Candidate insert(Candidate can);

	Candidate getById(Long id);

	List<Candidate> getAll();

	Candidate update(Candidate request);

	List<Candidate> getByHm(Long hmId);

	List<Candidate> getByRecuriter(Long id);

	Candidate scheduleInterview(Long id, Date interviewDate, String mode, Time time, Integer status, String comment, Time time2, String location);

	Candidate joiningDate(Date dateOfJoining, Long id);

	Candidate getByCIN(String cin);

	public BulkUpdateCandidateResponseDto update(List<Candidate> request2);

	List<Candidate> getByStatusAndStep(Integer status, Integer step);

	List<Candidate> getByStep(Integer step);

	Candidate updateStepAndStatus(Integer status, Integer step, Long id, Integer selection, String comment);

	Candidate updateSelection(Long id, Integer selection);

	List<Candidate> getByStatusStepSelection(Integer status, Integer step, Integer selection);

	public void deleteById(Long id);

	public Candidate joiningDate(Date dateOfJoining, Long id, String comment, Integer selection, Integer status,
			Integer step);

	public Candidate checkCin(String random2);

	public Candidate updateSelectionAndComment(Long id, String comment, Integer selection);


	List<Candidate> getByStatusStepHm(Integer status, Integer step, Long hmId);

}
