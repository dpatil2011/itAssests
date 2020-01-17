package com.anabatic.itAssets.endpoint.Response;

import java.util.Date;

public class GetByCandidateCandidateRecordResponse {

	private String comment;
	private String commentedBy;
	private Date cDate;

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getCommentedBy() {
		return commentedBy;
	}

	public void setCommentedBy(String commentedBy) {
		this.commentedBy = commentedBy;
	}

	public Date getcDate() {
		return cDate;
	}

	public void setcDate(Date cDate) {
		this.cDate = cDate;
	}
}
