package com.anabatic.itAssets.services.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.anabatic.generic.service.TypicalGenericService;
import com.anabatic.itAssets.persistence.model.AssetsForm;
import com.anabatic.itAssets.persistence.model.Users;

@Transactional
public interface UsersService {

	Users insert(Users model);



}
