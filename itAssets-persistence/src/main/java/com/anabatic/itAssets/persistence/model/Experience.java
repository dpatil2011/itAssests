package com.anabatic.itAssets.persistence.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "experience")
public class Experience {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "designation")
	private String designation; 
	
	@Column(name = "start_date")
	private Date startDate;
	
	@Column(name = "end_date")
	private Date endDate;
	
	@Column(name = "years_of_experience")
	private Integer yearsOfExperience;
	
	@Column(name = "months_of_experience")
	private Integer monthsOfExperience;
	
	@Column(name = "relevent_years_of_experience")
	private Integer releventYearsOfExperience;
	
	@Column(name = "relevent_months_of_experience")
	private Integer releventMonthsOfExperience;
	
	@Column(name = "upload")
	private String upload;
	
	@Column(name = "fresher")
	private Boolean fresher;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	private Users users;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Integer getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(Integer yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	public Integer getMonthsOfExperience() {
		return monthsOfExperience;
	}

	public void setMonthsOfExperience(Integer monthsOfExperience) {
		this.monthsOfExperience = monthsOfExperience;
	}

	public Integer getReleventYearsOfExperience() {
		return releventYearsOfExperience;
	}

	public void setReleventYearsOfExperience(Integer releventYearsOfExperience) {
		this.releventYearsOfExperience = releventYearsOfExperience;
	}

	public Integer getReleventMonthsOfExperience() {
		return releventMonthsOfExperience;
	}

	public void setReleventMonthsOfExperience(Integer releventMonthsOfExperience) {
		this.releventMonthsOfExperience = releventMonthsOfExperience;
	}

	public String getUpload() {
		return upload;
	}

	public void setUpload(String upload) {
		this.upload = upload;
	}

	public Boolean getFresher() {
		return fresher;
	}

	public void setFresher(Boolean fresher) {
		this.fresher = fresher;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((companyName == null) ? 0 : companyName.hashCode());
		result = prime * result + ((designation == null) ? 0 : designation.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + ((fresher == null) ? 0 : fresher.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((monthsOfExperience == null) ? 0 : monthsOfExperience.hashCode());
		result = prime * result + ((releventMonthsOfExperience == null) ? 0 : releventMonthsOfExperience.hashCode());
		result = prime * result + ((releventYearsOfExperience == null) ? 0 : releventYearsOfExperience.hashCode());
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		result = prime * result + ((upload == null) ? 0 : upload.hashCode());
		result = prime * result + ((users == null) ? 0 : users.hashCode());
		result = prime * result + ((yearsOfExperience == null) ? 0 : yearsOfExperience.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Experience other = (Experience) obj;
		if (companyName == null) {
			if (other.companyName != null)
				return false;
		} else if (!companyName.equals(other.companyName))
			return false;
		if (designation == null) {
			if (other.designation != null)
				return false;
		} else if (!designation.equals(other.designation))
			return false;
		if (endDate == null) {
			if (other.endDate != null)
				return false;
		} else if (!endDate.equals(other.endDate))
			return false;
		if (fresher == null) {
			if (other.fresher != null)
				return false;
		} else if (!fresher.equals(other.fresher))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (monthsOfExperience == null) {
			if (other.monthsOfExperience != null)
				return false;
		} else if (!monthsOfExperience.equals(other.monthsOfExperience))
			return false;
		if (releventMonthsOfExperience == null) {
			if (other.releventMonthsOfExperience != null)
				return false;
		} else if (!releventMonthsOfExperience.equals(other.releventMonthsOfExperience))
			return false;
		if (releventYearsOfExperience == null) {
			if (other.releventYearsOfExperience != null)
				return false;
		} else if (!releventYearsOfExperience.equals(other.releventYearsOfExperience))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		if (upload == null) {
			if (other.upload != null)
				return false;
		} else if (!upload.equals(other.upload))
			return false;
		if (users == null) {
			if (other.users != null)
				return false;
		} else if (!users.equals(other.users))
			return false;
		if (yearsOfExperience == null) {
			if (other.yearsOfExperience != null)
				return false;
		} else if (!yearsOfExperience.equals(other.yearsOfExperience))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Experience [id=" + id + ", companyName=" + companyName + ", designation=" + designation + ", startDate="
				+ startDate + ", endDate=" + endDate + ", yearsOfExperience=" + yearsOfExperience
				+ ", monthsOfExperience=" + monthsOfExperience + ", releventYearsOfExperience="
				+ releventYearsOfExperience + ", releventMonthsOfExperience=" + releventMonthsOfExperience + ", upload="
				+ upload + ", fresher=" + fresher + ", users=" + users + "]";
	}
	
}
