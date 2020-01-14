package com.anabatic.itAssets.endpoint.Request;

public class SelectionCandidateRequest {

	private Long id;
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
