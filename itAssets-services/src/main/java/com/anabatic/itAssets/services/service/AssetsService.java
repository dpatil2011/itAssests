package com.anabatic.itAssets.services.service;

import java.util.List;

import com.anabatic.generic.service.TypicalGenericService;
import com.anabatic.itAssets.persistence.model.AssetsForm;

/**
 * !place your description here!
 *
 * @author yeshwantk (&copy;25-Jul-2019)
 */
public interface AssetsService extends TypicalGenericService<AssetsForm, Long> {

    public AssetsForm insert(AssetsForm assets);

    public AssetsForm getById(Long id);

    public List<AssetsForm> getAllData();

    public void delete(Long id);
}
