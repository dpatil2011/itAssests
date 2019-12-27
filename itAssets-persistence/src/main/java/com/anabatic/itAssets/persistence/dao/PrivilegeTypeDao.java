package com.anabatic.itAssets.persistence.dao;

import java.util.List;

import com.anabatic.itAssets.persistence.model.PrivilegeType;

public interface PrivilegeTypeDao {
	public PrivilegeType insert(PrivilegeType request);
	
	public List<PrivilegeType> getAll();

	public PrivilegeType updatePriviCount(Long privilegeTypeId);
	
	public PrivilegeType getById(Long id);

}
