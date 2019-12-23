package com.anabatic.itAssets.endpoint.Request;

public class GetByRequestToRequest {
	private Long userId;
	private String RequestTo;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getRequestTo() {
		return RequestTo;
	}

	public void setRequestTo(String requestTo) {
		RequestTo = requestTo;
	}

}
