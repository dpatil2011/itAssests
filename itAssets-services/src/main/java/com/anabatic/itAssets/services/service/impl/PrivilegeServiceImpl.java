package com.anabatic.itAssets.services.service.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.anabatic.itAssets.persistence.dao.PrivilegeDao;
import com.anabatic.itAssets.persistence.model.Privilege;
import com.anabatic.itAssets.services.service.PrivilegeService;

public class PrivilegeServiceImpl  implements PrivilegeService{
	
	@PersistenceContext
    EntityManager entityManager;
	
	@Autowired
	private PrivilegeDao privilegeDao;


	@Override
	public List<Privilege> getByStatus(Privilege p) {
		// TODO Auto-generated method stub
		return privilegeDao.getByStatus(p);
	}


	@Override
	public Privilege insert(Privilege model) {
		// TODO Auto-generated method stub
		return privilegeDao.insert(model);
	}

}
