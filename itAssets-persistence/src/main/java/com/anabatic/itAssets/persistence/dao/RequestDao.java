package com.anabatic.itAssets.persistence.dao;

import java.util.List;

import com.anabatic.itAssets.persistence.model.Request;

public interface RequestDao {

	public Request insert(Request model);

	public Request getById(Request req);

	public Request update(Request req);

	public void delete(Request req);

	public List<Request> getall();

	public List<Request> getByRequest(String requestTo);

	public List<Request> getByRequestToUserId(String requestTo, Long userId);

}
