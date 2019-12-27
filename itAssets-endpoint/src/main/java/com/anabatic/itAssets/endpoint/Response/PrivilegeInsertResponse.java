package com.anabatic.itAssets.endpoint.Response;

import java.util.Date;

public class PrivilegeInsertResponse {

	private Long id;
	private Integer status;
	private Date fromDate;
	private Date toDate;
	private Long privilegeTypeId;
	private String privilegeType;
	private String fullName;
	private Integer privilegeTypeStatus;
	private String icon;
	private String color;
	private Integer priviCount;
	private Long UserId;
	private String employeeId;
	private String officalEmail;
	private String department;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	public Long getPrivilegeTypeId() {
		return privilegeTypeId;
	}
	public void setPrivilegeTypeId(Long privilegeTypeId) {
		this.privilegeTypeId = privilegeTypeId;
	}
	public String getPrivilegeType() {
		return privilegeType;
	}
	public void setPrivilegeType(String privilegeType) {
		this.privilegeType = privilegeType;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Integer getPrivilegeTypeStatus() {
		return privilegeTypeStatus;
	}
	public void setPrivilegeTypeStatus(Integer privilegeTypeStatus) {
		this.privilegeTypeStatus = privilegeTypeStatus;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Integer getPriviCount() {
		return priviCount;
	}
	public void setPriviCount(Integer priviCount) {
		this.priviCount = priviCount;
	}
	public Long getUserId() {
		return UserId;
	}
	public void setUserId(Long userId) {
		UserId = userId;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getOfficalEmail() {
		return officalEmail;
	}
	public void setOfficalEmail(String officalEmail) {
		this.officalEmail = officalEmail;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

    
}
