package com.anabatic.itAssets.services.service;

import java.util.List;

import com.anabatic.itAssets.persistence.model.Privilege;
import com.anabatic.itAssets.persistence.model.Users;

public interface PrivilegeService {

	List<Privilege> getByStatus(Privilege p,Long priviId);

	List<Privilege> recents();
	
	Privilege insert(Privilege model);

	Privilege removePrivilege(Privilege model);

}
