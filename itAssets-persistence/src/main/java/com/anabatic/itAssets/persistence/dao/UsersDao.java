package com.anabatic.itAssets.persistence.dao;

import java.util.List;

import javax.transaction.Transactional;

import com.anabatic.itAssets.persistence.model.Users;

public interface UsersDao {

	Users insert(Users model);

	List<Users> getAll();
	
	List<Users> fetchRole();

	Users getById(Long long1);
	
	Users getEmpId(String empId);

	Users update(Users user);

	void deleteById(Long id);

	Users login(String employeeId, String password);

	List<Users> getByStatus(Integer status);

	

}
