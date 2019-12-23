package com.anabatic.itAssets.endpoint.converter.impl;

import java.util.List;

import com.anabatic.itAssets.endpoint.Request.RequestUpdateRequest;
import com.anabatic.itAssets.endpoint.Response.RequestUpdateResponse;
import com.anabatic.itAssets.endpoint.converter.UpdateRequestConverter;
import com.anabatic.itAssets.persistence.model.Request;
import com.anabatic.itAssets.persistence.model.Users;

public class UpdateRequestConverterImpl implements UpdateRequestConverter {

	@Override
	public Request toModel(RequestUpdateRequest object) {
		Request request = new Request();
		request.setId(object.getId());
		request.setReason(object.getReason());
		request.setRequestTo(object.getRequestTo());
		request.setRequestId(object.getRequestId());
		request.setRequestType(object.getRequestType());
		request.setrequestItem(object.getRequestItem());
		request.setQuantity(object.getQuantity());
		request.setDepartment(object.getDepartment());
		request.setRequestedDate(object.getRequestedDate());
		request.setClosingDate(object.getClosingDate());
		request.setStatus(object.getStatus());
		Users users = new Users();
		users.setId(object.getUserId());
		request.setUserId(users);
		return request;
	}

	@Override
	public List<Request> toModels(List<RequestUpdateRequest> objects) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RequestUpdateResponse toContract(Request object) {
		RequestUpdateResponse response = new RequestUpdateResponse();
		response.setId(object.getId());
		response.setReason(object.getReason());
		response.setRequestTo(object.getRequestTo());
		response.setRequestId(object.getRequestId());
		response.setRequestType(object.getRequestType());
		response.setRequestItem(object.getRequestItem());
		response.setQuantity(object.getQuantity());
		response.setDepartment(object.getDepartment());
		response.setRequestedDate(object.getRequestedDate());
		response.setClosingDate(object.getClosingDate());
		response.setUserId(object.getUserId().getId());
		return response;
	}

	@Override
	public List<RequestUpdateResponse> toContracts(List<Request> objects) {
		// TODO Auto-generated method stub
		return null;
	}

}
