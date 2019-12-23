package com.anabatic.itAssets.persistence.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.boot.CommandLineRunner;

import com.anabatic.itAssets.persistence.dao.LoginDao;
import com.anabatic.itAssets.persistence.model.Login;
import com.anabatic.itAssets.persistence.model.Users;
@Transactional
public class LoginDaoImpl implements LoginDao {

	@PersistenceContext
	EntityManager manager;
	
	@Override
	public CommandLineRunner insert() {
     Login l = new Login();
     l.setPassword("pass");
     l.setProfile("profile");
     l.setStatus(0);
     Login lo=manager.merge(l);
		return (CommandLineRunner) lo;
	}

	@Override
	public List<Login> getAll() {
		try {
			return manager.createNativeQuery("SELECT * FROM login", Login.class).getResultList();
		} catch (Exception e) {
			throw e;
		}
	}

	
	
}
