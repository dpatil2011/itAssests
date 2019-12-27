package com.anabatic.itAssets.services.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.anabatic.itAssets.persistence.dao.LoginDao;
import com.anabatic.itAssets.persistence.model.Login;
import com.anabatic.itAssets.persistence.model.Users;
import com.anabatic.itAssets.services.service.LoginService;

public class LoginServiceImpl implements LoginService {
	
	@Autowired
	LoginDao loginDao;

	@Override
	public List<Login> getAll() {

        List<Login> l = loginDao.getAll();
        
		return l;
	}

	@Override
	public Login insert(Login can) {
		// TODO Auto-generated method stub
		return loginDao.insert(can);
	}

	@Override
	public Login update(Login request2) {
		// TODO Auto-generated method stub
		return loginDao.update(request2);
	}

	@Override
	public Login login(String userName, String password) {
		Login user = loginDao.login(userName,password );
		
		return user;
	}

}
