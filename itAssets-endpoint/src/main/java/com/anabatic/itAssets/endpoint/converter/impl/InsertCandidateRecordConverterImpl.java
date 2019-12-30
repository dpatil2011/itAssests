package com.anabatic.itAssets.endpoint.converter.impl;

import java.util.List;

import com.anabatic.itAssets.endpoint.Request.InsertCandidateRecordRequest;
import com.anabatic.itAssets.endpoint.Response.InsertCandidateRecordResponse;
import com.anabatic.itAssets.endpoint.converter.InsertCandidateRecordConverter;
import com.anabatic.itAssets.persistence.model.Candidate;
import com.anabatic.itAssets.persistence.model.CandidateRecord;
import com.anabatic.itAssets.persistence.model.Users;

public class InsertCandidateRecordConverterImpl implements InsertCandidateRecordConverter {

	@Override
	public CandidateRecord toModel(InsertCandidateRecordRequest object) {
		// TODO Auto-generated method stub
		CandidateRecord cr=new CandidateRecord();
		cr.setData(object.getData());
		cr.setDate(object.getDate());
		cr.setId(object.getId());
		cr.setStatus(object.getStatus());
		Users u=new Users();
		u.setId(object.getHmUserId());
		cr.setHmUserId(u);
		Users u1=new Users();
		u1.setId(object.getrUserId());
		cr.setrUserId(u1);
		Candidate c=new Candidate();
		c.setId(object.getcId());
		cr.setcId(c);
		return cr;
	}

	@Override
	public List<CandidateRecord> toModels(List<InsertCandidateRecordRequest> objects) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InsertCandidateRecordResponse toContract(CandidateRecord object) {
		// TODO Auto-generated method stub
		InsertCandidateRecordResponse cr=new InsertCandidateRecordResponse();
		cr.setData(object.getData());
		cr.setDate(object.getDate());
		cr.setId(object.getId());
		cr.setStatus(object.getStatus());
		//Users u=new Users();
		//u.setId(object.getUserId());
		cr.setHmUserId(object.getHmUserId().getId());
		cr.setrUserId(object.getrUserId().getId());
		cr.setcId(object.getcId().getId());
		return cr;
	}

	@Override
	public List<InsertCandidateRecordResponse> toContracts(List<CandidateRecord> objects) {
		// TODO Auto-generated method stub
		return null;
	}

}
