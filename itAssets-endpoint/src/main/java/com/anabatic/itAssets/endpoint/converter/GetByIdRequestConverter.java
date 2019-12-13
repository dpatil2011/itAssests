package com.anabatic.itAssets.endpoint.converter;

import com.anabatic.generic.service.converter.ToContractConverter;
import com.anabatic.generic.service.converter.ToModelConverter;
import com.anabatic.itAssets.endpoint.Request.RequestGetByIdRequest;
import com.anabatic.itAssets.endpoint.Response.RequestGetByIdResponse;
import com.anabatic.itAssets.persistence.model.Request;

public interface GetByIdRequestConverter
		extends ToModelConverter<RequestGetByIdRequest, Request>, ToContractConverter<Request, RequestGetByIdResponse> {

}
