package com.anabatic.itAssets.services.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.anabatic.itAssets.persistence.dao.LoginDao;
import com.anabatic.itAssets.persistence.dao.UsersDao;
import com.anabatic.itAssets.persistence.model.Login;
import com.anabatic.itAssets.persistence.model.Users;
import com.anabatic.itAssets.services.service.LoginService;

public class LoginServiceImpl implements LoginService {
	
	@Autowired
	LoginDao loginDao;

	@Autowired
    private UsersDao usersDao;
	
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
	public Login login(String userName, String password,String role) {
		Login user = loginDao.login(userName,password , role);
		
		return user;
	}
	
	@Override
    public Users userLogin(String username, String password,Long privi) {
	    Long id = loginDao.userLogin(username,password,privi);
	    return usersDao.getById(id);
    }

}
