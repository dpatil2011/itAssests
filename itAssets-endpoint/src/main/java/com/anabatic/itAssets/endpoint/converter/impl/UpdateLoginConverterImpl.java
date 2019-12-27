package com.anabatic.itAssets.endpoint.converter.impl;

import java.util.List;

import com.anabatic.itAssets.endpoint.Request.UpdateLoginRequest;
import com.anabatic.itAssets.endpoint.Response.LoginResponse;
import com.anabatic.itAssets.endpoint.converter.UpdateLoginConverter;
import com.anabatic.itAssets.persistence.model.Login;

public class UpdateLoginConverterImpl implements UpdateLoginConverter {

	@Override
	public Login toModel(UpdateLoginRequest l) {
		// TODO Auto-generated method stub
		Login login = new Login();
		login.setId(l.getId());
		login.setUserName(l.getUserName());
		login.setPassword(l.getPassword());
		login.setProfile(l.getProfile());
		login.setRole(l.getRole());
		login.setStatus(l.getStatus());
		return login;
	

	}

	@Override
	public List<Login> toModels(List<UpdateLoginRequest> objects) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LoginResponse toContract(Login l) {
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
