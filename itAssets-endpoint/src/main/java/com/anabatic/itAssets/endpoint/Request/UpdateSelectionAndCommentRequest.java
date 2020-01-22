package com.anabatic.itAssets.endpoint.Request;

public class UpdateSelectionAndCommentRequest {
	private Long id;
	private String comment;
	private Integer selection;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Integer getSelection() {
		return selection;
	}

	public void setSelection(Integer selection) {
		this.selection = selection;
	}

}
