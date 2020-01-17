package com.anabatic.itAssets.endpoint.Request;

import com.anabatic.generic.persistence.annotation.IsRequired;

public class UpdateSelectionCandidateRequest {

	@IsRequired
	private Long id;
	@IsRequired
	private Integer selection;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getSelection() {
		return selection;
	}
	public void setSelection(Integer selection) {
		this.selection = selection;
	}
	
}
