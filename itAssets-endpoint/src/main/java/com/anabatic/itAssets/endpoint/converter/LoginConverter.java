package com.anabatic.itAssets.endpoint.converter;

import com.anabatic.generic.service.converter.ToContractConverter;
import com.anabatic.generic.service.converter.ToModelConverter;
import com.anabatic.itAssets.endpoint.Request.LoginRequest;
import com.anabatic.itAssets.endpoint.Response.LoginResponse;
import com.anabatic.itAssets.persistence.model.Login;

public interface LoginConverter
		extends ToModelConverter<LoginRequest, Login>, ToContractConverter<Login, LoginResponse> {

}
