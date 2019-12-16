package com.anabatic.itAssets.services.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.anabatic.itAssets.persistence.dao.AssetFomDao;
import com.anabatic.itAssets.persistence.model.AssetsForm;
import com.anabatic.itAssets.services.service.AssetFormService;

/**
 * !place your description here!
 *
 * @author yeshwantk (&copy;25-Jul-2019)
 */
public class AssetFormServiceImpl implements AssetFormService {

    @Autowired
    private AssetFomDao assetsDao;

    @Override
    public AssetsForm insert(AssetsForm request) {
        AssetsForm response = assetsDao.insert(request);
        return response;
    }

    @Override
    public AssetsForm getById(Long request) {
        AssetsForm response = assetsDao.getById(request);
        return response;
    }

    @Override
    public List<AssetsForm> getAll() {
        return assetsDao.getAll();
    }

    @Override
    public AssetsForm delete(Long request) {
        return assetsDao.delete(request);
    }

}
