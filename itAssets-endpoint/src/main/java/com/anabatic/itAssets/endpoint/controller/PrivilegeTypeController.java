package com.anabatic.itAssets.endpoint.controller;

import java.util.ArrayList;
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
import com.anabatic.itAssets.endpoint.Request.GetByIdPrivilegeTypeRequest;
import com.anabatic.itAssets.endpoint.Request.GetUserByPrivilegeTypeRequest;
import com.anabatic.itAssets.endpoint.Request.PrivilegeTypeRequest;
import com.anabatic.itAssets.endpoint.Request.RequestId;
import com.anabatic.itAssets.endpoint.Response.GetAllUsersResponse;
import com.anabatic.itAssets.endpoint.converter.GetAllUsersConverter;
import com.anabatic.itAssets.endpoint.converter.GetByIdPriviligesTypeConverter;
import com.anabatic.itAssets.endpoint.converter.PrivilegeConverter;
import com.anabatic.itAssets.persistence.model.Privilege;
import com.anabatic.itAssets.persistence.model.PrivilegeType;
import com.anabatic.itAssets.persistence.model.Users;
import com.anabatic.itAssets.services.service.PrivilegeService;
import com.anabatic.itAssets.services.service.PrivilegeTypeService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/priviledge")
public class PrivilegeTypeController {
	@Autowired
	private PrivilegeTypeService privilegeTypeService;

	@Autowired
	private PrivilegeService privilegeService;

	@Autowired
	private PrivilegeConverter privilegeConverter;

	@Autowired
	private GetByIdPriviligesTypeConverter getByIdPriviligesTypeConverter;

	@Autowired
	private GetAllUsersConverter GetAllUsersConverter;

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

	@RequestMapping(value = "/getById", method = RequestMethod.GET)
	public ResponseEntity<BaseResponse> getById(@RequestBody GetByIdPrivilegeTypeRequest request) {
		PrivilegeType can = getByIdPriviligesTypeConverter.toModel(request);
		PrivilegeType can1 = privilegeTypeService.getById(can.getId());
		BaseResponse baseResponse = new BaseResponse();
		baseResponse.setResponse(getByIdPriviligesTypeConverter.toContract(can1));
		return ResponseEntity.ok().body(baseResponse);
	}

	@PostMapping("/delete")
	public ResponseEntity<BaseResponse> delete(@RequestBody RequestId request) {
		privilegeTypeService.delete(request.getId());
		BaseResponse baseResponse = new BaseResponse();
		baseResponse.setResponse("Operation performed Successfully");
		return ResponseEntity.ok().body(baseResponse);
	}

	@PostMapping("/getUserByType")
	public ResponseEntity<BaseResponse> getUserByType(@RequestBody GetUserByPrivilegeTypeRequest request) {
		List<Privilege> privList = privilegeTypeService.getAllPrivilegeByType(request.getPrivilageType());
		List<Users> userList = new ArrayList<Users>();
		for (Privilege privilage : privList) {
			userList.add(privilage.getUsers());
		}
		List<GetAllUsersResponse> contracts = GetAllUsersConverter.toContracts(userList);
		BaseResponse baseResponse = new BaseResponse();
		baseResponse.setResponse(contracts);
		return ResponseEntity.ok().body(baseResponse);
	}
}
