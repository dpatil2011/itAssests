package com.anabatic.itAssets.endpoint.converter.impl;

import java.util.ArrayList;
import java.util.List;

import com.anabatic.itAssets.endpoint.Request.GetByStepCandidateRecordRequest;
import com.anabatic.itAssets.endpoint.Response.GetByStatusCandidateRecordResponse;
import com.anabatic.itAssets.endpoint.Response.GetByStepCandidateRecordResponse;
import com.anabatic.itAssets.endpoint.converter.GetByStepCandidateRecordConverter;
import com.anabatic.itAssets.persistence.model.CandidateRecord;

public class GetByStepCandidateRecordConverterImpl implements GetByStepCandidateRecordConverter{

	@Override
	public CandidateRecord toModel(GetByStepCandidateRecordRequest object) {
		// TODO Auto-generated method stub
		CandidateRecord cr=new CandidateRecord();
		cr.setSteps(object.getStep());
		return cr;
	}

	@Override
	public List<CandidateRecord> toModels(List<GetByStepCandidateRecordRequest> objects) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetByStepCandidateRecordResponse toContract(CandidateRecord object) {
		// TODO Auto-generated method stub
		GetByStepCandidateRecordResponse cr=new GetByStepCandidateRecordResponse();
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
	public List<GetByStepCandidateRecordResponse> toContracts(List<CandidateRecord> objects) {
		List<GetByStepCandidateRecordResponse> list = new ArrayList<>();
		objects.forEach(x -> list.add(toContract(x)));
		return list;
	}

}
