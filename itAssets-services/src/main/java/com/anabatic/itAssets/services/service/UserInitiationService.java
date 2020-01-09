package com.anabatic.itAssets.services.service;

import java.util.List;

import com.anabatic.itAssets.persistence.model.UserInitiation;

/**
 * !place your description here!
 *
 * @author yeshwantk (&copy;09-Jan-2020) 
 */
public interface UserInitiationService {
    
    public UserInitiation insert(UserInitiation request);

    public UserInitiation getById(Long request);

    public List<UserInitiation> getAll();

    public UserInitiation delete(Long request);
}
