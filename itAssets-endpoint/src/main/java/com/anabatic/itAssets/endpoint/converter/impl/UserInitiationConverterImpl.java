package com.anabatic.itAssets.endpoint.converter.impl;

import java.util.ArrayList;
import java.util.List;

import com.anabatic.itAssets.endpoint.Request.UserInitiationRequest;
import com.anabatic.itAssets.endpoint.Response.UserInitiationResponse;
import com.anabatic.itAssets.endpoint.converter.UserInitiationConverter;
import com.anabatic.itAssets.persistence.model.UserInitiation;

/**
 * !place your description here!
 *
 * @author yeshwantk (&copy;09-Jan-2020) 
 */
public class UserInitiationConverterImpl implements UserInitiationConverter{

    @Override
    public UserInitiation toModel(UserInitiationRequest object) {
        UserInitiation response = new UserInitiation();
        response.setActiveFrom(object.getActiveFrom());
        response.setCinNumber(object.getCinNumber());
        response.setEmail(object.getEmail());
        response.setExpireOn(object.getExpireOn());
        response.setId(object.getId());
        response.setLink(object.getLink());
        response.setUserData(object.getUserData());
        return response;
    }

    @Override
    public List<UserInitiation> toModels(List<UserInitiationRequest> objects) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public UserInitiationResponse toContract(UserInitiation object) {
        UserInitiationResponse response = new UserInitiationResponse();
        response.setActiveFrom(object.getActiveFrom());
        response.setCinNumber(object.getCinNumber());
        response.setEmail(object.getEmail());
        response.setExpireOn(object.getExpireOn());
        response.setId(object.getId());
        response.setLink(object.getLink());
        response.setUserData(object.getUserData());
        return response;
    }

    @Override
    public List<UserInitiationResponse> toContracts(List<UserInitiation> objects) {
        List<UserInitiationResponse> list = new ArrayList<>();
        objects.forEach(x -> list.add(toContract(x)));
        return list;
    }

    

}
