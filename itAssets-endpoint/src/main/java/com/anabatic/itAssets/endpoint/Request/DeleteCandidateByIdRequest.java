package com.anabatic.itAssets.endpoint.Request;

import com.anabatic.generic.persistence.annotation.IsRequired;

public class DeleteCandidateByIdRequest {

	@IsRequired
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
