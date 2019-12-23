package com.anabatic.itAssets.endpoint.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anabatic.generic.endpoint.contract.BaseResponse;
import com.anabatic.itAssets.endpoint.Request.InsertCandidateRequest;
import com.anabatic.itAssets.endpoint.Request.InsertFaqRequest;
import com.anabatic.itAssets.endpoint.converter.InsertCandidateConverter;
import com.anabatic.itAssets.persistence.model.Candidate;
import com.anabatic.itAssets.persistence.model.Faq;
import com.anabatic.itAssets.services.service.CandidateService;


@CrossOrigin(origins="*",allowedHeaders="*")
@RestController
@RequestMapping("/candidate")
public class CandidateController {
	@Autowired
	private CandidateService candidateService;

	@Autowired
	private InsertCandidateConverter insertCandidateConverter;
	
	@PostMapping("/insert")
	public ResponseEntity<BaseResponse> insert(@RequestBody InsertCandidateRequest request) {
		Candidate can = insertCandidateConverter.toModel(request);
		Candidate can1 = candidateService.insert(can);
		BaseResponse baseResponse = new BaseResponse();
		baseResponse.setResponse(insertCandidateConverter.toContract(can1));
		return ResponseEntity.ok().body(baseResponse);
	}


}
