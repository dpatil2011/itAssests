package com.anabatic.itAssets.services.service;

import java.util.List;

import com.anabatic.itAssets.persistence.model.Privilege;

public interface PrivilegeService {

	List<Privilege> getByStatus(Privilege p,Long priviId);

	Privilege insert(Privilege model);

	Privilege removePrivilege(Privilege model);

	

}
