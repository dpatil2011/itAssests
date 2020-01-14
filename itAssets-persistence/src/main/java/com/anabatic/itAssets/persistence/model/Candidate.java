
package com.anabatic.itAssets.persistence.model;

import java.sql.Time;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.anabatic.generic.persistence.annotation.IsRequired;

@Entity
@Table(name = "candidate")
public class Candidate {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@IsRequired
	@Column(name = "name")
	private String name;

	@IsRequired
	@Column(name = "email")
	private String email;

	@IsRequired
	@Column(name = "phone_number")
	private String phoneNo;

	@Column(name = "skills")
	private String skills;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "manager_id")
	private Users users;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "recruiter_id")
	private Users usersr;

	@Column(name = "comment")
	private String comment;

	@Column(name = "file_name")
	private String fileName;

	@Column(name = "upload_dir")
	private String uploadDir;

	@Column(name = "file_type")
	private String fileType;

	@Column(name = "file_size")
	private Long filesize;

	@Column(name = "interview_date")
	private Date interviewDate;

	@Column(name = "interview_start_time")
	private Time interviewStartTime;

	@Column(name = "interview_end_time")
	private Time interviewEndTime;

	@Column(name = "mode")
	private String modeOfInterview;

	@Column(name = "slot")
	private String slot;

	@Column(name = "date_of_joining")
	private Date dateOfJoining;

	@Column(name = "cin")
	private String cin;

	@Column(name = "step")
	private Integer step;

	public Integer getStep() {
		return step;
	}

	public void setStep(Integer step) {
		this.step = step;
	}

	@OneToMany(mappedBy = "cId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<CandidateRecord> candidateRecord;

	public Time getInterviewEndTime() {
		return interviewEndTime;
	}

	public void setInterviewEndTime(Time interviewEndTime) {
		this.interviewEndTime = interviewEndTime;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public Date getInterviewDate() {
		return interviewDate;
	}

	public void setInterviewDate(Date interviewDate) {
		this.interviewDate = interviewDate;
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

	public Users getUsersr() {
		return usersr;
	}

	public void setUsersr(Users usersr) {
		this.usersr = usersr;
	}

	public List<CandidateRecord> getCandidateRecord() {
		return candidateRecord;
	}

	public void setCandidateRecord(List<CandidateRecord> candidateRecord) {
		this.candidateRecord = candidateRecord;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
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

	public String getUploadDir() {
		return uploadDir;
	}

	public void setUploadDir(String uploadDir) {
		this.uploadDir = uploadDir;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	@Column(name = "experience")
	private Float experience;

	@Column(name = "status")
	private Integer status;

	@Column(name = "selection")
	private Integer selectinStatus;

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

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Time getInterviewStartTime() {
		return interviewStartTime;
	}

	public void setInterviewStartTime(Time interviewStartTime) {
		this.interviewStartTime = interviewStartTime;
	}

	public Integer getSelectinStatus() {
		return selectinStatus;
	}

	public void setSelectinStatus(Integer selectinStatus) {
		this.selectinStatus = selectinStatus;
	}

}
