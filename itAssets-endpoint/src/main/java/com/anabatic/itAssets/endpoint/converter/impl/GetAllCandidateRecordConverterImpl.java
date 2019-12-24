package com.anabatic.itAssets.endpoint.converter.impl;

import java.util.ArrayList;
import java.util.List;

import com.anabatic.itAssets.endpoint.Response.GetAllCandidateRecordResponse;
import com.anabatic.itAssets.endpoint.converter.GetAllCandidateRecordConverter;
import com.anabatic.itAssets.persistence.model.CandidateRecord;

public class GetAllCandidateRecordConverterImpl  implements GetAllCandidateRecordConverter{

	@Override
	public GetAllCandidateRecordResponse toContract(CandidateRecord object) {
		// TODO Auto-generated method stub
		GetAllCandidateRecordResponse cr=new GetAllCandidateRecordResponse();
		cr.setData(object.getData());
		cr.setDate(object.getDate());
		cr.setId(object.getId());
		cr.setStatus(object.getStatus());
		cr.setUserId(object.getUserId().getId());
		return cr;
		
	}

	@Override
	public List<GetAllCandidateRecordResponse> toContracts(List<CandidateRecord> objects) {
		// TODO Auto-generated method stub
		
		List<GetAllCandidateRecordResponse> list = new ArrayList<>();
		objects.forEach(x -> list.add(toContract(x)));
		return list;

		
	}

}
