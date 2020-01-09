package com.anabatic.itAssets.endpoint.Request;

import java.sql.Time;
import java.util.Date;

import com.anabatic.generic.persistence.annotation.IsRequired;

public class ScheduleInterviewCandidateRequest {

	@IsRequired
	private Long id;
	@IsRequired
	private Date interviewDate;
	@IsRequired
	private String mode;
	@IsRequired
	private Time startTime;
	@IsRequired
	private Time endTime;
	@IsRequired
	private Integer step;
	@IsRequired
	private Integer status;
	@IsRequired
	private String comment;
	@IsRequired
	private Long cId;

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Integer getStep() {
		return step;
	}

	public void setStep(Integer step) {
		this.step = step;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Time getEndTime() {
		return endTime;
	}

	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getInterviewDate() {
		return interviewDate;
	}

	public void setInterviewDate(Date interviewDate) {
		this.interviewDate = interviewDate;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public Long getcId() {
		return cId;
	}

	public void setcId(Long cId) {
		this.cId = cId;
	}

}
