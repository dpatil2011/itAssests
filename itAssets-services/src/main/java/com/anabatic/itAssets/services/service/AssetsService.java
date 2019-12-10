package com.anabatic.itAssets.services.service;

import java.util.List;

import com.anabatic.generic.service.TypicalGenericService;
import com.anabatic.itAssets.persistence.model.Assets;

/**
 * !place your description here!
 *
 * @author yeshwantk (&copy;25-Jul-2019)
 */
public interface AssetsService extends TypicalGenericService<Assets, Long> {

    public Assets insert(Assets assets);

    public Assets getById(Long id);

    public List<Assets> getAllData();

    public void delete(Long id);
}
