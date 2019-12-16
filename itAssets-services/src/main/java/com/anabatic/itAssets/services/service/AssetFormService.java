package com.anabatic.itAssets.services.service;

import java.util.List;

import com.anabatic.itAssets.persistence.model.AssetsForm;

/**
 * !place your description here!
 *
 * @author yeshwantk (&copy;25-Jul-2019)
 */
public interface AssetFormService {

    public AssetsForm insert(AssetsForm request);

    public AssetsForm getById(Long request);

    public List<AssetsForm> getAll();
    
    public AssetsForm delete(Long request);

}
