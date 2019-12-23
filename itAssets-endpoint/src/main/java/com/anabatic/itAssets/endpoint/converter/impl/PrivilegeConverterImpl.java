package com.anabatic.itAssets.endpoint.converter.impl;

import java.util.ArrayList;
import java.util.List;

import com.anabatic.itAssets.endpoint.Request.PrivilegeTypeRequest;
import com.anabatic.itAssets.endpoint.converter.PrivilegeConverter;
import com.anabatic.itAssets.persistence.model.PrivilegeType;

public class PrivilegeConverterImpl implements PrivilegeConverter {

	@Override
	public PrivilegeType toModel(PrivilegeTypeRequest object) {
		PrivilegeType privilegeType = new PrivilegeType();
		privilegeType.setId(object.getId());
		privilegeType.setPrivilegeType(object.getPrivilegeType());
		privilegeType.setStatus(object.getStatus());
		privilegeType.setIcon(object.getIcon());
		privilegeType.setColor(object.getColor());
		return privilegeType;
	}

	@Override
	public List<PrivilegeType> toModels(List<PrivilegeTypeRequest> objects) {
		List<PrivilegeType> list = new ArrayList<>();
		objects.forEach(x -> list.add(toModel(x)));
		return list;
	}

	@Override
	public PrivilegeTypeRequest toContract(PrivilegeType object) {
		PrivilegeTypeRequest privilegeTypeRequest = new PrivilegeTypeRequest();
		privilegeTypeRequest.setId(object.getId());
		privilegeTypeRequest.setPrivilegeType(object.getPrivilegeType());
		privilegeTypeRequest.setStatus(object.getStatus());
		privilegeTypeRequest.setIcon(object.getIcon());
		privilegeTypeRequest.setColor(object.getColor());
		return privilegeTypeRequest;
	}

	@Override
	public List<PrivilegeTypeRequest> toContracts(List<PrivilegeType> objects) {
		List<PrivilegeTypeRequest> list = new ArrayList<>();
		objects.forEach(x -> list.add(toContract(x)));
		return list;
	}

}
