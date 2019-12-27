package com.anabatic.itAssets.endpoint.Request;

public class PrivilegeInsertRequest {


	private Long usersId;
	private Long privilegeTypeId;
	
	
	public Long getUsersId() {
		return usersId;
	}
	public void setUsersId(Long usersId) {
		this.usersId = usersId;
	}
	public Long getPrivilegeTypeId() {
		return privilegeTypeId;
	}
	public void setPrivilegeTypeId(Long privilegeTypeId) {
		this.privilegeTypeId = privilegeTypeId;
	}
	
}
