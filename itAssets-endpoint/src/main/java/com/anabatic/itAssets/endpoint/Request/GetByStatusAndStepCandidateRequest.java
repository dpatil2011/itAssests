package com.anabatic.itAssets.endpoint.Request;

import javax.persistence.criteria.CriteriaBuilder.In;

import com.anabatic.generic.persistence.annotation.IsRequired;

public class GetByStatusAndStepCandidateRequest {

	@IsRequired
	private Integer status;
	@IsRequired
	private Integer step;
	private Integer selection;
	
	public Integer getSelection() {
		return selection;
	}
	public void setSelection(Integer selection) {
		this.selection = selection;
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
	
}
