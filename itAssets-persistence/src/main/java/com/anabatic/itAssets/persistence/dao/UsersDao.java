package com.anabatic.itAssets.persistence.dao;

import javax.transaction.Transactional;

import com.anabatic.itAssets.persistence.model.Users;

public interface UsersDao {

	Users insert(Users model);

}
