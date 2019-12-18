package com.anabatic.itAssets.endpoint.converter;

import com.anabatic.generic.service.converter.ToContractConverter;
import com.anabatic.generic.service.converter.ToModelConverter;
import com.anabatic.itAssets.endpoint.Request.UsersRequest;
import com.anabatic.itAssets.endpoint.Request.UsersUpdateRequest;
import com.anabatic.itAssets.endpoint.Response.UsersResponse;
import com.anabatic.itAssets.endpoint.Response.UsersUpdateResponse;
import com.anabatic.itAssets.persistence.model.Users;

public interface UsersUpdateConverter extends ToModelConverter<UsersUpdateRequest, Users>,
ToContractConverter<Users, UsersUpdateResponse>{

}
