package com.anabatic.itAssets.endpoint.Request;

import java.util.Date;

public class JoiningDateCandidateRequest {
	
	private Long id;
	private Date dateOfJoining;
	private String comment;
	private Integer status;
	private Integer step;
	private Integer selection;

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getStep() {
		return step;
	}

	public void setStep(Integer step) {
		this.step = step;
	}

	public Integer getSelection() {
		return selection;
	}

	public void setSelection(Integer selection) {
		this.selection = selection;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

}
