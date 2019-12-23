
package com.anabatic.itAssets.endpoint.converter;

import com.anabatic.generic.service.converter.ToContractConverter;
import com.anabatic.itAssets.endpoint.Response.GetAllRequestResponse;
import com.anabatic.itAssets.persistence.model.Request;

public interface GetByRequestToConverter extends ToContractConverter<Request, GetAllRequestResponse> {

}