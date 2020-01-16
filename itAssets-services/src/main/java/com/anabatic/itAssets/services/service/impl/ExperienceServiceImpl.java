package com.anabatic.itAssets.services.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.anabatic.itAssets.persistence.dao.ExperienceDao;
import com.anabatic.itAssets.services.service.ExperienceService;

public class ExperienceServiceImpl implements ExperienceService{
	
	@Autowired
	private ExperienceDao experienceDao;

}
