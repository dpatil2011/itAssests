package com.anabatic.itAssets.persistence.dao;

import java.util.List;

import org.springframework.boot.CommandLineRunner;

import com.anabatic.itAssets.persistence.model.Login;
import com.anabatic.itAssets.persistence.model.Users;

public interface LoginDao {

	CommandLineRunner insert();

	List<Login> getAll();

	Login insert(Login can);

	Login update(Login request2);

	Login login(String userName, String password,String role);
	
	Long userLogin(String username, String password,Long privi);

}
