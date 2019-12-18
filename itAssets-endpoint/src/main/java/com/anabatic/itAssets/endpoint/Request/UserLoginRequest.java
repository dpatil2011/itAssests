package com.anabatic.itAssets.endpoint.Request;

import org.apache.logging.log4j.core.config.plugins.validation.constraints.Required;

import com.anabatic.generic.persistence.annotation.IsRequired;

public class UserLoginRequest {
	@IsRequired
	private String employeeId;
	@IsRequired
	private String password;
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
