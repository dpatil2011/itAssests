package com.anabatic.itAssets.persistence.dao;

import java.util.List;

import com.anabatic.itAssets.persistence.model.CandidateRecord;

public interface CandidateRecordDao {

	public CandidateRecord insert(CandidateRecord record);

	public CandidateRecord getById(CandidateRecord record);

	public List<CandidateRecord> getAll();

	public void delete(CandidateRecord record);

}
