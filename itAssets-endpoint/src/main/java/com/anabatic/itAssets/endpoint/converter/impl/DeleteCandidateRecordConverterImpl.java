package com.anabatic.itAssets.endpoint.converter.impl;

import java.util.List;

import com.anabatic.itAssets.endpoint.Request.DeleteCandidateRecordRequest;
import com.anabatic.itAssets.endpoint.converter.DeleteCandidateRecordConverter;
import com.anabatic.itAssets.persistence.model.CandidateRecord;

public class DeleteCandidateRecordConverterImpl implements DeleteCandidateRecordConverter{

	@Override
	public CandidateRecord toModel(DeleteCandidateRecordRequest object) {
		CandidateRecord candidateRecord = new CandidateRecord();
		candidateRecord.setId(object.getId());
		return candidateRecord;
	}

	@Override
	public List<CandidateRecord> toModels(List<DeleteCandidateRecordRequest> objects) {
		// TODO Auto-generated method stub
		return null;
	}

}
