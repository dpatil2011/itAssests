package com.anabatic.itAssets.endpoint.converter.impl;

import java.util.ArrayList;
import java.util.List;

import com.anabatic.itAssets.endpoint.Request.InsertCandidateRequest;
import com.anabatic.itAssets.endpoint.Request.SkillBean;
import com.anabatic.itAssets.endpoint.Request.UsersRequest;
import com.anabatic.itAssets.endpoint.Response.GetAllCandidateResponse;
import com.anabatic.itAssets.endpoint.Response.GetAllUsersResponse;
import com.anabatic.itAssets.endpoint.converter.GetAllCandidateConverter;
import com.anabatic.itAssets.persistence.model.Candidate;
import com.anabatic.itAssets.persistence.model.Skills;
import com.anabatic.itAssets.persistence.model.Users;

public class GetAllCandidateConverterImpl implements GetAllCandidateConverter {

	@Override
	public Candidate toModel(InsertCandidateRequest object) {
		return null;
	}

	@Override
	public List<Candidate> toModels(List<InsertCandidateRequest> objects) {
		
		return null;
	}

	@Override
	public GetAllCandidateResponse  toContract(Candidate object) {
		return null;
	}

	@Override
	public List<GetAllCandidateResponse> toContracts(List<Candidate> objects) {
		List<GetAllCandidateResponse> list = new ArrayList<>(objects.size());
		
		for(Candidate object : objects) {
			GetAllCandidateResponse can = new GetAllCandidateResponse();			
			can.setId(object.getId());
			can.setId(object.getId());
			can.setComment(object.getComment());
			can.setEmail(object.getEmail());
			can.setExperience(object.getExperience());
			can.setName(object.getName());
			can.setPhoneNo(object.getPhoneNo());
			can.setSkills(object.getSkills());
			can.setStatus(object.getStatus());
			can.setManagerId(object.getUsers().getId());
			list.add(can);
		}		
		return list;
	}

}
