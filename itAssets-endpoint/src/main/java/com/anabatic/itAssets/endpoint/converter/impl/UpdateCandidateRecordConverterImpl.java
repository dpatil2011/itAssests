package com.anabatic.itAssets.endpoint.converter.impl;

import java.util.List;

import com.anabatic.itAssets.endpoint.Request.UpdateCandidateRecordRequest;
import com.anabatic.itAssets.endpoint.Response.InsertCandidateRecordResponse;
import com.anabatic.itAssets.endpoint.Response.UpdateCandidateRecordResponse;
import com.anabatic.itAssets.endpoint.converter.UpdateCandidateRecordConverter;
import com.anabatic.itAssets.persistence.model.CandidateRecord;
import com.anabatic.itAssets.persistence.model.Users;

public class UpdateCandidateRecordConverterImpl  implements UpdateCandidateRecordConverter{

	@Override
	public CandidateRecord toModel(UpdateCandidateRecordRequest object) {
		CandidateRecord cr=new CandidateRecord();
		cr.setData(object.getData());
		cr.setDate(object.getDate());
		cr.setId(object.getId());
		cr.setStatus(object.getStatus());
		Users u=new Users();
		u.setId(object.getUserId());
		cr.setUserId(u);
		return cr;
	}

	@Override
	public List<CandidateRecord> toModels(List<UpdateCandidateRecordRequest> objects) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UpdateCandidateRecordResponse toContract(CandidateRecord object) {
		UpdateCandidateRecordResponse cr=new UpdateCandidateRecordResponse();
		cr.setData(object.getData());
		cr.setDate(object.getDate());
		cr.setId(object.getId());
		cr.setStatus(object.getStatus());
		//Users u=new Users();
		//u.setId(object.getUserId());
		cr.setUserId(object.getUserId().getId());
		return cr;
	}

	@Override
	public List<UpdateCandidateRecordResponse> toContracts(List<CandidateRecord> objects) {
		// TODO Auto-generated method stub
		return null;
	}

}
