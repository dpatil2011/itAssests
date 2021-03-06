package com.anabatic.itAssets.persistence.dao;

import java.util.List;

import com.anabatic.itAssets.persistence.model.AssetsCategory;

/**
 * !place your description here!
 *
 * @author yeshwantk (&copy;25-Jul-2019) 
 */
public interface AssetsCategoryDao{

    public AssetsCategory insert(AssetsCategory request);

    public AssetsCategory getById(Long request);

    public List<AssetsCategory> getAll();

    public AssetsCategory delete(Long request);
    
    public List<AssetsCategory> belongsTo(String belongsTo);
    
}
