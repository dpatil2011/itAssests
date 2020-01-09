package com.anabatic.itAssets.endpoint.Request;

import java.util.Date;

public class JoiningDateCandidateRequest {
	
	private Long id;
	private Date dateOfJoining;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

}
