package com.anabatic.itAssets.services.service;

import java.util.List;

import com.anabatic.itAssets.persistence.model.Request;

public interface RequestService {

	public Request insert(Request request);

	public Request getById(Request request);

	public Request update(Request request);

	public void delete(Request request);

	public List<Request> getAll();

	public Request insertUserRequest(Request model);

}
