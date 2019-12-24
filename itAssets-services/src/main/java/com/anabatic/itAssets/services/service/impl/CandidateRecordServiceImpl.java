package com.anabatic.itAssets.services.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.anabatic.itAssets.persistence.dao.CandidateRecordDao;
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
}
