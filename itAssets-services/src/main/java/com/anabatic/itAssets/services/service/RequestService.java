package com.anabatic.itAssets.services.service;

import com.anabatic.itAssets.persistence.model.Request;

public interface RequestService {

	public Request insert(Request request);

	public Request getById(Request request);

	public Request update(Request request);

}
