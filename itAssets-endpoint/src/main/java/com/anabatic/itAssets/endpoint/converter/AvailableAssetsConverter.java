package com.anabatic.itAssets.endpoint.converter;

import com.anabatic.generic.service.converter.ToContractConverter;
import com.anabatic.generic.service.converter.ToModelConverter;
import com.anabatic.itAssets.endpoint.Request.AvailableAssetRequest;
import com.anabatic.itAssets.endpoint.Response.AvailableAssetResponse;
import com.anabatic.itAssets.persistence.model.AvailableAsset;

/**
 * !place your description here!
 *
 * @author yeshwantk (&copy;13-Dec-2019)
 */

public interface AvailableAssetsConverter
        extends ToModelConverter<AvailableAssetRequest, AvailableAsset>,
        ToContractConverter<AvailableAsset, AvailableAssetResponse> {

}
