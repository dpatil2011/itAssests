package com.anabatic.itAssets.endpoint.Request;

public class InsertFaqRequest {
	private String question;
	private String questionTo;
	
	private Integer status;
	private Integer identifier;
	private Long userId;
	
	
	
	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getIdentifier() {
		return identifier;
	}

	public void setIdentifier(Integer identifier) {
		this.identifier = identifier;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	

	public String getQuestionTo() {
		return questionTo;
	}

	public void setQuestionTo(String questionTo) {
		this.questionTo = questionTo;
	}

	

	
}
