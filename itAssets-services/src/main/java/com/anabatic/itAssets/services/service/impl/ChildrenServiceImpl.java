package com.anabatic.itAssets.services.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.anabatic.itAssets.persistence.dao.ChildrenDao;
import com.anabatic.itAssets.services.service.ChildrenService;

public class ChildrenServiceImpl implements ChildrenService{

	@Autowired
	private ChildrenDao childrenDao;
}
