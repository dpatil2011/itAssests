package com.anabatic.itAssets.endpoint.Request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BulkStatusChangeRequest {
	@JsonProperty
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
