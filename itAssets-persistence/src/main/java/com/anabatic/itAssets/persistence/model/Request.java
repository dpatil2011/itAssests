package com.anabatic.itAssets.persistence.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.anabatic.generic.persistence.model.TypicalGenericModel;

@Entity
@Table(name = "request")
public class Request extends TypicalGenericModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "reason")
	private String reason;

	@Column(name = "requestTo")
	private String requestTo;

	@Column(name = "department")
	private String department;

	@Column(name = "requestItem")
	private String request;

	@Column(name = "quantity")
	private Integer quantity;

	@Column(name = "requestType")
	private String requestType;

	@Column(name = "requestedDate")
	private Date requestedDate;

	@Column(name = "closingDate")
	private Date closingDate;
//
//	@ManyToOne(fetch = FetchType.EAGER)
//	@JoinColumn(name = "userId")
//	private Assets userId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public String getRequest() {
		return request;
	}

	public void setRequest(String request) {
		this.request = request;
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

	public Date getRequestedDate() {
		return requestedDate;
	}

	public void setRequestedDate(Date requestedDate) {
		this.requestedDate = requestedDate;
	}

	public Date getClosingDate() {
		return closingDate;
	}

	public void setClosingDate(Date closingDate) {
		this.closingDate = closingDate;
	}

//	public Assets getUserId() {
//		return userId;
//	}
//
//	public void setUserId(Assets userId) {
//		this.userId = userId;
//	}

	
}
