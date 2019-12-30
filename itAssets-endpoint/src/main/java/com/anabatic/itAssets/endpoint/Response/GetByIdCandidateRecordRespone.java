package com.anabatic.itAssets.endpoint.Response;

import java.util.Date;

public class GetByIdCandidateRecordRespone {

	private Long id;
	private Long userId;
	private Integer status;
	private String data;
	private Date date;
	private Long hmUserId;
	private Long rUserId;
	private Long cId;

	public Long getHmUserId() {
		return hmUserId;
	}

	public void setHmUserId(Long hmUserId) {
		this.hmUserId = hmUserId;
	}

	public Long getrUserId() {
		return rUserId;
	}

	public void setrUserId(Long rUserId) {
		this.rUserId = rUserId;
	}

	public Long getcId() {
		return cId;
	}

	public void setcId(Long cId) {
		this.cId = cId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
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
