package com.anabatic.itAssets.endpoint.converter.impl;

import java.util.List;

import com.anabatic.itAssets.endpoint.Request.GetByIdCandidateRecordRequest;
import com.anabatic.itAssets.endpoint.Response.GetByIdCandidateRecordRespone;
import com.anabatic.itAssets.endpoint.converter.GetByIdCandidateRecordConverter;
import com.anabatic.itAssets.persistence.model.CandidateRecord;

public class GetByIdCandidateRecordConverterImpl implements GetByIdCandidateRecordConverter{

	@Override
	public CandidateRecord toModel(GetByIdCandidateRecordRequest object) {
		// TODO Auto-generated method stub
		CandidateRecord cr=new CandidateRecord();
		cr.setId(object.getId());
		return cr;
	}

	@Override
	public List<CandidateRecord> toModels(List<GetByIdCandidateRecordRequest> objects) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetByIdCandidateRecordRespone toContract(CandidateRecord object) {
		// TODO Auto-generated method stub
		GetByIdCandidateRecordRespone cr=new GetByIdCandidateRecordRespone();
		cr.setData(object.getData());
		cr.setDate(object.getDate());
		cr.setId(object.getId());
		cr.setStatus(object.getStatus());
		//Users u=new Users();
		//u.setId(object.getUserId());
		cr.setcId(object.getcId().getId());
		cr.setHmUserId(object.getHmUserId().getId());
		cr.setrUserId(object.getrUserId().getId());
		
		return cr;
	}

	@Override
	public List<GetByIdCandidateRecordRespone> toContracts(List<CandidateRecord> objects) {
		// TODO Auto-generated method stub
		return null;
	}

}
