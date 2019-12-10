package com.anabatic.itAssets.endpoint.converter;

import com.anabatic.generic.service.converter.ToContractConverter;
import com.anabatic.generic.service.converter.ToModelConverter;
import com.anabatic.itAssets.endpoint.Request.AssetsCategoryRequest;
import com.anabatic.itAssets.endpoint.Response.AssetsCategoryResponse;
import com.anabatic.itAssets.persistence.model.AssetsCategory;

/**
 * !place your description here!
 *
 * @author yeshwantk (&copy;25-Jul-2019)
 */
public interface AssetsCategoryConverter
        extends ToModelConverter<AssetsCategoryRequest, AssetsCategory>,
        ToContractConverter<AssetsCategory, AssetsCategoryResponse> {

}
