package com.anabatic.itAssets.endpoint.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anabatic.generic.endpoint.contract.BaseResponse;
import com.anabatic.itAssets.endpoint.Request.BulkStatusChangeRequest;
import com.anabatic.itAssets.endpoint.Request.HmApproveRequest;
import com.anabatic.itAssets.endpoint.Response.BulkStatusChangeResponse;
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
	private InsertCandidateConverter insertCandidateConverter;

	@Autowired
	private InsertCandidateRecordConverter insertCandidateRecordConverter;

	@PostMapping("HmApprove")
	public ResponseEntity<BaseResponse> HmApprove(@RequestBody HmApproveRequest request) {
		Candidate candidate = candidateService.getById(request.getcId());
		candidate.setStep(request.getStep());
		candidate.setStatus(request.getStatus());
		candidate.setComment(request.getComment());
		Candidate candidate2 = candidateService.update(candidate);
		BaseResponse baseResponse = new BaseResponse();
		baseResponse.setResponse(insertCandidateConverter.toContract(candidate2));
		return ResponseEntity.ok(baseResponse);

	}

	@PostMapping("update")
	public ResponseEntity<BaseResponse> update(@RequestBody List<BulkStatusChangeRequest> requests) {
		List<BulkStatusChangeResponse> responses = new ArrayList<>();
		for (BulkStatusChangeRequest request : requests) {
			Candidate candidate = candidateService.getById(request.getId());
			candidate.setSelectinStatus(1);
			CandidateBean bean = new CandidateBean();
			bean.setName(candidate.getName());
			bean.setEmail(candidate.getEmail());
			bean.setPhoneNo(candidate.getPhoneNo());
			bean.setSkills(candidate.getSkills());
			bean.setUsers(candidate.getUsers().getId());
			bean.setUsersr(candidate.getUsersr().getId());
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
			record.setComment(candidate.getComment());
			record.setData(string);
			record.setDate(new Date());
			Integer step = candidate.getStep();
			Integer recordStep = step - 1;
			record.setStatus(candidate.getStatus());
			record.setSteps(recordStep);
			record.setHmUserId(candidate.getUsers());
			record.setrUserId(candidate.getUsersr());
			CandidateRecord record2 = candidateRecordService.insert(record);
			BulkStatusChangeResponse response = new BulkStatusChangeResponse();
			response.setcRId(record2.getId());
			response.setId(candidate.getId());

		}
		BaseResponse baseResponse = new BaseResponse();
		baseResponse.setResponse(responses);
		return ResponseEntity.ok(baseResponse);
	}
}
