package com.anabatic.itAssets.endpoint.Request;

import com.anabatic.generic.persistence.annotation.IsRequired;

public class GetByUserIdAndQuestionToFaqRequest {

	@IsRequired
	    private String questionTo;
	@IsRequired
	private Long userId;

	
	public String getQuestionTo() {
		return questionTo;
	}
	public void setQuestionTo(String questionTo) {
		this.questionTo = questionTo;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	   
}
	    
	