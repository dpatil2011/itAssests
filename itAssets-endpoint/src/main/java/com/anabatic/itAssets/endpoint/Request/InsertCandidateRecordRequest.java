package com.anabatic.itAssets.endpoint.Request;

import java.util.Date;

public class InsertCandidateRecordRequest {
	
	private Long id;
	private Long rUserId;
	private Long hmUserId;
	private Long cId;
	private Integer status;
	private String data;
	private Date date;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getrUserId() {
		return rUserId;
	}
	public void setrUserId(Long rUserId) {
		this.rUserId = rUserId;
	}
	public Long getHmUserId() {
		return hmUserId;
	}
	public void setHmUserId(Long hmUserId) {
		this.hmUserId = hmUserId;
	}
	public Long getcId() {
		return cId;
	}
	public void setcId(Long cId) {
		this.cId = cId;
	}
	
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

}
