package com.anabatic.itAssets.endpoint.converter.impl;

import java.util.List;

import com.anabatic.itAssets.endpoint.Request.RequestDeleteRequest;
import com.anabatic.itAssets.endpoint.converter.DeleteRequestConverter;
import com.anabatic.itAssets.persistence.model.Request;

public class DeleteRequestConverterImpl implements DeleteRequestConverter {

	@Override
	public Request toModel(RequestDeleteRequest object) {
		Request request = new Request();
		request.setId(object.getId());
		return request;
	}

	@Override
	public List<Request> toModels(List<RequestDeleteRequest> objects) {
		// TODO Auto-generated method stub
		return null;
	}

}
