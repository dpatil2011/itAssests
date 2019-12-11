package com.anabatic.itAssets.services.service;

import java.util.List;

import com.anabatic.generic.service.TypicalGenericService;
import com.anabatic.itAssets.persistence.model.AvailableAsset;

/**
 * !place your description here!
 *
 * @author yeshwantk (&copy;11-Dec-2019) 
 */
public interface AvailableAssetService extends TypicalGenericService<AvailableAsset, Long> {

    public AvailableAsset insert(AvailableAsset availableAsset);

    public AvailableAsset getById(Long id);

    public List<AvailableAsset> getAllData();

    public void delete(Long id);
}
