package com.anabatic.itAssets.services.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.anabatic.generic.service.impl.TypicalGenericServiceImpl;
import com.anabatic.itAssets.persistence.dao.AvailableAssetDao;
import com.anabatic.itAssets.persistence.model.AvailableAsset;
import com.anabatic.itAssets.services.service.AvailableAssetService;

/**
 * !place your description here!
 *
 * @author yeshwantk (&copy;11-Dec-2019)
 */
public class AvailableAssetServiceImpl
        extends TypicalGenericServiceImpl<AvailableAsset, Long>
        implements AvailableAssetService {

    @Autowired
    private AvailableAssetDao availableAssetDao;

    @Autowired
    public AvailableAssetServiceImpl(AvailableAssetDao availableAssetDao) {
        super();
        this.availableAssetDao = availableAssetDao;
    }

    public void setAssetsCategoryDao(AvailableAssetDao availableAssetDao) {
        this.availableAssetDao = availableAssetDao;
        this.typicalGenericDao = availableAssetDao;
        this.genericDao = availableAssetDao;
    }

    @Override
    public AvailableAsset insert(AvailableAsset availableAsset) {
        return availableAssetDao.save(availableAsset);
    }

    @Override
    public AvailableAsset getById(Long id) {
        return availableAssetDao.get(id);
    }

    @Override
    public void delete(Long id) {
        availableAssetDao.remove(id);

    }

    @Override
    public List<AvailableAsset> getAllData() {

        return availableAssetDao.getAll();
    }

}