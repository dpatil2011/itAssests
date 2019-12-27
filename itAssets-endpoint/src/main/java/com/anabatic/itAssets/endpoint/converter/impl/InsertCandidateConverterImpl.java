package com.anabatic.itAssets.endpoint.converter.impl;

import java.util.List;

import com.anabatic.itAssets.endpoint.Request.InsertCandidateRequest;
import com.anabatic.itAssets.endpoint.Response.InsertCandidateResponse;
import com.anabatic.itAssets.endpoint.converter.InsertCandidateConverter;
import com.anabatic.itAssets.persistence.model.Candidate;
import com.anabatic.itAssets.persistence.model.Users;

public class InsertCandidateConverterImpl implements InsertCandidateConverter {

	@Override
	public Candidate toModel(InsertCandidateRequest object) {
		Candidate c=new Candidate();
		c.setId(object.getId());
		c.setComment(object.getComment());
		c.setEmail(object.getEmail());
		c.setExperience(object.getExperience());
		c.setName(object.getName());
		c.setPhoneNo(object.getPhoneNo());
		c.setSkills(object.getSkills());
		c.setStatus(object.getStatus());
		Users u = new Users();
		u.setId(object.getManagerId());
		c.setUsers(u);
		return c;
	}

	@Override
	public List<Candidate> toModels(List<InsertCandidateRequest> objects) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InsertCandidateResponse toContract(Candidate object) {
		// TODO Auto-generated method stub
		InsertCandidateResponse res=new InsertCandidateResponse();
		res.setId(object.getId());
		res.setComment(object.getComment());
		res.setEmail(object.getEmail());
		res.setExperience(object.getExperience());
		res.setName(object.getName());
		res.setPhoneNo(object.getPhoneNo());
		res.setSkills(object.getSkills());
		res.setStatus(object.getStatus());
		res.setManagerId(object.getUsers().getId());
		res.setFileName(object.getFileName());
		res.setFilesize(object.getFilesize());
		res.setFileType(object.getFileType());
		res.setUploadDir(object.getUploadDir());
		return res;
	}

	@Override
	public List<InsertCandidateResponse> toContracts(List<Candidate> objects) {
		// TODO Auto-generated method stub
		return null;
	}

}
