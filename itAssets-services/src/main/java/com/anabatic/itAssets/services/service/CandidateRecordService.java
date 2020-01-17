package com.anabatic.itAssets.services.service;

import java.util.List;

import com.anabatic.itAssets.persistence.model.CandidateRecord;

public interface CandidateRecordService {

	public CandidateRecord insert(CandidateRecord record);

	public CandidateRecord update(CandidateRecord record);

	public CandidateRecord getById(CandidateRecord record);

	public List<CandidateRecord> getAll();

	public void delete(CandidateRecord record);

	public List<CandidateRecord> getByStatus(CandidateRecord req);
	
	public List<CandidateRecord> getByStep(CandidateRecord req);

	public List<CandidateRecord> getBy(CandidateRecord can);

    List<CandidateRecord> getByCandidate(Long cId);

}
