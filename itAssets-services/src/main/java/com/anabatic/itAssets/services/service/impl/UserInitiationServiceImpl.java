package com.anabatic.itAssets.services.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.anabatic.itAssets.persistence.dao.UserInitiationDao;
import com.anabatic.itAssets.persistence.model.UserInitiation;
import com.anabatic.itAssets.services.service.UserInitiationService;

/**
 * !place your description here!
 *
 * @author yeshwantk (&copy;09-Jan-2020) 
 */
public class UserInitiationServiceImpl implements UserInitiationService {

    @Autowired
    private UserInitiationDao userInitiationDao;

    @Override
    public UserInitiation insert(UserInitiation request) {
        UserInitiation response = userInitiationDao.insert(request);
        return response;
    }

    @Override
    public UserInitiation getById(Long request) {
        UserInitiation response = userInitiationDao.getById(request);
        return response;
    }

    @Override
    public List<UserInitiation> getAll() {
        
        return userInitiationDao.getAll();
    }

    @Override
    public UserInitiation delete(Long request) {
        
        return userInitiationDao.delete(request);
    }
    
    @Override
    public UserInitiation linkValidation(String email,String cinNumber) {
        
        return userInitiationDao.linkValidation(email,cinNumber);
    }

}
