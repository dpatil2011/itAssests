package com.anabatic.itAssets.endpoint.converter.impl;

import java.util.ArrayList;
import java.util.List;

import com.anabatic.itAssets.endpoint.Request.UserInitiationRequest;
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
        response.setActiveFrom(object.getDate());
        response.setCinNumber(object.getCinNumber());
        response.setEmail(object.getEmail());
        response.setLink(object.getLink());
        response.setId(object.getId());
        return response;
    }

    @Override
    public List<UserInitiation> toModels(List<UserInitiationRequest> objects) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String toContract(UserInitiation object) {
        // TODO Auto-generated method stub
        return object.getLink();
    }

    @Override
    public List<String> toContracts(List<UserInitiation> objects) {
        List<String> list = new ArrayList<>();
        objects.forEach(x -> list.add(toContract(x)));
        return list;
    }

    

}
