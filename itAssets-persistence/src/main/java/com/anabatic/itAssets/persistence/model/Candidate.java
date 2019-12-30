
package com.anabatic.itAssets.persistence.model;

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
	private Integer phoneNo;

	@Column(name = "skills")
	private String skills;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "hm_id")
	private Users hmUsers;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "r_id")
	private Users rUsers;

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
	
	@OneToMany(mappedBy = "cId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<CandidateRecord> candidateRecord;

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

	public Integer getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Integer phoneNo) {
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

	
	public Users getHmUsers() {
		return hmUsers;
	}

	public void setHmUsers(Users hmUsers) {
		this.hmUsers = hmUsers;
	}

	public Users getrUsers() {
		return rUsers;
	}

	public void setrUsers(Users rUsers) {
		this.rUsers = rUsers;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	

}
