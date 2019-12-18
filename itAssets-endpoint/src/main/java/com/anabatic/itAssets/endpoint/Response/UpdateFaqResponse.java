package com.anabatic.itAssets.endpoint.Response;

public class UpdateFaqResponse {

	private Long id;
	private String question;
	private String questionTo;
	private String answer;
	private Integer status;
	private Integer identifier;
	private Long userId;
	private Long repliedBy;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
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

	public Long getRepliedBy() {
		return repliedBy;
	}

	public void setRepliedBy(Long repliedBy) {
		this.repliedBy = repliedBy;
	}

	public String getQuestionTo() {
		return questionTo;
	}

	public void setQuestionTo(String questionTo) {
		this.questionTo = questionTo;
	}
}
