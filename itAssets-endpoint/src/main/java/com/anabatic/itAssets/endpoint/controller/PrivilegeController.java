package com.anabatic.itAssets.endpoint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.anabatic.generic.endpoint.contract.BaseResponse;
import com.anabatic.itAssets.endpoint.Request.GetByIdCandidateRequest;
import com.anabatic.itAssets.endpoint.Request.GetByStatusPrivilegeRequest;
import com.anabatic.itAssets.endpoint.converter.GetByStatusPrivilegeConverter;
import com.anabatic.itAssets.persistence.model.Candidate;
import com.anabatic.itAssets.persistence.model.Privilege;
import com.anabatic.itAssets.services.service.PrivilegeService;

@CrossOrigin(origins="*",allowedHeaders="*")
@RestController
@RequestMapping("/privilege")
public class PrivilegeController {
	
	@Autowired
	private GetByStatusPrivilegeConverter getByStatusPrivilegeConverter;
	
	@Autowired
	private PrivilegeService privilegeService;
	
	@RequestMapping(value = "/getbystatus", method = RequestMethod.GET)
	public ResponseEntity<BaseResponse> getByStatus(@RequestBody GetByStatusPrivilegeRequest request) {
		Privilege p = getByStatusPrivilegeConverter.toModel(request);
		List<Privilege> response = privilegeService.getByStatus(p);
		BaseResponse baseResponse = new BaseResponse();
		baseResponse.setResponse(getByStatusPrivilegeConverter.toContracts(response));
		return ResponseEntity.ok().body(baseResponse);
	}

}
