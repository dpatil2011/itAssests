package com.anabatic.itAssets.endpoint.converter.impl;

import java.util.List;

import com.anabatic.itAssets.endpoint.Request.RequestGetByIdRequest;
import com.anabatic.itAssets.endpoint.Response.RequestGetByIdResponse;
import com.anabatic.itAssets.endpoint.converter.GetByIdRequestConverter;
import com.anabatic.itAssets.persistence.model.Request;
import com.anabatic.itAssets.persistence.model.Users;

public class GetByIdRequestConverterImpl implements GetByIdRequestConverter {

	@Override
	public Request toModel(RequestGetByIdRequest object) {
		Request request = new Request();
		request.setId(object.getId());
		
		return request;
	}

	@Override
	public List<Request> toModels(List<RequestGetByIdRequest> objects) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RequestGetByIdResponse toContract(Request object) {
		RequestGetByIdResponse response = new RequestGetByIdResponse();
		response.setId(object.getId());
		response.setReason(object.getReason());
		response.setRequestTo(object.getRequestTo());
		response.setRequestType(object.getRequestType());
		response.setRequestItem(object.getRequestItem());
		response.setQuantity(object.getQuantity());
		response.setDepartment(object.getDepartment());
		response.setRequestedDate(object.getRequestedDate());
		response.setClosingDate(object.getClosingDate());
		response.setStatus(object.getStatus());
		Users users = object.getUserId();
		response.setUserId(users.getId());
		return response;
	}

	@Override
	public List<RequestGetByIdResponse> toContracts(List<Request> objects) {
		// TODO Auto-generated method stub
		return null;
	}

}
