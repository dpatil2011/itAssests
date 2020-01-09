package com.anabatic.itAssets.services.service;

import java.util.List;

import com.anabatic.itAssets.persistence.model.Login;
import com.anabatic.itAssets.persistence.model.Users;

public interface LoginService {

	List<Login> getAll();

	Login insert(Login can);

	Login update(Login request2);

	Login login(String userName, String password,String role);
	
	Users userLogin(String username, String password,Long privi);

}
