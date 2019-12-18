package com.anabatic.itAssets.endpoint.converter;

import com.anabatic.generic.service.converter.ToContractConverter;
import com.anabatic.generic.service.converter.ToModelConverter;
import com.anabatic.itAssets.endpoint.Request.UsersReq;
import com.anabatic.itAssets.endpoint.Response.UsersReqRes;
import com.anabatic.itAssets.persistence.model.Request;
import com.anabatic.itAssets.persistence.model.Users;

public interface UsersRequestConverter extends ToModelConverter<UsersReq, Request>,
ToContractConverter<Request, UsersReqRes>{

}
