package com.anabatic.itAssets.persistence.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.anabatic.itAssets.persistence.dao.RequestDao;
import com.anabatic.itAssets.persistence.model.Request;

@Transactional
public class RequestDaoImpl implements RequestDao {
	@PersistenceContext
	EntityManager manager;

	@Override
	public Request insert(Request model) {
		Request req = manager.merge(model);
		return req;
	}

	@Override
	public Request getById(Request req) {
		Request request = manager.find(Request.class, req.getId());
		return request;
	}

	@Override
	public Request update(Request req) {
		Request request = manager.merge(req);
		return request;
	}

	@Override
	public void delete(Request req) {
		manager.remove(req);
	}

	@Override
	public List<Request> getall() {
		try {
			return manager.createNativeQuery("SELECT * FROM request", Request.class).getResultList();
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public List<Request> getByRequest(String requestTo) {
		try {
			return manager.createNativeQuery("SELECT * FROM request WHERE request_to=:" + requestTo, Request.class)
					.getResultList();
		} catch (Exception e) {
			throw e;
		}
	}
}
