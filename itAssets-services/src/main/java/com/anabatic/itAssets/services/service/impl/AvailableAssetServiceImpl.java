package com.anabatic.itAssets.services.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.anabatic.itAssets.persistence.dao.AvailableAssetDao;
import com.anabatic.itAssets.persistence.model.AvailableAsset;
import com.anabatic.itAssets.services.service.AvailableAssetService;

/**
 * !place your description here!
 *
 * @author yeshwantk (&copy;11-Dec-2019)
 */
public class AvailableAssetServiceImpl implements AvailableAssetService {

    @Autowired
    private AvailableAssetDao availableAssetDao;

    @Override
    public AvailableAsset insert(AvailableAsset request) {
        AvailableAsset response = availableAssetDao.insert(request);
        return response;
    }

    @Override
    public AvailableAsset getById(Long request) {
        AvailableAsset response = availableAssetDao.getById(request);
        return response;
    }

    @Override
    public List<AvailableAsset> getAll() {
        
        return availableAssetDao.getAll();
    }

    @Override
    public AvailableAsset delete(Long request) {
       
        return availableAssetDao.delete(request);
    }

   
}