package com.anabatic.itAssets.endpoint.converter;

import com.anabatic.generic.service.converter.ToContractConverter;
import com.anabatic.generic.service.converter.ToModelConverter;
import com.anabatic.itAssets.endpoint.Request.GetByIdUsersRequest;
import com.anabatic.itAssets.endpoint.Response.GetByIdUsersResponse;
import com.anabatic.itAssets.persistence.model.Users;

public interface GetByIdUsersConverter extends ToModelConverter<GetByIdUsersRequest, Users>,
ToContractConverter<Users, GetByIdUsersResponse>{

}
