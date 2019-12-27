package com.anabatic.itAssets.endpoint.converter.impl;

import java.util.List;

import com.anabatic.itAssets.endpoint.Request.LoginVarificationRequest;
import com.anabatic.itAssets.endpoint.Response.LoginResponse;
import com.anabatic.itAssets.endpoint.converter.InsertLoginConverter;
import com.anabatic.itAssets.persistence.model.Login;

public class InsertLoginConverterImpl implements InsertLoginConverter {

	@Override
	public Login toModel(LoginVarificationRequest l) {
		Login login = new Login();
		
		login.setUserName(l.getUserName());
		login.setPassword(l.getPassword());
		
		return login;
	}

	@Override
	public List<Login> toModels(List<LoginVarificationRequest> objects) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LoginResponse toContract(Login l) {
		// TODO Auto-generated method stub
		LoginResponse login = new LoginResponse();
		login.setId(l.getId());
		login.setUserName(l.getUserName());
		login.setPassword(l.getPassword());
		login.setProfile(l.getProfile());
		login.setRole(l.getRole());
		login.setStatus(l.getStatus());
		return login;
	}

	@Override
	public List<LoginResponse> toContracts(List<Login> objects) {
		// TODO Auto-generated method stub
		return null;
	}

}
