package com.anabatic.itAssets.persistence.dao;

import java.util.List;

import com.anabatic.itAssets.persistence.model.CandidateRecord;

public interface CandidateRecordDao {

	public CandidateRecord insert(CandidateRecord record);

	public CandidateRecord getById(CandidateRecord record);

	public List<CandidateRecord> getAll();

	public void delete(CandidateRecord record);

	public List<CandidateRecord> getByStatus(Integer status);

	public List<CandidateRecord> getByStep(CandidateRecord req);

	

	public List<CandidateRecord> getBy(CandidateRecord can);

}
