package com.anabatic.itAssets.endpoint.converter.impl;

import java.util.List;

import com.anabatic.itAssets.endpoint.Request.InsertRequestRequest;
import com.anabatic.itAssets.endpoint.Response.InsertRequestResponse;
import com.anabatic.itAssets.endpoint.converter.InsertRequestConverter;
import com.anabatic.itAssets.persistence.model.Request;
import com.anabatic.itAssets.persistence.model.Users;

public class InsertRequestConverterImpl implements InsertRequestConverter {

	@Override
	public Request toModel(InsertRequestRequest object) {
		Request request = new Request();
		request.setReason(object.getReason());
		request.setRequestTo(object.getRequestTo());
		request.setDepartment(object.getDepartment());
		request.setrequestItem(object.getRequestItem());
		request.setQuantity(object.getQuantity());
		request.setRequestType(object.getRequestType());
		request.setRequestedDate(object.getRequestedDate());
		request.setClosingDate(object.getClosingDate());
		Users users = new Users();
		users.setId(object.getUserId());
		request.setUserId(users);
		return request;
	}

	@Override
	public List<Request> toModels(List<InsertRequestRequest> objects) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InsertRequestResponse toContract(Request object) {
		InsertRequestResponse res = new InsertRequestResponse();
		res.setId(object.getId());
		res.setRequestId(object.getRequestId());
		return res;
	}

	@Override
	public List<InsertRequestResponse> toContracts(List<Request> objects) {
		// TODO Auto-generated method stub
		return null;
	}

}
