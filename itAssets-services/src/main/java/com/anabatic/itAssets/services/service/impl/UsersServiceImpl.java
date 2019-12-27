package com.anabatic.itAssets.services.service.impl;
import java.util.List;

import org.itAssests.core.constant.UsersErrorConstant;
import org.itAssests.core.exception.UsersException;
import org.springframework.beans.factory.annotation.Autowired;

import com.anabatic.itAssets.persistence.dao.UsersDao;
import com.anabatic.itAssets.persistence.model.Request;
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


	@Override
	public List<Users> getAll() {
		// TODO Auto-generated method stub
		List<Users> res = usersDao.getAll();
		return res;
	}

	@Override
    public List<Users> fetchRole() {
        // TODO Auto-generated method stub
        List<Users> res = usersDao.fetchRole();
        return res;
    }

	

	@Override
	public Users getById(Long long1) {
		Users u = usersDao.getById(long1);
		if(u==null) {
			 UsersException u1 =new UsersException(UsersErrorConstant.USER_NOT_FOUND);
				u1.getError().getField().clear();
				u1.getError().addField("id");		
				throw u1; 
		}
		return u;
	}


	@Override
	public Users updateUsers(Users user) {
		// TODO Auto-generated method stub
		Users u = usersDao.update(user);
		return u;
	}


	@Override
	public void deleteById(Long id) {
		usersDao.deleteById(id);
		// TODO Auto-generated method stub
		
	}


	@Override
	public Users login(String employeeId, String password) {
		Users user = usersDao.login(employeeId,password );
		
		return user;
	}


	@Override
	public Request insertRequest(Request model) {
	
		return null;
	}


	@Override
	public List<Users> getByStatus(Integer status) {
		// TODO Auto-generated method stub
		List<Users> res = usersDao.getByStatus(status);
		return res;
	}




}
