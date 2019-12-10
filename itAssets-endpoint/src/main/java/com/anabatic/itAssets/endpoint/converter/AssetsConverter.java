package com.anabatic.itAssets.endpoint.converter;

import com.anabatic.generic.service.converter.ToContractConverter;
import com.anabatic.generic.service.converter.ToModelConverter;
import com.anabatic.itAssets.endpoint.Request.AssetsRequest;
import com.anabatic.itAssets.endpoint.Response.AssetsResponse;
import com.anabatic.itAssets.persistence.model.Assets;

/**
 * !place your description here!
 *
 * @author yeshwantk (&copy;25-Jul-2019) 
 */
public interface AssetsConverter
        extends ToModelConverter<AssetsRequest, Assets>,
        ToContractConverter<Assets, AssetsResponse> {

}
