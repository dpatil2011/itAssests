package com.anabatic.itAssets.persistence.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "users")
@DynamicUpdate
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "full_name")
	private String fullName;

	@Column(name = "father_name")
	private String fatherName;

	@Column(name = "father_addar")
	private String fatherAddar;

	@Column(name = "father_dateOfBirth")
	private Date fatherDateOfBirth;

	@Column(name = "mother_name")
	private String motherName;

	@Column(name = "mother_addar")
	private String motherAddar;

	@Column(name = "mother_dateOfBirth")
	private Date motherDateOfBirth;

	@Column(name = "sibling1")
	private String sibling1;

	@Column(name = "sibling1_dateOfBirth")
	private Date sibling1DateOfBirth;

	@Column(name = "sibling2")
	private String sibling2;

	@Column(name = "sibling2_dateOfBirth")
	private Date sibling2DateOfBirth;

	@Column(name = "sibling3")
	private String sibling3;

	@Column(name = "sibling3_dateOfBirth")
	private Date sibling3DateOfBirth;

	@Column(name = "employee_id")
	private String employeeId;

	@Column(name = "spouce_name")
	private String spouceName;

	@Column(name = "spouce_adhar")
	private String spouceAdhar;

	@Column(name = "gender")
	private String gender;

	@Column(name = "date_of_birth")
	private Date dateofbirth;

	@Column(name = "birth_place")
	private String birthPlace;

	@Column(name = "nationality")
	private String nationality;

	@Column(name = "current_address")
	private String currentAddress;

	@Column(name = "city")
	private String city;

	@Column(name = "pincode")
	private String pincode;

	@Column(name = "religion")
	private String religion;

	@Column(name = "marital_status")
	private String maritalStatus;

	@Column(name = "date_of_marriage")
	private Date dateOfMarriage;

	@Column(name = "phonenumber")
	private String phoneNumber;

	@Column(name = "driving_license")
	private String drivingLicense;

	@Column(name = "passport_number")
	private String passportNumber;

	@Column(name = "pan")
	private String pan;

	@Column(name = "aadhar")
	private String aadhar;

	@Column(name = "personal_email")
	private String personalEmail;

	@Column(name = "Offical_Email")
	private String officalEmail;

	@Column(name = "reporting_manager")
	private String reportingManager;

	@Column(name = "department")
	private String department;

	@Column(name = "job_title")
	private String jobTitle;

	@Column(name = "date_Of_Join")
	private Date dateOfJoin;

	@Column(name = "permanet_address")
	private String permanetAddress;

	@Column(name = "photo")
	private String photo;

	@Column(name = "blood_group")
	private String bloodGroup;

	@Column(name = "dl_group")
	private String dlGroup;

	@Column(name = "corp_Id")
	private String corpId;

	@Column(name = "atipl_Id")
	private String atiplId;

	@Column(name = "password")
	private String password;

	@Column(name = "hr_password")
	private String hrPassword;

	@Column(name = "graduation")
	private String graduation;

	@Column(name = "graduation_start_year")
	private String graduationStartYear;

	@Column(name = "graduation_end_year")
	private String graduationEndYear;

	@Column(name = "graduation_major")
	private String graduationMajor;

	@Column(name = "graduation_grade")
	private String graduationgrade;

	@Column(name = "matric_start_year")
	private String matricStartYear;

	@Column(name = "matric_end_year")
	private String matricEndYear;

	@Column(name = "matric_grade")
	private String matricgrade;

	@Column(name = "secondary_start_year")
	private String secondaryStartYear;

	@Column(name = "secondary_end_year")
	private String secondaryEndYear;

	@Column(name = "secondary_grade")
	private String secondarygrade;

	@Column(name = "post_graduation")
	private String postGraduation;

	@Column(name = "post_graduation_start_year")
	private String postGraduationStartYear;

	@Column(name = "post_graduation_end_year")
	private String postGraduationEndYear;

	@Column(name = "post_graduation_major")
	private String postGraduationMajor;

	@Column(name = "post_graduation_grade")
	private String postGraduationGrade;

	@Column(name = "status")
	private Integer status;

	@OneToMany(mappedBy = "users", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Skills> skills;

	@OneToMany(mappedBy = "users", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<UserDocument> userDocument;

	@OneToMany(mappedBy = "users", fetch = FetchType.LAZY)
	private List<Privilege> privilege;

	@OneToMany(mappedBy = "userId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Request> request;

	@OneToMany(mappedBy = "users", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Candidate> candidate;

	public List<UserDocument> getUserDocument() {
		return userDocument;
	}

	public void setUserDocument(List<UserDocument> userDocument) {
		this.userDocument = userDocument;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getFatherAddar() {
		return fatherAddar;
	}

	public void setFatherAddar(String fatherAddar) {
		this.fatherAddar = fatherAddar;
	}

	public Date getFatherDateOfBirth() {
		return fatherDateOfBirth;
	}

	public void setFatherDateOfBirth(Date fatherDateOfBirth) {
		this.fatherDateOfBirth = fatherDateOfBirth;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getMotherAddar() {
		return motherAddar;
	}

	public void setMotherAddar(String motherAddar) {
		this.motherAddar = motherAddar;
	}

	public Date getMotherDateOfBirth() {
		return motherDateOfBirth;
	}

	public void setMotherDateOfBirth(Date motherDateOfBirth) {
		this.motherDateOfBirth = motherDateOfBirth;
	}

	public String getSibling1() {
		return sibling1;
	}

	public void setSibling1(String sibling1) {
		this.sibling1 = sibling1;
	}

	public Date getSibling1DateOfBirth() {
		return sibling1DateOfBirth;
	}

	public void setSibling1DateOfBirth(Date sibling1DateOfBirth) {
		this.sibling1DateOfBirth = sibling1DateOfBirth;
	}

	public String getSibling2() {
		return sibling2;
	}

	public void setSibling2(String sibling2) {
		this.sibling2 = sibling2;
	}

	public Date getSibling2DateOfBirth() {
		return sibling2DateOfBirth;
	}

	public void setSibling2DateOfBirth(Date sibling2DateOfBirth) {
		this.sibling2DateOfBirth = sibling2DateOfBirth;
	}

	public String getSibling3() {
		return sibling3;
	}

	public void setSibling3(String sibling3) {
		this.sibling3 = sibling3;
	}

	public Date getSibling3DateOfBirth() {
		return sibling3DateOfBirth;
	}

	public void setSibling3DateOfBirth(Date sibling3DateOfBirth) {
		this.sibling3DateOfBirth = sibling3DateOfBirth;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getSpouceName() {
		return spouceName;
	}

	public void setSpouceName(String spouceName) {
		this.spouceName = spouceName;
	}

	public String getSpouceAdhar() {
		return spouceAdhar;
	}

	public void setSpouceAdhar(String spouceAdhar) {
		this.spouceAdhar = spouceAdhar;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getCurrentAddress() {
		return currentAddress;
	}

	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public Date getDateOfMarriage() {
		return dateOfMarriage;
	}

	public void setDateOfMarriage(Date dateOfMarriage) {
		this.dateOfMarriage = dateOfMarriage;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getDrivingLicense() {
		return drivingLicense;
	}

	public void setDrivingLicense(String drivingLicense) {
		this.drivingLicense = drivingLicense;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getAadhar() {
		return aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}

	public String getPersonalEmail() {
		return personalEmail;
	}

	public void setPersonalEmail(String personalEmail) {
		this.personalEmail = personalEmail;
	}

	public String getOfficalEmail() {
		return officalEmail;
	}

	public void setOfficalEmail(String officalEmail) {
		this.officalEmail = officalEmail;
	}

	public String getReportingManager() {
		return reportingManager;
	}

	public void setReportingManager(String reportingManager) {
		this.reportingManager = reportingManager;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public Date getDateOfJoin() {
		return dateOfJoin;
	}

	public void setDateOfJoin(Date dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}

	public String getPermanetAddress() {
		return permanetAddress;
	}

	public void setPermanetAddress(String permanetAddress) {
		this.permanetAddress = permanetAddress;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getDlGroup() {
		return dlGroup;
	}

	public void setDlGroup(String dlGroup) {
		this.dlGroup = dlGroup;
	}

	public String getCorpId() {
		return corpId;
	}

	public void setCorpId(String corpId) {
		this.corpId = corpId;
	}

	public String getAtiplId() {
		return atiplId;
	}

	public void setAtiplId(String atiplId) {
		this.atiplId = atiplId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getHrPassword() {
		return hrPassword;
	}

	public void setHrPassword(String hrPassword) {
		this.hrPassword = hrPassword;
	}

	public String getGraduation() {
		return graduation;
	}

	public void setGraduation(String graduation) {
		this.graduation = graduation;
	}

	public String getGraduationStartYear() {
		return graduationStartYear;
	}

	public void setGraduationStartYear(String graduationStartYear) {
		this.graduationStartYear = graduationStartYear;
	}

	public String getGraduationEndYear() {
		return graduationEndYear;
	}

	public void setGraduationEndYear(String graduationEndYear) {
		this.graduationEndYear = graduationEndYear;
	}

	public String getGraduationMajor() {
		return graduationMajor;
	}

	public void setGraduationMajor(String graduationMajor) {
		this.graduationMajor = graduationMajor;
	}

	public String getGraduationgrade() {
		return graduationgrade;
	}

	public void setGraduationgrade(String graduationgrade) {
		this.graduationgrade = graduationgrade;
	}

	public String getMatricStartYear() {
		return matricStartYear;
	}

	public void setMatricStartYear(String matricStartYear) {
		this.matricStartYear = matricStartYear;
	}

	public String getMatricEndYear() {
		return matricEndYear;
	}

	public void setMatricEndYear(String matricEndYear) {
		this.matricEndYear = matricEndYear;
	}

	public String getMatricgrade() {
		return matricgrade;
	}

	public void setMatricgrade(String matricgrade) {
		this.matricgrade = matricgrade;
	}

	public String getSecondaryStartYear() {
		return secondaryStartYear;
	}

	public void setSecondaryStartYear(String secondaryStartYear) {
		this.secondaryStartYear = secondaryStartYear;
	}

	public String getSecondaryEndYear() {
		return secondaryEndYear;
	}

	public void setSecondaryEndYear(String secondaryEndYear) {
		this.secondaryEndYear = secondaryEndYear;
	}

	public String getSecondarygrade() {
		return secondarygrade;
	}

	public void setSecondarygrade(String secondarygrade) {
		this.secondarygrade = secondarygrade;
	}

	public String getPostGraduation() {
		return postGraduation;
	}

	public void setPostGraduation(String postGraduation) {
		this.postGraduation = postGraduation;
	}

	public String getPostGraduationStartYear() {
		return postGraduationStartYear;
	}

	public void setPostGraduationStartYear(String postGraduationStartYear) {
		this.postGraduationStartYear = postGraduationStartYear;
	}

	public String getPostGraduationEndYear() {
		return postGraduationEndYear;
	}

	public void setPostGraduationEndYear(String postGraduationEndYear) {
		this.postGraduationEndYear = postGraduationEndYear;
	}

	public String getPostGraduationMajor() {
		return postGraduationMajor;
	}

	public void setPostGraduationMajor(String postGraduationMajor) {
		this.postGraduationMajor = postGraduationMajor;
	}

	public String getPostGraduationGrade() {
		return postGraduationGrade;
	}

	public void setPostGraduationGrade(String postGraduationGrade) {
		this.postGraduationGrade = postGraduationGrade;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public List<Skills> getSkills() {
		return skills;
	}

	public void setSkills(List<Skills> skills) {
		this.skills = skills;
	}

	public List<Privilege> getPrivilege() {
		return privilege;
	}

	public void setPrivilege(List<Privilege> privilege) {
		this.privilege = privilege;
	}

	public List<Request> getRequest() {
		return request;
	}

	public void setRequest(List<Request> request) {
		this.request = request;
	}

	public List<Candidate> getCandidate() {
		return candidate;
	}

	public void setCandidate(List<Candidate> candidate) {
		this.candidate = candidate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aadhar == null) ? 0 : aadhar.hashCode());
		result = prime * result + ((atiplId == null) ? 0 : atiplId.hashCode());
		result = prime * result + ((birthPlace == null) ? 0 : birthPlace.hashCode());
		result = prime * result + ((bloodGroup == null) ? 0 : bloodGroup.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((corpId == null) ? 0 : corpId.hashCode());
		result = prime * result + ((currentAddress == null) ? 0 : currentAddress.hashCode());
		result = prime * result + ((dateOfJoin == null) ? 0 : dateOfJoin.hashCode());
		result = prime * result + ((dateOfMarriage == null) ? 0 : dateOfMarriage.hashCode());
		result = prime * result + ((dateofbirth == null) ? 0 : dateofbirth.hashCode());
		result = prime * result + ((department == null) ? 0 : department.hashCode());
		result = prime * result + ((dlGroup == null) ? 0 : dlGroup.hashCode());
		result = prime * result + ((drivingLicense == null) ? 0 : drivingLicense.hashCode());
		result = prime * result + ((employeeId == null) ? 0 : employeeId.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((graduation == null) ? 0 : graduation.hashCode());
		result = prime * result + ((graduationEndYear == null) ? 0 : graduationEndYear.hashCode());
		result = prime * result + ((graduationMajor == null) ? 0 : graduationMajor.hashCode());
		result = prime * result + ((graduationStartYear == null) ? 0 : graduationStartYear.hashCode());
		result = prime * result + ((graduationgrade == null) ? 0 : graduationgrade.hashCode());
		result = prime * result + ((hrPassword == null) ? 0 : hrPassword.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((jobTitle == null) ? 0 : jobTitle.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((maritalStatus == null) ? 0 : maritalStatus.hashCode());
		result = prime * result + ((matricEndYear == null) ? 0 : matricEndYear.hashCode());
		result = prime * result + ((matricStartYear == null) ? 0 : matricStartYear.hashCode());
		result = prime * result + ((matricgrade == null) ? 0 : matricgrade.hashCode());
		result = prime * result + ((nationality == null) ? 0 : nationality.hashCode());
		result = prime * result + ((officalEmail == null) ? 0 : officalEmail.hashCode());
		result = prime * result + ((pan == null) ? 0 : pan.hashCode());
		result = prime * result + ((passportNumber == null) ? 0 : passportNumber.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((permanetAddress == null) ? 0 : permanetAddress.hashCode());
		result = prime * result + ((personalEmail == null) ? 0 : personalEmail.hashCode());
		result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
		result = prime * result + ((photo == null) ? 0 : photo.hashCode());
		result = prime * result + ((pincode == null) ? 0 : pincode.hashCode());
		result = prime * result + ((postGraduation == null) ? 0 : postGraduation.hashCode());
		result = prime * result + ((postGraduationEndYear == null) ? 0 : postGraduationEndYear.hashCode());
		result = prime * result + ((postGraduationGrade == null) ? 0 : postGraduationGrade.hashCode());
		result = prime * result + ((postGraduationMajor == null) ? 0 : postGraduationMajor.hashCode());
		result = prime * result + ((postGraduationStartYear == null) ? 0 : postGraduationStartYear.hashCode());
		result = prime * result + ((religion == null) ? 0 : religion.hashCode());
		result = prime * result + ((reportingManager == null) ? 0 : reportingManager.hashCode());
		result = prime * result + ((secondaryEndYear == null) ? 0 : secondaryEndYear.hashCode());
		result = prime * result + ((secondaryStartYear == null) ? 0 : secondaryStartYear.hashCode());
		result = prime * result + ((secondarygrade == null) ? 0 : secondarygrade.hashCode());
		result = prime * result + ((skills == null) ? 0 : skills.hashCode());
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
		Users other = (Users) obj;
		if (aadhar == null) {
			if (other.aadhar != null)
				return false;
		} else if (!aadhar.equals(other.aadhar))
			return false;
		if (atiplId == null) {
			if (other.atiplId != null)
				return false;
		} else if (!atiplId.equals(other.atiplId))
			return false;
		if (birthPlace == null) {
			if (other.birthPlace != null)
				return false;
		} else if (!birthPlace.equals(other.birthPlace))
			return false;
		if (bloodGroup == null) {
			if (other.bloodGroup != null)
				return false;
		} else if (!bloodGroup.equals(other.bloodGroup))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (corpId == null) {
			if (other.corpId != null)
				return false;
		} else if (!corpId.equals(other.corpId))
			return false;
		if (currentAddress == null) {
			if (other.currentAddress != null)
				return false;
		} else if (!currentAddress.equals(other.currentAddress))
			return false;
		if (dateOfJoin == null) {
			if (other.dateOfJoin != null)
				return false;
		} else if (!dateOfJoin.equals(other.dateOfJoin))
			return false;
		if (dateOfMarriage == null) {
			if (other.dateOfMarriage != null)
				return false;
		} else if (!dateOfMarriage.equals(other.dateOfMarriage))
			return false;
		if (dateofbirth == null) {
			if (other.dateofbirth != null)
				return false;
		} else if (!dateofbirth.equals(other.dateofbirth))
			return false;
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		if (dlGroup == null) {
			if (other.dlGroup != null)
				return false;
		} else if (!dlGroup.equals(other.dlGroup))
			return false;
		if (drivingLicense == null) {
			if (other.drivingLicense != null)
				return false;
		} else if (!drivingLicense.equals(other.drivingLicense))
			return false;
		if (employeeId == null) {
			if (other.employeeId != null)
				return false;
		} else if (!employeeId.equals(other.employeeId))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (graduation == null) {
			if (other.graduation != null)
				return false;
		} else if (!graduation.equals(other.graduation))
			return false;
		if (graduationEndYear == null) {
			if (other.graduationEndYear != null)
				return false;
		} else if (!graduationEndYear.equals(other.graduationEndYear))
			return false;
		if (graduationMajor == null) {
			if (other.graduationMajor != null)
				return false;
		} else if (!graduationMajor.equals(other.graduationMajor))
			return false;
		if (graduationStartYear == null) {
			if (other.graduationStartYear != null)
				return false;
		} else if (!graduationStartYear.equals(other.graduationStartYear))
			return false;
		if (graduationgrade == null) {
			if (other.graduationgrade != null)
				return false;
		} else if (!graduationgrade.equals(other.graduationgrade))
			return false;
		if (hrPassword == null) {
			if (other.hrPassword != null)
				return false;
		} else if (!hrPassword.equals(other.hrPassword))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (jobTitle == null) {
			if (other.jobTitle != null)
				return false;
		} else if (!jobTitle.equals(other.jobTitle))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (maritalStatus == null) {
			if (other.maritalStatus != null)
				return false;
		} else if (!maritalStatus.equals(other.maritalStatus))
			return false;
		if (matricEndYear == null) {
			if (other.matricEndYear != null)
				return false;
		} else if (!matricEndYear.equals(other.matricEndYear))
			return false;
		if (matricStartYear == null) {
			if (other.matricStartYear != null)
				return false;
		} else if (!matricStartYear.equals(other.matricStartYear))
			return false;
		if (matricgrade == null) {
			if (other.matricgrade != null)
				return false;
		} else if (!matricgrade.equals(other.matricgrade))
			return false;
		if (nationality == null) {
			if (other.nationality != null)
				return false;
		} else if (!nationality.equals(other.nationality))
			return false;
		if (officalEmail == null) {
			if (other.officalEmail != null)
				return false;
		} else if (!officalEmail.equals(other.officalEmail))
			return false;
		if (pan == null) {
			if (other.pan != null)
				return false;
		} else if (!pan.equals(other.pan))
			return false;
		if (passportNumber == null) {
			if (other.passportNumber != null)
				return false;
		} else if (!passportNumber.equals(other.passportNumber))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (permanetAddress == null) {
			if (other.permanetAddress != null)
				return false;
		} else if (!permanetAddress.equals(other.permanetAddress))
			return false;
		if (personalEmail == null) {
			if (other.personalEmail != null)
				return false;
		} else if (!personalEmail.equals(other.personalEmail))
			return false;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		if (photo == null) {
			if (other.photo != null)
				return false;
		} else if (!photo.equals(other.photo))
			return false;
		if (pincode == null) {
			if (other.pincode != null)
				return false;
		} else if (!pincode.equals(other.pincode))
			return false;
		if (postGraduation == null) {
			if (other.postGraduation != null)
				return false;
		} else if (!postGraduation.equals(other.postGraduation))
			return false;
		if (postGraduationEndYear == null) {
			if (other.postGraduationEndYear != null)
				return false;
		} else if (!postGraduationEndYear.equals(other.postGraduationEndYear))
			return false;
		if (postGraduationGrade == null) {
			if (other.postGraduationGrade != null)
				return false;
		} else if (!postGraduationGrade.equals(other.postGraduationGrade))
			return false;
		if (postGraduationMajor == null) {
			if (other.postGraduationMajor != null)
				return false;
		} else if (!postGraduationMajor.equals(other.postGraduationMajor))
			return false;
		if (postGraduationStartYear == null) {
			if (other.postGraduationStartYear != null)
				return false;
		} else if (!postGraduationStartYear.equals(other.postGraduationStartYear))
			return false;

		if (religion == null) {
			if (other.religion != null)
				return false;
		} else if (!religion.equals(other.religion))
			return false;
		if (reportingManager == null) {
			if (other.reportingManager != null)
				return false;
		} else if (!reportingManager.equals(other.reportingManager))
			return false;
		if (secondaryEndYear == null) {
			if (other.secondaryEndYear != null)
				return false;
		} else if (!secondaryEndYear.equals(other.secondaryEndYear))
			return false;
		if (secondaryStartYear == null) {
			if (other.secondaryStartYear != null)
				return false;
		} else if (!secondaryStartYear.equals(other.secondaryStartYear))
			return false;
		if (secondarygrade == null) {
			if (other.secondarygrade != null)
				return false;
		} else if (!secondarygrade.equals(other.secondarygrade))
			return false;
		if (skills == null) {
			if (other.skills != null)
				return false;
		} else if (!skills.equals(other.skills))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", fullName=" + fullName
				+ ", fatherName=" + fatherName + ", fatherAddar=" + fatherAddar + ", fatherDateOfBirth="
				+ fatherDateOfBirth + ", motherName=" + motherName + ", motherAddar=" + motherAddar
				+ ", motherDateOfBirth=" + motherDateOfBirth + ", sibling1=" + sibling1 + ", sibling1DateOfBirth="
				+ sibling1DateOfBirth + ", sibling2=" + sibling2 + ", sibling2DateOfBirth=" + sibling2DateOfBirth
				+ ", sibling3=" + sibling3 + ", sibling3DateOfBirth=" + sibling3DateOfBirth + ", employeeId="
				+ employeeId + ", spouceName=" + spouceName + ", spouceAdhar=" + spouceAdhar + ", gender=" + gender
				+ ", dateofbirth=" + dateofbirth + ", birthPlace=" + birthPlace + ", nationality=" + nationality
				+ ", currentAddress=" + currentAddress + ", city=" + city + ", pincode=" + pincode + ", religion="
				+ religion + ", maritalStatus=" + maritalStatus + ", dateOfMarriage=" + dateOfMarriage
				+ ", phoneNumber=" + phoneNumber + ", drivingLicense=" + drivingLicense + ", passportNumber="
				+ passportNumber + ", pan=" + pan + ", aadhar=" + aadhar + ", personalEmail=" + personalEmail
				+ ", officalEmail=" + officalEmail + ", reportingManager=" + reportingManager + ", department="
				+ department + ", jobTitle=" + jobTitle + ", dateOfJoin=" + dateOfJoin + ", permanetAddress="
				+ permanetAddress + ", photo=" + photo + ", bloodGroup=" + bloodGroup + ", dlGroup=" + dlGroup
				+ ", corpId=" + corpId + ", atiplId=" + atiplId + ", password=" + password + ", hrPassword="
				+ hrPassword + ", graduation=" + graduation + ", graduationStartYear=" + graduationStartYear
				+ ", graduationEndYear=" + graduationEndYear + ", graduationMajor=" + graduationMajor
				+ ", graduationgrade=" + graduationgrade + ", matricStartYear=" + matricStartYear + ", matricEndYear="
				+ matricEndYear + ", matricgrade=" + matricgrade + ", secondaryStartYear=" + secondaryStartYear
				+ ", secondaryEndYear=" + secondaryEndYear + ", secondarygrade=" + secondarygrade + ", postGraduation="
				+ postGraduation + ", postGraduationStartYear=" + postGraduationStartYear + ", postGraduationEndYear="
				+ postGraduationEndYear + ", postGraduationMajor=" + postGraduationMajor + ", postGraduationGrade="
				+ postGraduationGrade + ", status=" + status + ", skills=" + skills + ", userDocument=" + userDocument
				+ ", privilege=" + privilege + ", request=" + request + ", candidate=" + candidate
				+ ", getUserDocument()=" + getUserDocument() + ", getId()=" + getId() + ", getFirstName()="
				+ getFirstName() + ", getLastName()=" + getLastName() + ", getFullName()=" + getFullName()
				+ ", getFatherName()=" + getFatherName() + ", getFatherAddar()=" + getFatherAddar()
				+ ", getFatherDateOfBirth()=" + getFatherDateOfBirth() + ", getMotherName()=" + getMotherName()
				+ ", getMotherAddar()=" + getMotherAddar() + ", getMotherDateOfBirth()=" + getMotherDateOfBirth()
				+ ", getSibling1()=" + getSibling1() + ", getSibling1DateOfBirth()=" + getSibling1DateOfBirth()
				+ ", getSibling2()=" + getSibling2() + ", getSibling2DateOfBirth()=" + getSibling2DateOfBirth()
				+ ", getSibling3()=" + getSibling3() + ", getSibling3DateOfBirth()=" + getSibling3DateOfBirth()
				+ ", getEmployeeId()=" + getEmployeeId() + ", getSpouceName()=" + getSpouceName()
				+ ", getSpouceAdhar()=" + getSpouceAdhar() + ", getGender()=" + getGender() + ", getDateofbirth()="
				+ getDateofbirth() + ", getBirthPlace()=" + getBirthPlace() + ", getNationality()=" + getNationality()
				+ ", getCurrentAddress()=" + getCurrentAddress() + ", getCity()=" + getCity() + ", getPincode()="
				+ getPincode() + ", getReligion()=" + getReligion() + ", getMaritalStatus()=" + getMaritalStatus()
				+ ", getDateOfMarriage()=" + getDateOfMarriage() + ", getPhoneNumber()=" + getPhoneNumber()
				+ ", getDrivingLicense()=" + getDrivingLicense() + ", getPassportNumber()=" + getPassportNumber()
				+ ", getPan()=" + getPan() + ", getAadhar()=" + getAadhar() + ", getPersonalEmail()="
				+ getPersonalEmail() + ", getOfficalEmail()=" + getOfficalEmail() + ", getReportingManager()="
				+ getReportingManager() + ", getDepartment()=" + getDepartment() + ", getJobTitle()=" + getJobTitle()
				+ ", getDateOfJoin()=" + getDateOfJoin() + ", getPermanetAddress()=" + getPermanetAddress()
				+ ", getPhoto()=" + getPhoto() + ", getBloodGroup()=" + getBloodGroup() + ", getDlGroup()="
				+ getDlGroup() + ", getCorpId()=" + getCorpId() + ", getAtiplId()=" + getAtiplId() + ", getPassword()="
				+ getPassword() + ", getHrPassword()=" + getHrPassword() + ", getGraduation()=" + getGraduation()
				+ ", getGraduationStartYear()=" + getGraduationStartYear() + ", getGraduationEndYear()="
				+ getGraduationEndYear() + ", getGraduationMajor()=" + getGraduationMajor() + ", getGraduationgrade()="
				+ getGraduationgrade() + ", getMatricStartYear()=" + getMatricStartYear() + ", getMatricEndYear()="
				+ getMatricEndYear() + ", getMatricgrade()=" + getMatricgrade() + ", getSecondaryStartYear()="
				+ getSecondaryStartYear() + ", getSecondaryEndYear()=" + getSecondaryEndYear()
				+ ", getSecondarygrade()=" + getSecondarygrade() + ", getPostGraduation()=" + getPostGraduation()
				+ ", getPostGraduationStartYear()=" + getPostGraduationStartYear() + ", getPostGraduationEndYear()="
				+ getPostGraduationEndYear() + ", getPostGraduationMajor()=" + getPostGraduationMajor()
				+ ", getPostGraduationGrade()=" + getPostGraduationGrade() + ", getStatus()=" + getStatus()
				+ ", getSkills()=" + getSkills() + ", getPrivilege()=" + getPrivilege() + ", getRequest()="
				+ getRequest() + ", getCandidate()=" + getCandidate() + ", hashCode()=" + hashCode() + ", getClass()="
				+ getClass() + ", toString()=" + super.toString() + "]";
	}

	

}