package com.anabatic.itAssets.endpoint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.anabatic.generic.endpoint.contract.BaseResponse;
import com.anabatic.itAssets.endpoint.Request.GetByIdCandidateRequest;
import com.anabatic.itAssets.endpoint.Request.GetByIdFaqRequest;
import com.anabatic.itAssets.endpoint.Request.InsertCandidateRequest;
import com.anabatic.itAssets.endpoint.Request.InsertFaqRequest;
import com.anabatic.itAssets.endpoint.Request.RequestUpdateRequest;
import com.anabatic.itAssets.endpoint.Request.UpdateCandidateRequest;
import com.anabatic.itAssets.endpoint.converter.GetAllCandidateConverter;
import com.anabatic.itAssets.endpoint.converter.GetByIdCandidateConverter;
import com.anabatic.itAssets.endpoint.converter.InsertCandidateConverter;
import com.anabatic.itAssets.endpoint.converter.UpdateCandidateConverter;
import com.anabatic.itAssets.persistence.model.AssetsCategory;
import com.anabatic.itAssets.persistence.model.Candidate;
import com.anabatic.itAssets.persistence.model.Faq;
import com.anabatic.itAssets.persistence.model.Request;
import com.anabatic.itAssets.services.service.CandidateService;


@CrossOrigin(origins="*",allowedHeaders="*")
@RestController
@RequestMapping("/candidate")
public class CandidateController {
	@Autowired
	private CandidateService candidateService;

	@Autowired
	private InsertCandidateConverter insertCandidateConverter;
	
	@Autowired
	private GetByIdCandidateConverter getByIdCandidateConverter;
	
	@Autowired
	private GetAllCandidateConverter getAllCandidateConverter;
	
	@Autowired
	private UpdateCandidateConverter updateCandidateConverter;
	
	@PostMapping("/insert")
	public ResponseEntity<BaseResponse> insert(@RequestBody InsertCandidateRequest request) {
		Candidate can = insertCandidateConverter.toModel(request);
		Candidate can1 = candidateService.insert(can);
		BaseResponse baseResponse = new BaseResponse();
		baseResponse.setResponse(insertCandidateConverter.toContract(can1));
		return ResponseEntity.ok().body(baseResponse);
	}
	
	@PostMapping("/getById")
	public ResponseEntity<BaseResponse> getById(@RequestBody GetByIdCandidateRequest request) {
		Candidate can = getByIdCandidateConverter.toModel(request);
		Candidate can1 = candidateService.getById(can.getId());
		BaseResponse baseResponse = new BaseResponse();
		baseResponse.setResponse(getByIdCandidateConverter.toContract(can1));
		return ResponseEntity.ok().body(baseResponse);
	}
	
    @RequestMapping(value="/getAll", method=RequestMethod.GET)
    public ResponseEntity<BaseResponse> getAll() {
        List<Candidate> response = candidateService.getAll();
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setResponse(getAllCandidateConverter.toContracts(response));
        return ResponseEntity.ok().body(baseResponse);
    }
    
    @PostMapping("/update")
	public ResponseEntity<BaseResponse> update(@RequestBody UpdateCandidateRequest request) {
		Candidate request2 = updateCandidateConverter.toModel(request);
		Candidate request3 = candidateService.update(request2);
		BaseResponse baseResponse = new BaseResponse();
		baseResponse.setResponse(updateCandidateConverter.toContract(request3));
		return ResponseEntity.ok().body(baseResponse);
	}

}
