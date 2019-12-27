package com.anabatic.itAssets.persistence.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.itAssests.core.constant.UsersErrorConstant;
import org.itAssests.core.exception.UsersException;
import org.springframework.boot.CommandLineRunner;

import com.anabatic.itAssets.persistence.dao.LoginDao;
import com.anabatic.itAssets.persistence.model.Candidate;
import com.anabatic.itAssets.persistence.model.CandidateRecord;
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

	@Override
	public Login insert(Login can) {
		Login record2 = manager.merge(can);
		return record2;
	}

	@Override
	public Login update(Login request2) {
		Login request = manager.merge(request2);
		return request;
	}

	@Override
	public Login login(String userName, String password) {
		try {
			Query query = manager
					.createQuery("select u from Login u where u.userName =:userName and u.password =:password");
			query.setParameter("userName", userName);
			query.setParameter("password", password);
			return (Login) query.getSingleResult();
		} catch (Exception e) {
			UsersException u = new UsersException(UsersErrorConstant.LOGIN_VALIDATION);
			u.getError().getField().clear();
			u.getError().addField("userName");
			u.getError().addField("password");
			throw u;
		}
	}

	
	
}
