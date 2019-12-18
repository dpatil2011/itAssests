package com.anabatic.itAssets.services.service.impl;

import java.util.ArrayList;
import java.util.List;

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

	@Override
	public void delete(Request request) {
		requestDao.delete(request);
	}

	@Override
	public List<Request> getAll() {
		List<Request> list = new ArrayList<>();
		list = requestDao.getall();
		return list;
	}

	public List<Request> getByRequest(String requestTo) {
		List<Request> list = new ArrayList<>();
		list = requestDao.getByRequest(requestTo);
		return list;
	}

}
