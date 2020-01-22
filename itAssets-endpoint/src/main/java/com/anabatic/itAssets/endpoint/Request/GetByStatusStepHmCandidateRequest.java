package com.anabatic.itAssets.endpoint.Request;

public class GetByStatusStepHmCandidateRequest {
	
	private Integer status;
	private Integer step;
	private Long hmId;
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
	public Long getHmId() {
		return hmId;
	}
	public void setHmId(Long hmId) {
		this.hmId = hmId;
	}
	
	

}
