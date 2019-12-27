package com.anabatic.itAssets.persistence.dao;

import java.util.List;

import com.anabatic.itAssets.persistence.model.Privilege;

public interface PrivilegeDao {

	List<Privilege> getByStatus(Privilege p) ;

	Privilege insert(Privilege model);

	Privilege removePrivilege(Privilege model);
	
	Privilege getById(Privilege model);

}
