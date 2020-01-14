package com.anabatic.itAssets.endpoint.converter;

import com.anabatic.generic.service.converter.ToContractConverter;
import com.anabatic.generic.service.converter.ToModelConverter;
import com.anabatic.itAssets.endpoint.Request.UserInitiationRequest;
import com.anabatic.itAssets.endpoint.Response.UserInitiationResponse;
import com.anabatic.itAssets.persistence.model.UserInitiation;

/**
 * !place your description here!
 *
 * @author yeshwantk (&copy;09-Jan-2020) 
 */
public interface UserInitiationConverter extends ToModelConverter<UserInitiationRequest, UserInitiation>,
ToContractConverter<UserInitiation, UserInitiationResponse> {

}
