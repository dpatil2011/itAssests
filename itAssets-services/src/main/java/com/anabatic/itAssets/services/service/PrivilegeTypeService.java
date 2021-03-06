package com.anabatic.itAssets.services.service;

import java.util.List;

import com.anabatic.itAssets.persistence.model.Privilege;
import com.anabatic.itAssets.persistence.model.PrivilegeType;

public interface PrivilegeTypeService {
	public PrivilegeType insert(PrivilegeType faq);

	public List<PrivilegeType> getAll();

	public List<PrivilegeType> getAllByStatus();

    void delete(Long id);

	public PrivilegeType updatePriviCount(Long privilegeTypeId);
	
	public PrivilegeType getById(Long id);

	public PrivilegeType updatePriviCountTo(Long id);

	List<Privilege> getAllPrivilegeByType(String type);

}
