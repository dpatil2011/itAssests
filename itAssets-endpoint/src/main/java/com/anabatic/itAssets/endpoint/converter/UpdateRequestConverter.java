package com.anabatic.itAssets.endpoint.converter;

import com.anabatic.generic.service.converter.ToContractConverter;
import com.anabatic.generic.service.converter.ToModelConverter;
import com.anabatic.itAssets.endpoint.Request.RequestUpdateRequest;
import com.anabatic.itAssets.endpoint.Response.RequestUpdateResponse;
import com.anabatic.itAssets.persistence.model.Request;

public interface UpdateRequestConverter extends ToModelConverter<RequestUpdateRequest, Request>,ToContractConverter<Request, RequestUpdateResponse> {

}
