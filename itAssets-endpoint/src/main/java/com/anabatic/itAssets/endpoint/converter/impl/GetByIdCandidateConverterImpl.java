package com.anabatic.itAssets.endpoint.converter.impl;

import java.util.List;

import com.anabatic.itAssets.endpoint.Request.GetByIdCandidateRequest;
import com.anabatic.itAssets.endpoint.Response.GetByIdCandidateResponse;
import com.anabatic.itAssets.endpoint.Response.InsertCandidateResponse;
import com.anabatic.itAssets.endpoint.converter.GetByIdCandidateConverter;
import com.anabatic.itAssets.persistence.model.Candidate;

public class GetByIdCandidateConverterImpl implements GetByIdCandidateConverter{

	@Override
	public Candidate toModel(GetByIdCandidateRequest object) {
		// TODO Auto-generated method stub
		Candidate can=new Candidate();
		can.setId(object.getId());
		return can;
	}

	@Override
	public List<Candidate> toModels(List<GetByIdCandidateRequest> objects) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetByIdCandidateResponse toContract(Candidate object) {
		// TODO Auto-generated method stub
		GetByIdCandidateResponse res=new GetByIdCandidateResponse();
		res.setId(object.getId());
		res.setComment(object.getComment());
		res.setEmail(object.getEmail());
		res.setExperience(object.getExperience());
		res.setName(object.getName());
		res.setPhoneNo(object.getPhoneNo());
		res.setSkills(object.getSkills());
		res.setStatus(object.getStatus());
		res.setHmId(object.getHmUsers().getId());
		res.setrId(object.getrUsers().getId());
		return res;
		
	}

	@Override
	public List<GetByIdCandidateResponse> toContracts(List<Candidate> objects) {
		// TODO Auto-generated method stub
		return null;
	}

}
