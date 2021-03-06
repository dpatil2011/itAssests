package com.anabatic.itAssets.endpoint.converter.impl;

import java.util.ArrayList;
import java.util.List;

import com.anabatic.itAssets.endpoint.Request.InsertCandidateRequest;
import com.anabatic.itAssets.endpoint.Response.InsertCandidateResponse;
import com.anabatic.itAssets.endpoint.converter.InsertCandidateConverter;
import com.anabatic.itAssets.endpoint.param.bean.CommentBean;
import com.anabatic.itAssets.persistence.model.Candidate;
import com.anabatic.itAssets.persistence.model.Users;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class InsertCandidateConverterImpl implements InsertCandidateConverter {

	@Override
	public Candidate toModel(InsertCandidateRequest object) {
		Candidate c = new Candidate();
		c.setComment(object.getComment());
		c.setEmail(object.getEmail());
		c.setExperience(object.getExperience());
		c.setName(object.getName());
		c.setPhoneNo(object.getPhoneNo());
		c.setSkills(object.getSkills());
		c.setStatus(object.getStatus());
		c.setCin(object.getCin());
		c.setStep(object.getStep());
		c.setStatus(object.getStatus());
		c.setDateOfJoining(object.getDoj());
		c.setInterviewDate(object.getInterviewDate());
		c.setInterviewStartTime(object.getInterviewStartTime());
		c.setInterviewEndTime(object.getInterviewEndTime());
		c.setModeOfInterview(object.getModeOfInterview());
		c.setUploadDir(object.getUploadDir());
		c.setFileName(object.getFileName());
		c.setFileType(object.getFileType());
		c.setFilesize(object.getFileSize());
		Users u = new Users();
		u.setId(object.getHmId());
		c.setUsers(u);
		Users users= new Users();
		users.setId(object.getrId());
		c.setUsersr(users);
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
		InsertCandidateResponse res = new InsertCandidateResponse();
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
