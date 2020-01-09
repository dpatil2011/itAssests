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
			GetAllCandidateResponse res = new GetAllCandidateResponse();			
			res.setId(object.getId());
			res.setComment(object.getComment());
			res.setEmail(object.getEmail());
			res.setExperience(object.getExperience());
			res.setName(object.getName());
			res.setPhoneNo(object.getPhoneNo());
			res.setSkills(object.getSkills());
			res.setStatus(object.getStatus());
			res.setManagerId(object.getUsers().getId());
			res.setRecruiterId(object.getUsersr().getId());
			res.setFileName(object.getFileName());
			res.setFilesize(object.getFilesize());
			res.setFileType(object.getFileType());
			res.setSlot(object.getSlot());
			res.setUploadDir(object.getUploadDir());
			res.setInterviewDate(object.getInterviewDate());
			res.setDateOfJoining(object.getDateOfJoining());
			res.setModeOfInterview(object.getModeOfInterview());
			res.setCin(object.getCin());			
			list.add(res);

		}		
		return list;
	}

}
