package com.anabatic.itAssets.endpoint.converter.impl;

import java.util.ArrayList;
import java.util.List;

import com.anabatic.itAssets.endpoint.Request.LoginRequest;
import com.anabatic.itAssets.endpoint.Response.LoginResponse;
import com.anabatic.itAssets.endpoint.converter.LoginConverter;
import com.anabatic.itAssets.persistence.model.Login;

public class LoginConverterImpl implements LoginConverter {

	@Override
	public Login toModel(LoginRequest object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Login> toModels(List<LoginRequest> objects) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LoginResponse toContract(Login object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LoginResponse> toContracts(List<Login> objects) {
		List<LoginResponse> list = new ArrayList<LoginResponse>(objects.size());
         for (Login l: objects) {
        	 LoginResponse login = new LoginResponse();
        	 login.setId(l.getId());
        	 login.setUserName(l.getUserName());
        	 login.setPassword(l.getPassword());
        	 login.setProfile(l.getProfile());
        	 login.setRole(l.getRole());
        	 list.add(login);        	 
         }
		return list;
	}

}
