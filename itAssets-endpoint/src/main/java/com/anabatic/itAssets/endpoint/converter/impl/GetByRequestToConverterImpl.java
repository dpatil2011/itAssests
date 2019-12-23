package com.anabatic.itAssets.endpoint.converter.impl;

import java.util.ArrayList;
import java.util.List;

import com.anabatic.itAssets.endpoint.Response.GetAllRequestResponse;
import com.anabatic.itAssets.endpoint.converter.GetByRequestToConverter;
import com.anabatic.itAssets.persistence.model.Request;

public class GetByRequestToConverterImpl implements GetByRequestToConverter {

	@Override
	public GetAllRequestResponse toContract(Request object) {
		GetAllRequestResponse response = new GetAllRequestResponse();
		response.setId(object.getId());
		response.setReason(object.getReason());
		response.setRequestTo(object.getRequestTo());
		response.setRequestType(object.getRequestType());
		response.setRequestItem(object.getRequestItem());
		response.setRequestId(object.getRequestId());
		response.setDepartment(object.getDepartment());
		response.setQuantity(object.getQuantity());
		response.setRequestedDate(object.getRequestedDate());
		response.setClosingDate(object.getClosingDate());
		response.setUserId(object.getUserId().getId());
		response.setStatus(object.getStatus());
		return response;
	}

	@Override
	public List<GetAllRequestResponse> toContracts(List<Request> objects) {
		List<GetAllRequestResponse> list = new ArrayList<>();
		objects.forEach(x -> list.add(toContract(x)));
		return list;
	}

}
