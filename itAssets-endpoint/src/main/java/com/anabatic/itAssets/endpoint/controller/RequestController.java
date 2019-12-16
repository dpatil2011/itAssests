package com.anabatic.itAssets.endpoint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anabatic.generic.endpoint.contract.BaseResponse;
import com.anabatic.itAssets.endpoint.Request.InsertRequestRequest;
import com.anabatic.itAssets.endpoint.Request.RequestDeleteRequest;
import com.anabatic.itAssets.endpoint.Request.RequestGetByIdRequest;
import com.anabatic.itAssets.endpoint.Request.RequestUpdateRequest;
import com.anabatic.itAssets.endpoint.converter.DeleteRequestConverter;
import com.anabatic.itAssets.endpoint.converter.GetAllRequestConverter;
import com.anabatic.itAssets.endpoint.converter.GetByIdRequestConverter;
import com.anabatic.itAssets.endpoint.converter.InsertRequestConverter;
import com.anabatic.itAssets.endpoint.converter.UpdateRequestConverter;
import com.anabatic.itAssets.persistence.model.Request;
import com.anabatic.itAssets.services.service.RequestService;

@RestController
@RequestMapping("/request")
public class RequestController {

	@Autowired
	private RequestService requestService;

	@Autowired
	private InsertRequestConverter requestConverter;

	@Autowired
	private GetByIdRequestConverter getByIdRequestConverter;

	@Autowired
	private UpdateRequestConverter updateRequestConverter;

	@Autowired
	private DeleteRequestConverter deleteRequestConverter;

	@Autowired
	private GetAllRequestConverter getAllRequestConverter;

	@PostMapping("/insertRequest")
	public ResponseEntity<BaseResponse> insert(@RequestBody InsertRequestRequest requestRequest) {
		Request request = requestConverter.toModel(requestRequest);
		Request req = requestService.insert(request);
		BaseResponse baseResponse = new BaseResponse();
		baseResponse.setResponse(requestConverter.toContract(req));
		return ResponseEntity.ok().body(baseResponse);
	}

	@PostMapping("/getById")
	public ResponseEntity<BaseResponse> getById(@RequestBody RequestGetByIdRequest request) {
		Request request2 = getByIdRequestConverter.toModel(request);
		Request request3 = requestService.getById(request2);
		BaseResponse baseResponse = new BaseResponse();
		baseResponse.setResponse(getByIdRequestConverter.toContract(request3));
		return ResponseEntity.ok().body(baseResponse);
	}

	@PostMapping("/delete")
	public ResponseEntity<BaseResponse> delete(@RequestBody RequestDeleteRequest request) {
		Request request2 = deleteRequestConverter.toModel(request);
		Request request3 = requestService.getById(request2);
		requestService.delete(request3);
		BaseResponse baseResponse = new BaseResponse();
		return ResponseEntity.ok().body(baseResponse);
	}

	@PostMapping("/update")
	public ResponseEntity<BaseResponse> update(@RequestBody RequestUpdateRequest request) {
		Request request2 = updateRequestConverter.toModel(request);
		Request request3 = requestService.update(request2);
		BaseResponse baseResponse = new BaseResponse();
		baseResponse.setResponse(updateRequestConverter.toContract(request3));
		return ResponseEntity.ok().body(baseResponse);
	}

	@GetMapping("/getAll")
	public ResponseEntity<BaseResponse> getAll() {
		List<Request> list = requestService.getAll();
		BaseResponse baseResponse = new BaseResponse();
		baseResponse.setResponse(getAllRequestConverter.toContracts(list));
		return ResponseEntity.ok().body(baseResponse);
	}

}
