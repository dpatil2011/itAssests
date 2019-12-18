package com.anabatic.itAssets.endpoint.converter.impl;

import java.util.List;

import com.anabatic.itAssets.endpoint.Request.UsersReq;
import com.anabatic.itAssets.endpoint.Response.UsersReqRes;
import com.anabatic.itAssets.endpoint.converter.UsersRequestConverter;
import com.anabatic.itAssets.persistence.model.Request;
import com.anabatic.itAssets.persistence.model.Users;

public class UsersRequestConverterImpl implements UsersRequestConverter {

	@Override
	public Request toModel(UsersReq object) {
		Request req = new Request();
		req.setDepartment(object.getDepartment());
		req.setQuantity(object.getQuantity());
		req.setReason(object.getReason());
		req.setRequestId(object.getRequestId());
		req.setrequestItem(object.getRequestItem());
		req.setRequestTo(object.getRequestTo());
		req.setRequestType(object.getRequestType());
		req.setUserId(object.getUserId());
		return null;
	}

	@Override
	public List<Request> toModels(List<UsersReq> objects) {
		return null;
	}

	@Override
	public UsersReqRes toContract(Request object) {
		return null;
	}

	@Override
	public List<UsersReqRes> toContracts(List<Request> objects) {
		return null;
	}

}
