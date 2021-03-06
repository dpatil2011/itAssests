package com.anabatic.itAssets.services.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.anabatic.itAssets.persistence.dao.CandidateRecordDao;
import com.anabatic.itAssets.persistence.model.Candidate;
import com.anabatic.itAssets.persistence.model.CandidateRecord;
import com.anabatic.itAssets.services.service.CandidateRecordService;

public class CandidateRecordServiceImpl implements CandidateRecordService {

	@Autowired
	private CandidateRecordDao candidateRecordDao;

	@Override
	public CandidateRecord insert(CandidateRecord record) {
		CandidateRecord record2 = candidateRecordDao.insert(record);
		return record2;
	}

	@Override
	public CandidateRecord update(CandidateRecord record) {
		CandidateRecord record2 = candidateRecordDao.insert(record);
		return record2;
	}

	@Override
	public CandidateRecord getById(CandidateRecord record) {
		CandidateRecord record2 = candidateRecordDao.getById(record);
		return record2;
	}

	@Override
	public List<CandidateRecord> getAll() {
		List<CandidateRecord> list = candidateRecordDao.getAll();
		return list;
	}

	@Override
	public void delete(CandidateRecord record) {
		candidateRecordDao.delete(record);
	}

	@Override
	public List<CandidateRecord> getByStatus(CandidateRecord req) {
		List<CandidateRecord> record2 = candidateRecordDao.getByStatus(req.getStatus());
		return record2;
	}
	
	@Override
	public List<CandidateRecord> getByStep(CandidateRecord req) {
		List<CandidateRecord> record2 = candidateRecordDao.getByStep(req);
		return record2;
	}

	@Override
	public List<CandidateRecord> getBy(CandidateRecord can) {
		List<CandidateRecord> list = candidateRecordDao.getBy(can);
		return list;
	}
	@Override
    public List<CandidateRecord> getByCandidate(Long cId) {
        List<CandidateRecord> record2 = candidateRecordDao.getByCandidate(cId);
        return record2;
    }
}
