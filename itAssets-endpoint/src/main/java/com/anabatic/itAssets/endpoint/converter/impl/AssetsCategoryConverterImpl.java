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
        request.setFields(object.getFields());
        request.setCatName(object.getCatName());
        request.setBelongsTo(object.getBelongsTo());
        request.setStock(object.getStock());
        request.setStatus(object.getStatus());
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

        assetsCategoryResponse.setId(object.getId());
        assetsCategoryResponse.setFields(object.getFields());
        assetsCategoryResponse.setCatName(object.getCatName());
        assetsCategoryResponse.setBelongsTo(object.getBelongsTo());
        assetsCategoryResponse.setStock(object.getStock());
        assetsCategoryResponse.setStatus(object.getStatus());

        return assetsCategoryResponse;
    }

    @Override
    public List<AssetsCategoryResponse> toContracts(List<AssetsCategory> objects) {
        List<AssetsCategoryResponse> list = new ArrayList<>();
        objects.forEach(x -> list.add(toContract(x)));
        return list;
    }
}
