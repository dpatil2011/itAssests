package com.anabatic.itAssets.services.service;

import java.util.List;

import com.anabatic.itAssets.persistence.model.CandidateRecord;

public interface CandidateRecordService {

	public CandidateRecord insert(CandidateRecord record);

	public CandidateRecord update(CandidateRecord record);

	public CandidateRecord getById(CandidateRecord record);

	public List<CandidateRecord> getAll();

	public void delete(CandidateRecord record);

}
