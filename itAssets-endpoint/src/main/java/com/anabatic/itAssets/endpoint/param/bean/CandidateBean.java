package com.anabatic.itAssets.endpoint.param.bean;

import java.sql.Time;
import java.util.Date;

import com.anabatic.itAssets.persistence.model.Users;

public class CandidateBean {
	private Long id;
	private String name;
	private String email;
	private String phoneNo;
	private String skills;
	private Long users;
	private Long usersr;
	private String comment;
	private String fileName;
	private String uploadDir;
	private String fileType;
	private Long filesize;
	private Date interviewDate;
	private Time interviewStartTime;
	private Time interviewEndTime;
	private String modeOfInterview;
	private String slot;
	private Date dateOfJoining;
	private String cin;
	private Integer step;

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

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}


	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getUploadDir() {
		return uploadDir;
	}

	public void setUploadDir(String uploadDir) {
		this.uploadDir = uploadDir;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public Long getFilesize() {
		return filesize;
	}

	public void setFilesize(Long filesize) {
		this.filesize = filesize;
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

	public String getModeOfInterview() {
		return modeOfInterview;
	}

	public void setModeOfInterview(String modeOfInterview) {
		this.modeOfInterview = modeOfInterview;
	}

	public String getSlot() {
		return slot;
	}

	public void setSlot(String slot) {
		this.slot = slot;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public Integer getStep() {
		return step;
	}

	public void setStep(Integer step) {
		this.step = step;
	}

	public Long getUsers() {
		return users;
	}

	public void setUsers(Long users) {
		this.users = users;
	}

	public Long getUsersr() {
		return usersr;
	}

	public void setUsersr(Long usersr) {
		this.usersr = usersr;
	}

}
