package com.anabatic.itAssets.endpoint.converter.impl;

import java.util.ArrayList;
import java.util.List;

import com.anabatic.itAssets.endpoint.Request.GetByStatusCandidateRecordRequest;
import com.anabatic.itAssets.endpoint.Response.GetAllRequestResponse;
import com.anabatic.itAssets.endpoint.Response.GetByStatusCandidateRecordResponse;
import com.anabatic.itAssets.endpoint.converter.GetByStatusCandidateRecordConverter;
import com.anabatic.itAssets.persistence.model.CandidateRecord;

public class GetByStatusCandidateRecordConverterImpl implements GetByStatusCandidateRecordConverter{

	@Override
	public CandidateRecord toModel(GetByStatusCandidateRecordRequest object) {
		// TODO Auto-generated method stub
		CandidateRecord cr=new CandidateRecord();
		cr.setStatus(object.getStatus());
		return cr;
	}

	@Override
	public List<CandidateRecord> toModels(List<GetByStatusCandidateRecordRequest> objects) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetByStatusCandidateRecordResponse toContract(CandidateRecord object) {
		// TODO Auto-generated method stub
		GetByStatusCandidateRecordResponse cr=new GetByStatusCandidateRecordResponse();
		cr.setData(object.getData());
		cr.setDate(object.getDate());
		cr.setId(object.getId());
		cr.setStatus(object.getStatus());
		//Users u=new Users();
		//u.setId(object.getUserId());
		cr.setcId(object.getcId().getId());
		cr.setHmUserId(object.getHmUserId().getId());
		cr.setrUserId(object.getrUserId().getId());
		cr.setComments(object.getComment());
		
		return cr;
	}

	@Override
	public List<GetByStatusCandidateRecordResponse> toContracts(List<CandidateRecord> objects) {
		List<GetByStatusCandidateRecordResponse> list = new ArrayList<>();
		objects.forEach(x -> list.add(toContract(x)));
		return list;
	}

}
