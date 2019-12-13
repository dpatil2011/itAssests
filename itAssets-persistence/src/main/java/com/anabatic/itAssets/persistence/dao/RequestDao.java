package com.anabatic.itAssets.persistence.dao;

import com.anabatic.itAssets.persistence.model.Request;

public interface RequestDao {

	public Request insert(Request model);

	public Request getById(Request req);

	public Request update(Request req);

}
