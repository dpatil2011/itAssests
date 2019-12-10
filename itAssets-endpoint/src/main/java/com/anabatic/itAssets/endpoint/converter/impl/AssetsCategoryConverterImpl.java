package com.anabatic.itAssets.endpoint.converter.impl;

import java.util.ArrayList;
import java.util.List;

import com.anabatic.itAssets.endpoint.Request.AssetsCategoryRequest;
import com.anabatic.itAssets.endpoint.Response.AssetsCategoryResponse;
import com.anabatic.itAssets.endpoint.converter.AssetsCategoryConverter;
import com.anabatic.itAssets.persistence.model.AssetsCategory;

/**
 * !place your description here!
 *
 * @author yeshwantk (&copy;25-Jul-2019)
 */
public class AssetsCategoryConverterImpl implements AssetsCategoryConverter {

    @Override
    public AssetsCategory toModel(AssetsCategoryRequest object) {
        AssetsCategory request = new AssetsCategory();

        request.setId(object.getId());
        request.setCatName(object.getCatName());
        request.setClientId("1");

        return request;
    }

    @Override
    public List<AssetsCategory> toModels(List<AssetsCategoryRequest> objects) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public AssetsCategoryResponse toContract(AssetsCategory object) {
        AssetsCategoryResponse assetsCategoryResponse = new AssetsCategoryResponse();

        assetsCategoryResponse.setCatName(object.getCatName());
        assetsCategoryResponse.setId(object.getId());

        return assetsCategoryResponse;
    }

    @Override
    public List<AssetsCategoryResponse> toContracts(
            List<AssetsCategory> objects) {
        List<AssetsCategoryResponse> assetsCat = new ArrayList<>();
        for (AssetsCategory cat : objects) {
            assetsCat.add(toContract(cat));
        }
        return assetsCat;
    }

}
