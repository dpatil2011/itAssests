package com.anabatic.itAssets.endpoint.converter;

import com.anabatic.generic.service.converter.ToContractConverter;
import com.anabatic.generic.service.converter.ToModelConverter;
import com.anabatic.itAssets.endpoint.Request.InsertRequestRequest;
import com.anabatic.itAssets.endpoint.Response.InsertRequestResponse;
import com.anabatic.itAssets.persistence.model.Request;

public interface InsertRequestConverter extends 
ToModelConverter<InsertRequestRequest, Request>,
ToContractConverter<Request, InsertRequestResponse>{

}
