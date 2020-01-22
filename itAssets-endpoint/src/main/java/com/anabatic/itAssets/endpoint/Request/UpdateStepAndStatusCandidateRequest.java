package com.anabatic.itAssets.endpoint.Request;

public class UpdateStepAndStatusCandidateRequest {
	private Long id;
	private Integer step;
	private Integer status;
	private Integer selection;
	private String comment;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getStep() {
		return step;
	}
	public void setStep(Integer step) {
		this.step = step;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getSelection() {
		return selection;
	}
	public void setSelection(Integer selection) {
		this.selection = selection;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	

}
