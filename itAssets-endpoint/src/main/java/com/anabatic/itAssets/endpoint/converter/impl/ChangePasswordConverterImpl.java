package com.anabatic.itAssets.endpoint.converter.impl;

import java.util.List;

import com.anabatic.itAssets.endpoint.Request.ChangePasswordRequest;
import com.anabatic.itAssets.endpoint.Response.ChangePasswordResponse;
import com.anabatic.itAssets.endpoint.converter.ChangePasswordConverter;
import com.anabatic.itAssets.persistence.model.Users;

public class ChangePasswordConverterImpl implements ChangePasswordConverter {

	@Override
	public Users toModel(ChangePasswordRequest object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Users> toModels(List<ChangePasswordRequest> objects) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ChangePasswordResponse toContract(Users object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ChangePasswordResponse> toContracts(List<Users> objects) {
		// TODO Auto-generated method stub
		return null;
	}

}
