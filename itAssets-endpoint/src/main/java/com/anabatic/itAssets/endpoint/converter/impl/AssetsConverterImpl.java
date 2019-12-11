package com.anabatic.itAssets.endpoint.converter.impl;

import java.util.List;

import com.anabatic.itAssets.endpoint.Request.AssetsRequest;
import com.anabatic.itAssets.endpoint.Response.AssetsResponse;
import com.anabatic.itAssets.endpoint.converter.AssetsConverter;
import com.anabatic.itAssets.persistence.model.AssetsForm;

/**
 * !place your description here!
 *
 * @author yeshwantk (&copy;25-Jul-2019)
 */
public class AssetsConverterImpl implements AssetsConverter {

    @Override
    public AssetsForm toModel(AssetsRequest object) {
        AssetsForm request = new AssetsForm();
        request.setId(object.getId());
        
        request.setAssetsCategory(object.getAssetsCategory());
        return request;
    }

    @Override
    public List<AssetsForm> toModels(List<AssetsRequest> objects) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public AssetsResponse toContract(AssetsForm object) {
        AssetsResponse response = new AssetsResponse();
        response.setId(object.getId());
       
        response.setAssetsCategory(object.getAssetsCategory());
        return response;
    }

    @Override
    public List<AssetsResponse> toContracts(List<AssetsForm> objects) {
        // TODO Auto-generated method stub
        return null;
    }

}

