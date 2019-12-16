package com.anabatic.itAssets.persistence.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.anabatic.itAssets.persistence.dao.AssetFomDao;
import com.anabatic.itAssets.persistence.model.AssetsForm;

/**
 * !place your description here!
 *
 * @author yeshwantk (&copy;25-Jul-2019)
 */
@Transactional
public class AssetFormDaoImpl implements AssetFomDao {

    @PersistenceContext
    EntityManager manager;

    @Override
    public AssetsForm insert(AssetsForm request) {
        AssetsForm response = manager.merge(request);
        return response;
    }

    @Override
    public AssetsForm getById(Long request) {
        AssetsForm response = manager.find(AssetsForm.class, request);
        return response;
    }

    @Override
    public AssetsForm delete(Long request) {
        AssetsForm response = manager.find(AssetsForm.class, request);
        manager.remove(response);
        return null;
    }

    @Override
    public List<AssetsForm> getAll() {
        try {
            return manager.createNativeQuery("SELECT * FROM asset_form",
                    AssetsForm.class).getResultList();
        } catch (Exception e) {
            throw e;
        }
    }
}
