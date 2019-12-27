package com.anabatic.itAssets.services.service;

import java.util.List;

import com.anabatic.itAssets.persistence.model.Login;

public interface LoginService {

	List<Login> getAll();

	Login insert(Login can);

	Login update(Login request2);

	Login login(String userName, String password);

}
