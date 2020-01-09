package com.anabatic.itAssets.endpoint.param.bean;

public class CommentBean {
	private Integer step;
	private String commentedBy;
	private String comment;

	public Integer getStep() {
		return step;
	}

	public void setStep(Integer step) {
		this.step = step;
	}

	public String getCommentedBy() {
		return commentedBy;
	}

	public void setCommentedBy(String commentedBy) {
		this.commentedBy = commentedBy;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}
