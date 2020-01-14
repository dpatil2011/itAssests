package com.anabatic.itAssets.endpoint.converter.impl;

import java.util.ArrayList;
import java.util.List;

import com.anabatic.itAssets.endpoint.Request.UpdateCandidateRequest;
import com.anabatic.itAssets.endpoint.Response.UpdateCandidateResponse;
import com.anabatic.itAssets.endpoint.converter.UpdateCandidateConverter;
import com.anabatic.itAssets.persistence.model.Candidate;
import com.anabatic.itAssets.persistence.model.Users;

public class UpdateCandidateConverterImpl implements UpdateCandidateConverter {

	@Override
	public Candidate toModel(UpdateCandidateRequest object) {
		Candidate c=new Candidate();
		c.setId(object.getId());
		c.setComment(object.getComment());
		c.setEmail(object.getEmail());
		c.setExperience(object.getExperience());
		c.setName(object.getName());
		c.setPhoneNo(object.getPhoneNo());
		c.setSkills(object.getSkills());
		c.setStatus(object.getStatus());
		c.setSlot(object.getSlot());
		Users u = new Users();
		u.setId(object.getManagerId());
		c.setUsers(u);
		return c;
	}
	
	@Override
	public List<Candidate> toModels(List<UpdateCandidateRequest> objects) {
		List<Candidate> models = new ArrayList<>();
		objects.forEach(object->{
			models.add(toModel(object));
		});
		return models;
	}

	@Override
	public UpdateCandidateResponse toContract(Candidate object) {
		// TODO Auto-generated method stub
		UpdateCandidateResponse res=new UpdateCandidateResponse();
		res.setId(object.getId());
		res.setComment(object.getComment());
		res.setEmail(object.getEmail());
		res.setExperience(object.getExperience());
		res.setName(object.getName());
		res.setPhoneNo(object.getPhoneNo());
		res.setSkills(object.getSkills());
		res.setStatus(object.getStatus());
		res.setManagerId(object.getUsers().getId());
		return res;
	}

	@Override
	public List<UpdateCandidateResponse> toContracts(List<Candidate> objects) {
		List<UpdateCandidateResponse> contracts = new ArrayList<>();
		objects.forEach(object->{
			contracts.add(toContract(object));
		});
		return contracts;
	}

}
