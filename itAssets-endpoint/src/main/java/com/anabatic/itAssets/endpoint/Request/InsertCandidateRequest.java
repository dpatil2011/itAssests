package com.anabatic.itAssets.endpoint.Request;

import java.sql.Time;
import java.util.Date;

public class InsertCandidateRequest {

	private Long id;
	private String name;
	private String email;
	private String phoneNo;
	private String skills;
	private Float experience;
	private Integer status;
	private String comment;
	private Long managerId;
	private Long hmId;
	private Long rId;
	private Integer step;
	private String slot;
	private String cin;
	private Date doj;
	private String modeOfInterview;
	private Date interviewDate;
	private Time interviewStartTime;
	private Time interviewEndTime;
	private String uploadDir;
	private String fileName;
	private Long fileSize;
	private String fileType;

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Long getHmId() {
		return hmId;
	}

	public void setHmId(Long hmId) {
		this.hmId = hmId;
	}

	public Long getrId() {
		return rId;
	}

	public void setrId(Long rId) {
		this.rId = rId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public Float getExperience() {
		return experience;
	}

	public void setExperience(Float experience) {
		this.experience = experience;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Long getManagerId() {
		return managerId;
	}

	public void setManagerId(Long managerId) {
		this.managerId = managerId;
	}

	public Integer getStep() {
		return step;
	}

	public void setStep(Integer step) {
		this.step = step;
	}

	public String getSlot() {
		return slot;
	}

	public void setSlot(String slot) {
		this.slot = slot;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public String getModeOfInterview() {
		return modeOfInterview;
	}

	public void setModeOfInterview(String modeOfInterview) {
		this.modeOfInterview = modeOfInterview;
	}

	public Date getInterviewDate() {
		return interviewDate;
	}

	public void setInterviewDate(Date interviewDate) {
		this.interviewDate = interviewDate;
	}

	public Time getInterviewStartTime() {
		return interviewStartTime;
	}

	public void setInterviewStartTime(Time interviewStartTime) {
		this.interviewStartTime = interviewStartTime;
	}

	public Time getInterviewEndTime() {
		return interviewEndTime;
	}

	public void setInterviewEndTime(Time interviewEndTime) {
		this.interviewEndTime = interviewEndTime;
	}

	public String getUploadDir() {
		return uploadDir;
	}

	public void setUploadDir(String uploadDir) {
		this.uploadDir = uploadDir;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Long getFileSize() {
		return fileSize;
	}

	public void setFileSize(Long fileSize) {
		this.fileSize = fileSize;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

}
