package com.anabatic.itAssets.endpoint.Request;

public class BulkStatusChangeRequest {
	private Long id;
	private Integer status;
	private Integer step;

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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}