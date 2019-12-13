package com.anabatic.itAssets.services.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.anabatic.generic.service.impl.TypicalGenericServiceImpl;
import com.anabatic.itAssets.persistence.dao.AssetFomDao;
import com.anabatic.itAssets.persistence.model.AssetsForm;
import com.anabatic.itAssets.services.service.AssetFormService;

/**
 * !place your description here!
 *
 * @author yeshwantk (&copy;25-Jul-2019)
 */
public class AssetFormServiceImpl extends TypicalGenericServiceImpl<AssetsForm, Long>
        implements AssetFormService {

    @Autowired
    private AssetFomDao assetsDao;

    @Autowired
    public AssetFormServiceImpl(AssetFomDao assetsDao) {
        super();
        this.assetsDao = assetsDao;
    }

    public void setAssetsDao(AssetFomDao assetsDao) {
        this.assetsDao = assetsDao;
        this.typicalGenericDao = assetsDao;
        this.genericDao = assetsDao;
    }

    @Override
    public AssetsForm insert(AssetsForm assets) {
        // TODO Auto-generated method stub
        return assetsDao.save(assets);
    }

    @Override
    public AssetsForm getById(Long id) {
        // TODO Auto-generated method stub
        return assetsDao.get(id);
    }

    @Override
    public void delete(Long id) {
        assetsDao.remove(id);

    }

    @Override
    public List<AssetsForm> getAllData() {
        return assetsDao.getAll();
    }

}
