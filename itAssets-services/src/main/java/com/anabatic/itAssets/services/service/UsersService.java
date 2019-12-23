package com.anabatic.itAssets.services.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.anabatic.generic.service.TypicalGenericService;
import com.anabatic.itAssets.persistence.model.AssetsForm;
import com.anabatic.itAssets.persistence.model.Request;
import com.anabatic.itAssets.persistence.model.Users;

@Transactional
public interface UsersService {

	Users insert(Users model);

	List<Users> getAll();

	Users getById(Long long1);

	Users updateUsers(Users user);

	void deleteById(Long id);

	Users login(String employeeId, String password);

	Request insertRequest(Request model);

	List<Users> getByStatus(Integer status);




}
