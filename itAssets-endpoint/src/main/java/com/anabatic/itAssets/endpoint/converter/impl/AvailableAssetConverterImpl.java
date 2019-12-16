package com.anabatic.itAssets.endpoint.converter.impl;

import java.util.ArrayList;
import java.util.List;

import com.anabatic.itAssets.endpoint.Request.AvailableAssetRequest;
import com.anabatic.itAssets.endpoint.Response.AvailableAssetResponse;
import com.anabatic.itAssets.endpoint.converter.AvailableAssetsConverter;
import com.anabatic.itAssets.persistence.model.AssetsForm;
import com.anabatic.itAssets.persistence.model.AvailableAsset;

/**
 * !place your description here!
 *
 * @author yeshwantk (&copy;13-Dec-2019) 
 */
public class AvailableAssetConverterImpl implements AvailableAssetsConverter {

    @Override
    public AvailableAsset toModel(AvailableAssetRequest object) {
        AvailableAsset request = new AvailableAsset();
        AssetsForm assetsForm =  new AssetsForm();
        assetsForm.setId(object.getFormId());
        request.setData(object.getData());
        request.setId(object.getId());
        request.setStatus(object.getStatus());
        request.setAssetsForm(assetsForm);
        return request;
    }

    @Override
    public List<AvailableAsset> toModels(List<AvailableAssetRequest> objects) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public AvailableAssetResponse toContract(AvailableAsset object) {
        AvailableAssetResponse response = new AvailableAssetResponse();
        response.setFormId(object.getAssetsForm().getId());
        response.setData(object.getData());
        response.setId(object.getId());
        response.setStatus(object.getStatus());
        return response;
    }

    @Override
    public List<AvailableAssetResponse> toContracts(List<AvailableAsset> objects) {
        List<AvailableAssetResponse> list = new ArrayList<>();
        objects.forEach(x -> list.add(toContract(x)));
        return list;
    }

}
