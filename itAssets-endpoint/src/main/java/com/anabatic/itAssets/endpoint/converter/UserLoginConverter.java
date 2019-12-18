package com.anabatic.itAssets.endpoint.converter;


import com.anabatic.generic.service.converter.ToContractConverter;
import com.anabatic.generic.service.converter.ToModelConverter;
import com.anabatic.itAssets.endpoint.Request.UserLoginRequest;
import com.anabatic.itAssets.endpoint.Response.UserLoginResponse;
import com.anabatic.itAssets.persistence.model.Users;

public interface UserLoginConverter  extends ToModelConverter<UserLoginRequest, Users>,
ToContractConverter<Users, UserLoginResponse>{

}
