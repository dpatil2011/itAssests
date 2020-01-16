package com.anabatic.itAssets.services.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.anabatic.itAssets.persistence.dao.CertificationDao;
import com.anabatic.itAssets.services.service.CertificationService;

public class CertificationServiceImpl implements CertificationService{
	
	@Autowired
	private CertificationDao certificationDao;

}
