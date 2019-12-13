package com.anabatic.itAssets.endpoint.converter.impl;

import java.util.List;

import com.anabatic.itAssets.endpoint.Request.AssetFormRequest;
import com.anabatic.itAssets.endpoint.Response.AssetFormResponse;
import com.anabatic.itAssets.endpoint.converter.AssetFormConverter;
import com.anabatic.itAssets.persistence.model.AssetsCategory;
import com.anabatic.itAssets.persistence.model.AssetsForm;

/**
 * !place your description here!
 *
 * @author yeshwantk (&copy;25-Jul-2019)
 */
public class AssetFormConverterImpl implements AssetFormConverter {

    @Override
    public AssetsForm toModel(AssetFormRequest object) {
        AssetsForm request = new AssetsForm();
        AssetsCategory ac = new AssetsCategory();
        ac.setId(object.getAssetCatId());
        request.setId(object.getId());
        request.setFields(object.getFields());
        request.setAssetsCategory(ac);
        return request;
    }

    @Override
    public List<AssetsForm> toModels(List<AssetFormRequest> objects) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public AssetFormResponse toContract(AssetsForm object) {
        AssetFormResponse response = new AssetFormResponse();
        response.setId(object.getId());
        response.setFields(object.getFields());
        response.setCatName(object.getAssetsCategory().getCatName());
        return response;
    }

    @Override
    public List<AssetFormResponse> toContracts(List<AssetsForm> objects) {
        // TODO Auto-generated method stub
        return null;
    }

}

