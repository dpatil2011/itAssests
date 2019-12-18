package com.anabatic.itAssets.endpoint.Response;

import com.anabatic.itAssets.persistence.model.Users;

public class UsersReqRes {
	
	private String reason;
	private String requestTo;
	private String department;
	private String requestItem;
	private Integer quantity;
	private String requestType;
	private String requestId;
	private Users userId;
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getRequestTo() {
		return requestTo;
	}
	public void setRequestTo(String requestTo) {
		this.requestTo = requestTo;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getRequestItem() {
		return requestItem;
	}
	public void setRequestItem(String requestItem) {
		this.requestItem = requestItem;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public String getRequestType() {
		return requestType;
	}
	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}
	public String getRequestId() {
		return requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public Users getUserId() {
		return userId;
	}
	public void setUserId(Users userId) {
		this.userId = userId;
	}
	
	

}
