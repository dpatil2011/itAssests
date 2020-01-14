package com.anabatic.itAssets.endpoint.Request;

import com.anabatic.generic.persistence.annotation.IsRequired;

public class GetByStepCandidateRequest {
	
	@IsRequired
	private Integer step;

	public Integer getStep() {
		return step;
	}

	public void setStep(Integer step) {
		this.step = step;
	}
	

}
