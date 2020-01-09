package com.anabatic.itAssets.endpoint.converter.impl;

import java.util.List;

import com.anabatic.itAssets.endpoint.Request.GetByCINCandidateRequest;
import com.anabatic.itAssets.endpoint.Response.GetByCINCandidateResponse;
import com.anabatic.itAssets.endpoint.converter.GetByCINCandidateConverter;
import com.anabatic.itAssets.persistence.model.Candidate;

public class GetByCINCandidateConverterImpl implements GetByCINCandidateConverter{

	@Override
	public Candidate toModel(GetByCINCandidateRequest object) {
		// TODO Auto-generated method stub
		Candidate can=new Candidate();
		can.setCin(object.getCin());
		return can;
	}

	@Override
	public List<Candidate> toModels(List<GetByCINCandidateRequest> objects) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetByCINCandidateResponse toContract(Candidate object) {
		// TODO Auto-generated method stub
		GetByCINCandidateResponse res=new GetByCINCandidateResponse();
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
		return res;
	}

	@Override
	public List<GetByCINCandidateResponse> toContracts(List<Candidate> objects) {
		// TODO Auto-generated method stub
		return null;
	}

}
