package com.anabatic.itAssets.services.service;

import java.util.List;

import com.anabatic.generic.service.TypicalGenericService;
import com.anabatic.itAssets.persistence.model.AssetsCategory;

/**
 * !place your description here!
 *
 * @author yeshwantk (&copy;25-Jul-2019)
 */
public interface AssetsCategoryService
        extends TypicalGenericService<AssetsCategory, Long> {

    public AssetsCategory insert(AssetsCategory assetsCat);

    public AssetsCategory getById(Long id);

    public List<AssetsCategory> getAllData();

    public void delete(Long id);
}
