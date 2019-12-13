package com.anabatic.itAssets.persistence.dao.impl;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import com.anabatic.itAssets.persistence.dao.UsersDao;
import com.anabatic.itAssets.persistence.model.Users;

@javax.transaction.Transactional
public class UsersDaoImpl implements UsersDao 
{

	@PersistenceContext
	EntityManager manager;

	@Override
	public Users insert(Users model) {
		Users user=manager.merge(model);
		return user;
	}
	
}
