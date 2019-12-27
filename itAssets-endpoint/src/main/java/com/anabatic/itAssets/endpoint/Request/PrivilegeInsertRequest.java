package com.anabatic.itAssets.endpoint.Request;

import com.anabatic.itAssets.persistence.model.PrivilegeType;
import com.anabatic.itAssets.persistence.model.Users;

public class PrivilegeInsertRequest {

	private Integer status;
	private Long usersId;
	private PrivilegeType privilegeType;
}
