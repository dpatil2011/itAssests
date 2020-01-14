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

@Entity
@Table(name = "certification")
public class Certification {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "certification_on")
	private String certificationOn;
	
	@Column(name = "certified_by")
	private String cretifiedBy;
	
	@Column(name = "month")
	private Integer month;
	
	@Column(name = "year")
	private Integer year;
	
	@Column(name = "certifications_upload")
	private String certificationsUpload;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	private Users users;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCertificationOn() {
		return certificationOn;
	}

	public void setCertificationOn(String certificationOn) {
		this.certificationOn = certificationOn;
	}

	public String getCretifiedBy() {
		return cretifiedBy;
	}

	public void setCretifiedBy(String cretifiedBy) {
		this.cretifiedBy = cretifiedBy;
	}

	public Integer getMonth() {
		return month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getCertificationsUpload() {
		return certificationsUpload;
	}

	public void setCertificationsUpload(String certificationsUpload) {
		this.certificationsUpload = certificationsUpload;
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
		result = prime * result + ((certificationOn == null) ? 0 : certificationOn.hashCode());
		result = prime * result + ((certificationsUpload == null) ? 0 : certificationsUpload.hashCode());
		result = prime * result + ((cretifiedBy == null) ? 0 : cretifiedBy.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((month == null) ? 0 : month.hashCode());
		result = prime * result + ((users == null) ? 0 : users.hashCode());
		result = prime * result + ((year == null) ? 0 : year.hashCode());
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
		Certification other = (Certification) obj;
		if (certificationOn == null) {
			if (other.certificationOn != null)
				return false;
		} else if (!certificationOn.equals(other.certificationOn))
			return false;
		if (certificationsUpload == null) {
			if (other.certificationsUpload != null)
				return false;
		} else if (!certificationsUpload.equals(other.certificationsUpload))
			return false;
		if (cretifiedBy == null) {
			if (other.cretifiedBy != null)
				return false;
		} else if (!cretifiedBy.equals(other.cretifiedBy))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (month == null) {
			if (other.month != null)
				return false;
		} else if (!month.equals(other.month))
			return false;
		if (users == null) {
			if (other.users != null)
				return false;
		} else if (!users.equals(other.users))
			return false;
		if (year == null) {
			if (other.year != null)
				return false;
		} else if (!year.equals(other.year))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Certification [id=" + id + ", certificationOn=" + certificationOn + ", cretifiedBy=" + cretifiedBy
				+ ", month=" + month + ", year=" + year + ", certificationsUpload=" + certificationsUpload + ", users="
				+ users + "]";
	}
}
