package com.anabatic.itAssets.services.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.anabatic.itAssets.persistence.dao.LoginDao;
import com.anabatic.itAssets.persistence.model.Login;
import com.anabatic.itAssets.services.service.LoginService;

public class LoginServiceImpl implements LoginService {
	
	@Autowired
	LoginDao loginDao;

	@Override
	public List<Login> getAll() {

        List<Login> l = loginDao.getAll();
        
		return l;
	}

}
