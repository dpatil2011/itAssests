package com.anabatic.itAssets.endpoint.converter;

import com.anabatic.generic.service.converter.ToModelConverter;
import com.anabatic.itAssets.endpoint.Request.RequestDeleteRequest;
import com.anabatic.itAssets.persistence.model.Request;

public interface DeleteRequestConverter extends ToModelConverter<RequestDeleteRequest, Request> {

}
