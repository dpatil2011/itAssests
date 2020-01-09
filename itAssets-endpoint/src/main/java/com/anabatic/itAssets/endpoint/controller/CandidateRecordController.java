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
import com.anabatic.itAssets.endpoint.Request.DeleteCandidateRecordRequest;
import com.anabatic.itAssets.endpoint.Request.GetByIdCandidateRecordRequest;
import com.anabatic.itAssets.endpoint.Request.GetByStatusCandidateRecordRequest;
import com.anabatic.itAssets.endpoint.Request.GetByStepCandidateRecordRequest;
import com.anabatic.itAssets.endpoint.Request.InsertCandidateRecordRequest;
import com.anabatic.itAssets.endpoint.Request.UpdateCandidateRecordRequest;
import com.anabatic.itAssets.endpoint.converter.DeleteCandidateRecordConverter;
import com.anabatic.itAssets.endpoint.converter.GetAllCandidateRecordConverter;
import com.anabatic.itAssets.endpoint.converter.GetByIdCandidateRecordConverter;
import com.anabatic.itAssets.endpoint.converter.GetByStatusCandidateRecordConverter;
import com.anabatic.itAssets.endpoint.converter.GetByStepCandidateRecordConverter;
import com.anabatic.itAssets.endpoint.converter.InsertCandidateRecordConverter;
import com.anabatic.itAssets.endpoint.converter.UpdateCandidateRecordConverter;
import com.anabatic.itAssets.persistence.model.CandidateRecord;
import com.anabatic.itAssets.services.service.CandidateRecordService;

@CrossOrigin(origins="*",allowedHeaders="*")
@RestController
@RequestMapping("/candidateRecord")
public class CandidateRecordController {
	@Autowired
	private CandidateRecordService candidateRecordService;

	@Autowired
	private InsertCandidateRecordConverter insertCandidateRecordConverter;
	
	@Autowired
	private GetByIdCandidateRecordConverter getByIdCandidateRecordConverter;
	
	@Autowired
	private GetByStatusCandidateRecordConverter getByStatusCandidateRecordConverter;
	
	@Autowired
	private GetByStepCandidateRecordConverter getByStepCandidateRecordConverter;
	
	@Autowired
	private UpdateCandidateRecordConverter updateCandidateRecordConverter;
	
	@Autowired
	private GetAllCandidateRecordConverter getAllCandidateRecordConverter;
	
	@Autowired
	private DeleteCandidateRecordConverter deleteCandidateRecordConverter;	


	
	@PostMapping("/insert")
	public ResponseEntity<BaseResponse> insert(@RequestBody InsertCandidateRecordRequest request) {
		CandidateRecord can = insertCandidateRecordConverter.toModel(request);
		CandidateRecord can1 = candidateRecordService.insert(can);
		BaseResponse baseResponse = new BaseResponse();
		baseResponse.setResponse(insertCandidateRecordConverter.toContract(can1));
		return ResponseEntity.ok().body(baseResponse);
	}
	
	@PostMapping("/getById")
	public ResponseEntity<BaseResponse> getById(@RequestBody GetByIdCandidateRecordRequest request) {
		CandidateRecord can = getByIdCandidateRecordConverter.toModel(request);
		CandidateRecord can1 = candidateRecordService.getById(can);
		BaseResponse baseResponse = new BaseResponse();
		baseResponse.setResponse(getByIdCandidateRecordConverter.toContract(can1));
		return ResponseEntity.ok().body(baseResponse);
	}
	
	@PostMapping("/getBy")
	public ResponseEntity<BaseResponse> getBy(@RequestBody GetByStatusCandidateRecordRequest request) {
		CandidateRecord can = getByStatusCandidateRecordConverter.toModel(request);
		List<CandidateRecord> can1 = candidateRecordService.getBy(can);
		BaseResponse baseResponse = new BaseResponse();
		baseResponse.setResponse(getByStatusCandidateRecordConverter.toContracts(can1));
		return ResponseEntity.ok().body(baseResponse);
	}
	
	@PostMapping("/update")
	public ResponseEntity<BaseResponse> update(@RequestBody UpdateCandidateRecordRequest request) {
		CandidateRecord request2 = updateCandidateRecordConverter.toModel(request);
		CandidateRecord request3 = candidateRecordService.update(request2);
		BaseResponse baseResponse = new BaseResponse();
		baseResponse.setResponse(updateCandidateRecordConverter.toContract(request3));
		return ResponseEntity.ok().body(baseResponse);
	}
	
	 @RequestMapping(value="/getAll", method=RequestMethod.GET)
	    public ResponseEntity<BaseResponse> getAll() {
	        List<CandidateRecord> response = candidateRecordService.getAll();
	        BaseResponse baseResponse = new BaseResponse();
	        baseResponse.setResponse(getAllCandidateRecordConverter.toContracts(response));
	        return ResponseEntity.ok().body(baseResponse);
	    }

	 @PostMapping("/delete")
	    public ResponseEntity<BaseResponse> delete(
	            @RequestBody DeleteCandidateRecordRequest request) {
		 CandidateRecord request2 = deleteCandidateRecordConverter.toModel(request);
	        candidateRecordService.delete(request2);
	        BaseResponse baseResponse = new BaseResponse();
	        baseResponse.setResponse("Operation performed Successfully");
	        return ResponseEntity.ok().body(baseResponse);
	    }
	 @PostMapping("/getByStatus")
	 public ResponseEntity<BaseResponse> getByStatus(@RequestBody GetByStatusCandidateRecordRequest request) {
			CandidateRecord req = getByStatusCandidateRecordConverter.toModel(request);
			List<CandidateRecord> can = candidateRecordService.getByStatus(req);
			BaseResponse baseResponse = new BaseResponse();
			baseResponse.setResponse(getByStatusCandidateRecordConverter.toContracts(can));
			return ResponseEntity.ok().body(baseResponse);
	 }
	 
	 @PostMapping("/getByStep")
	 public ResponseEntity<BaseResponse> getByStep(@RequestBody GetByStepCandidateRecordRequest request) {
			CandidateRecord req = getByStepCandidateRecordConverter.toModel(request);
			List<CandidateRecord> can = candidateRecordService.getByStep(req);
			BaseResponse baseResponse = new BaseResponse();
			baseResponse.setResponse(getByStatusCandidateRecordConverter.toContracts(can));
			return ResponseEntity.ok().body(baseResponse);
	 }
}
