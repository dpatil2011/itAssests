package com.anabatic.itAssets.endpoint.Response;

public class GetByIdCandidateResponse {

	
	private Long id;
	private String name;
	private String email;
	private Integer phoneNo; 
	private String skills;
	private Float experience;
	private Integer status;
	private String comment;
	private Long hmId;
	private Long rId;
	
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
	public Integer getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(Integer phoneNo) {
		this.phoneNo = phoneNo;
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
	

}
