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
import com.anabatic.itAssets.endpoint.Request.PrivilegeTypeRequest;
import com.anabatic.itAssets.endpoint.Request.RequestId;
import com.anabatic.itAssets.endpoint.converter.PrivilegeConverter;
import com.anabatic.itAssets.persistence.model.PrivilegeType;
import com.anabatic.itAssets.services.service.PrivilegeTypeService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/priviledge")
public class PrivilegeController {
	@Autowired
	private PrivilegeTypeService privilegeTypeService;

	@Autowired
	private PrivilegeConverter privilegeConverter;

	@PostMapping("/insert")
	public ResponseEntity<BaseResponse> insert(@RequestBody PrivilegeTypeRequest request) {
		PrivilegeType insert = privilegeConverter.toModel(request);
		PrivilegeType response = privilegeTypeService.insert(insert);
		BaseResponse baseResponse = new BaseResponse();
		baseResponse.setResponse(privilegeConverter.toContract(response));
		return ResponseEntity.ok().body(baseResponse);
	}

	@RequestMapping(value = "/getall", method = RequestMethod.GET)
	public ResponseEntity<BaseResponse> getAll() {
		List<PrivilegeType> response = privilegeTypeService.getAll();
		BaseResponse baseResponse = new BaseResponse();
		baseResponse.setResponse(privilegeConverter.toContracts(response));
		return ResponseEntity.ok().body(baseResponse);
	}

	@RequestMapping(value = "/getbystatus", method = RequestMethod.GET)
	public ResponseEntity<BaseResponse> getAllByStatus() {
		List<PrivilegeType> response = privilegeTypeService.getAllByStatus();
		BaseResponse baseResponse = new BaseResponse();
		baseResponse.setResponse(privilegeConverter.toContracts(response));
		return ResponseEntity.ok().body(baseResponse);
	}
	
	@PostMapping("/delete")
    public ResponseEntity<BaseResponse> delete(
            @RequestBody RequestId request) {
	    privilegeTypeService.delete(request.getId());
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setResponse("Operation performed Successfully");
        return ResponseEntity.ok().body(baseResponse);
    }
    
}
