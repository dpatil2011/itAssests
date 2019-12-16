package com.anabatic.itAssets.persistence.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.anabatic.itAssets.persistence.dao.AvailableAssetDao;
import com.anabatic.itAssets.persistence.model.AvailableAsset;

/**
 * !place your description here!
 *
 * @author yeshwantk (&copy;11-Dec-2019)
 */
@Transactional
public class AvailableAssetDaoImpl implements AvailableAssetDao {

    @PersistenceContext
    EntityManager manager;

    @Override
    public AvailableAsset insert(AvailableAsset request) {
        AvailableAsset response = manager.merge(request);
        return response;
    }

    @Override
    public AvailableAsset getById(Long request) {
        AvailableAsset response = manager.find(AvailableAsset.class,
                request);
        return response;
    }

    @Override
    public List<AvailableAsset> getAll() {
        try {
            return manager.createNativeQuery("SELECT * FROM available_asset", AvailableAsset.class).getResultList();
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public AvailableAsset delete(Long request) {
        AvailableAsset response = manager.find(AvailableAsset.class,
                request);
        manager.remove(response);
        return null;
    }

   
}
