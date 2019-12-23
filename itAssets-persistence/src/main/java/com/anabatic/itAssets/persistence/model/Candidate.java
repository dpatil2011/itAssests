package com.anabatic.itAssets.persistence.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	@JoinColumn(name = "manager_id")
	private Users users;

	@Column(name = "comment")
	private String comment;

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

	

}