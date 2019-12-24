package com.anabatic.itAssets.endpoint.Request;

import com.anabatic.generic.persistence.annotation.IsRequired;

public class GetByQuestionToFaqRequest {

	@IsRequired
	    private String questionTo;
	
	public String getQuestionTo() {
		return questionTo;
	}
	public void setQuestionTo(String questionTo) {
		this.questionTo = questionTo;
	}
	
	   
}
	    
	