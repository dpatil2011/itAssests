package com.anabatic.itAssets.endpoint.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anabatic.generic.endpoint.contract.BaseResponse;
import com.anabatic.itAssets.endpoint.Request.HmApproveRequest;
import com.anabatic.itAssets.endpoint.converter.InsertCandidateConverter;
import com.anabatic.itAssets.endpoint.converter.InsertCandidateRecordConverter;
import com.anabatic.itAssets.endpoint.param.bean.CandidateBean;
import com.anabatic.itAssets.persistence.model.Candidate;
import com.anabatic.itAssets.persistence.model.CandidateRecord;
import com.anabatic.itAssets.services.service.CandidateRecordService;
import com.anabatic.itAssets.services.service.CandidateService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/interview")
public class InterviewController {

	@Autowired
	private CandidateService candidateService;

	@Autowired
	private CandidateRecordService candidateRecordService;

	@Autowired
	private InsertCandidateRecordConverter insertCandidateRecordConverter;

	@PostMapping("")
	public ResponseEntity<BaseResponse> HmApprove(@RequestBody HmApproveRequest request) {
		Candidate candidate = candidateService.getById(request.getcId());
		candidate.setStep(request.getStep());
		candidate.setStatus(request.getStatus());
		candidateService.update(candidate);
		CandidateBean bean=new CandidateBean();
		bean.setName(candidate.getName());
		bean.setEmail(candidate.getEmail());
		bean.setPhoneNo(candidate.getPhoneNo());
		bean.setSkills(candidate.getSkills());
		bean.setUsers(candidate.getUsers());
		bean.setUsersr(candidate.getUsersr());
		bean.setComment(candidate.getComment());
		bean.setFileName(candidate.getFileName());
		bean.setUploadDir(candidate.getUploadDir());
		bean.setFileType(candidate.getFileType());
		bean.setFilesize(candidate.getFilesize());
		bean.setInterviewDate(candidate.getInterviewDate());
		bean.setInterviewStartTime(candidate.getInterviewStartTime());
		bean.setInterviewEndTime(candidate.getInterviewEndTime());
		bean.setModeOfInterview(candidate.getModeOfInterview());
		bean.setSlot(candidate.getSlot());
		bean.setDateOfJoining(candidate.getDateOfJoining());
		bean.setCin(candidate.getCin());
		bean.setStep(candidate.getStep());	
		ObjectMapper objectMapper = new ObjectMapper();
		String string = null;
		try {
			string = objectMapper.writeValueAsString(bean);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		CandidateRecord record = new CandidateRecord();
		record.setcId(candidate);
		record.setComment(request.getComment());
		record.setData(string);
		record.setDate(new Date());
		Integer step = request.getStep();
		Integer recordStep = step - 1;
		record.setStatus(request.getStatus());
		record.setSteps(recordStep);
		record.setHmUserId(candidate.getUsers());
		record.setrUserId(candidate.getUsersr());
		CandidateRecord record2 = candidateRecordService.insert(record);
		BaseResponse baseResponse = new BaseResponse();
		baseResponse.setResponse(insertCandidateRecordConverter.toContract(record2));
		return ResponseEntity.ok(baseResponse);
	}
}
