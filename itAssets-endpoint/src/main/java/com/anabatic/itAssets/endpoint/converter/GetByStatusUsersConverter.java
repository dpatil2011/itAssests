package com.anabatic.itAssets.endpoint.converter;

import com.anabatic.generic.service.converter.ToContractConverter;
import com.anabatic.generic.service.converter.ToModelConverter;
import com.anabatic.itAssets.endpoint.Request.GetByStatusUsersRequest;
import com.anabatic.itAssets.endpoint.Response.GetByStatusUsersResponse;
import com.anabatic.itAssets.persistence.model.Users;

public interface GetByStatusUsersConverter extends ToModelConverter<GetByStatusUsersRequest, Users>,
ToContractConverter<Users, GetByStatusUsersResponse>{

}
