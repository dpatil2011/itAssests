package com.anabatic.itAssets.endpoint.converter;

import com.anabatic.generic.service.converter.ToContractConverter;
import com.anabatic.generic.service.converter.ToModelConverter;
import com.anabatic.itAssets.endpoint.Request.AssetFormRequest;
import com.anabatic.itAssets.endpoint.Response.AssetFormResponse;
import com.anabatic.itAssets.persistence.model.AssetsForm;

/**
 * !place your description here!
 *
 * @author yeshwantk (&copy;25-Jul-2019) 
 */
public interface AssetFormConverter
        extends ToModelConverter<AssetFormRequest, AssetsForm>,
        ToContractConverter<AssetsForm, AssetFormResponse> {

}
