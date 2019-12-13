package com.anabatic.itAssets.services.service.impl;
import org.springframework.beans.factory.annotation.Autowired;

import com.anabatic.generic.service.impl.TypicalGenericServiceImpl;
import com.anabatic.itAssets.persistence.dao.UsersDao;
import com.anabatic.itAssets.persistence.model.Users;
import com.anabatic.itAssets.services.service.UsersService;

public class UsersServiceImpl 
                              implements UsersService
{
	
	@Autowired
	private UsersDao usersDao;
	
	
	@Override
	public Users insert(Users model) {
		Users res=usersDao.insert(model);
		return res;
	}

}
