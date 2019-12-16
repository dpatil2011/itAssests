package com.anabatic.itAssets.services.service;

import java.util.List;

import com.anabatic.itAssets.persistence.model.AvailableAsset;

/**
 * !place your description here!
 *
 * @author yeshwantk (&copy;11-Dec-2019) 
 */
public interface AvailableAssetService {

    public AvailableAsset insert(AvailableAsset request);

    public AvailableAsset getById(Long request);

    public List<AvailableAsset> getAll();

    public AvailableAsset delete(Long request);

}
