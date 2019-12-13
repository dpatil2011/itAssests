package com.anabatic.itAssets.services.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.anabatic.itAssets.persistence.dao.RequestDao;
import com.anabatic.itAssets.persistence.model.Request;
import com.anabatic.itAssets.services.service.RequestService;

public class RequestServiceImpl implements RequestService {

	@Autowired
	private RequestDao requestDao;

	@Override
	public Request insert(Request request) {
		Request request2 = requestDao.insert(request);
		return request2;
	}

	@Override
	public Request getById(Request request) {
		Request request2 = requestDao.getById(request);
		return request2;
	}

	@Override
	public Request update(Request request) {
		Request req = requestDao.update(request);
		return req;
	}
}
