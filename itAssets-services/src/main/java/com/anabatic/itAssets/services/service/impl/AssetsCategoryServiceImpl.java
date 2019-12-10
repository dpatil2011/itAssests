package com.anabatic.itAssets.services.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.anabatic.generic.service.impl.TypicalGenericServiceImpl;
import com.anabatic.itAssets.persistence.dao.AssetsCategoryDao;
import com.anabatic.itAssets.persistence.model.AssetsCategory;
import com.anabatic.itAssets.services.service.AssetsCategoryService;

/**
 * !place your description here!
 *
 * @author yeshwantk (&copy;25-Jul-2019) 
 */
public class AssetsCategoryServiceImpl
        extends TypicalGenericServiceImpl<AssetsCategory, Long>
        implements AssetsCategoryService {

    @Autowired
    private AssetsCategoryDao assetsCategoryDao;

    @Autowired
    public AssetsCategoryServiceImpl(AssetsCategoryDao assetsCategoryDao) {
        super();
        this.assetsCategoryDao = assetsCategoryDao;
    }

    public void setAssetsCategoryDao(AssetsCategoryDao assetsCategoryDao) {
        this.assetsCategoryDao = assetsCategoryDao;
        this.typicalGenericDao = assetsCategoryDao;
        this.genericDao = assetsCategoryDao;
    }
    
    @Override
    public AssetsCategory insert(AssetsCategory assetsCat) {
        return assetsCategoryDao.save(assetsCat);
    }

    @Override
    public AssetsCategory getById(Long id) {
        return assetsCategoryDao.get(id);
    }

    @Override
    public void delete(Long id) {
        assetsCategoryDao.remove(id);
        
    }

    @Override
    public List<AssetsCategory> getAllData() {
        
        return assetsCategoryDao.getAll();
    }

}
