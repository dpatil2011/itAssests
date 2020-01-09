package com.anabatic.itAssets.persistence.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.anabatic.itAssets.persistence.dao.UserInitiationDao;
import com.anabatic.itAssets.persistence.model.UserInitiation;

/**
 * !place your description here!
 *
 * @author yeshwantk (&copy;09-Jan-2020) 
 */
@Transactional
class UserInitiationDaoImpl implements UserInitiationDao{

    @PersistenceContext
    EntityManager manager;

    @Override
    public UserInitiation insert(UserInitiation request) {
        UserInitiation response = manager.merge(request);
        return response;
    }

    @Override
    public UserInitiation getById(Long request) {
        UserInitiation response = manager.find(UserInitiation.class, request);
        return response;
    }

    @Override
    public List<UserInitiation>getAll() {
    
        try {
            return manager.createNativeQuery("SELECT * FROM user_initiation", UserInitiation.class).getResultList();
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public UserInitiation delete(Long request) {
        UserInitiation response = manager.find(UserInitiation.class, request);
        manager.remove(response);
        return null;
    }
}
