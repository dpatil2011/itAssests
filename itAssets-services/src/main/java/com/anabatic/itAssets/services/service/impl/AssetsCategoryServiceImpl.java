package com.anabatic.itAssets.services.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.anabatic.itAssets.persistence.dao.AssetsCategoryDao;
import com.anabatic.itAssets.persistence.model.AssetsCategory;
import com.anabatic.itAssets.services.service.AssetsCategoryService;

/**
 * !place your description here!
 *
 * @author yeshwantk (&copy;25-Jul-2019) 
 */
public class AssetsCategoryServiceImpl
        implements AssetsCategoryService {

    @Autowired
    private AssetsCategoryDao assetsCategoryDao;

    @Override
    public AssetsCategory insert(AssetsCategory request) {
        AssetsCategory response = assetsCategoryDao.insert(request);
        return response;
    }

    @Override
    public AssetsCategory getById(Long request) {
        AssetsCategory response = assetsCategoryDao.getById(request);
        return response;
    }

    @Override
    public List<AssetsCategory> getAll() {
        
        return assetsCategoryDao.getAll();
    }

    @Override
    public AssetsCategory delete(Long request) {
        
        return assetsCategoryDao.delete(request);
    }

    @Override
    public List<AssetsCategory> belongsTo(String belongsTo) {
        
        return assetsCategoryDao.belongsTo(belongsTo);
    }

   
   
}
