package com.anabatic.itAssets.persistence.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.anabatic.itAssets.persistence.dao.AssetsCategoryDao;
import com.anabatic.itAssets.persistence.model.AssetsCategory;

/**
 * !place your description here!
 *
 * @author yeshwantk (&copy;25-Jul-2019)
 */
@Transactional
public class AssetsCategoryDaoImpl implements AssetsCategoryDao {

    @PersistenceContext
    EntityManager manager;

    @Override
    public AssetsCategory insert(AssetsCategory request) {
        AssetsCategory response = manager.merge(request);
        return response;
    }

    @Override
    public AssetsCategory getById(Long request) {
        AssetsCategory response = manager.find(AssetsCategory.class, request);
        return response;
    }

    @Override
    public List<AssetsCategory>getAll() {
    
        try {
            return manager.createNativeQuery("SELECT * FROM assets_category", AssetsCategory.class).getResultList();
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public AssetsCategory delete(Long request) {
        AssetsCategory response = manager.find(AssetsCategory.class, request);
        manager.remove(response);
        return null;
    }

    @Override
    public List<AssetsCategory> belongsTo(String belongsTo) {
        try {
            Query query = manager
                    .createQuery("select k from AssetsCategory k where k.belongsTo =:belongsTo");
            query.setParameter("belongsTo", belongsTo);
            return (List<AssetsCategory>) query.getResultList();
        } catch (Exception e) {
            throw e;
        }
    }
    
}
