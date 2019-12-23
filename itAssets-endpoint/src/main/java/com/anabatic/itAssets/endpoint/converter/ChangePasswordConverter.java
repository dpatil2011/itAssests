package com.anabatic.itAssets.endpoint.converter;

import com.anabatic.generic.service.converter.ToContractConverter;
import com.anabatic.generic.service.converter.ToModelConverter;
import com.anabatic.itAssets.endpoint.Request.ChangePasswordRequest;
import com.anabatic.itAssets.endpoint.Response.ChangePasswordResponse;
import com.anabatic.itAssets.persistence.model.Users;

public interface ChangePasswordConverter extends ToModelConverter<ChangePasswordRequest, Users>,
ToContractConverter<Users, ChangePasswordResponse>{

}
