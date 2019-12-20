package com.anabatic.itAssets.endpoint.Request;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.anabatic.generic.persistence.annotation.IsRequired;
import com.anabatic.itAssets.persistence.model.Privilege;
import com.anabatic.itAssets.persistence.model.Skills;

public class UsersRequest {	
	
	private Long id;
	@IsRequired
	private String firstName;
	private String lastName;
	private String fullName;
	private String fatherName;
	private String fatherDateOfBirth;
	private String motherName;
	private String motherDateOfBirth;
	private String sibling1;
	private String sibling1DateOfBirth;
	private String sibling2;
	private String sibling2DateOfBirth;
	private String sibling3;
	private String sibling3DateOfBirth;
	private String spouceName;
	private String spouceAdhar;
	private String fatherAddar;
	private String motherAddar;
	private String employeeId;
	@IsRequired
	private String gender;
	@IsRequired
	private String dateofbirth;
	@IsRequired
	private String birthPlace;
	@IsRequired
	private String nationality;
	private String currentAddress;
	@IsRequired
	private String city;
	@IsRequired
	private String pincode;
	@IsRequired
	private String religion;
	@IsRequired
	private String maritalStatus;
	private String dateOfMarriage;
	@IsRequired
	private String phoneNumber;
	private String drivingLicense;
	@IsRequired
	private String passportNumber;
	@IsRequired
	private String pan;
	@IsRequired
	private String aadhar;
	@IsRequired
	private String personalEmail;
	private String officalEmail;
	private String reportingManager;
	private String department;
	private String jobTitle;
	private String dateOfJoin;
	private String permanetAddress;
	private String photo;
	@IsRequired
	private String bloodGroup;
	private String dlGroup;
	private String corpId;
	private String atiplId;
	private String password;
	private String hrPassword;
	private String graduation;
	private String graduationStartYear;
	private String graduationEndYear;
	private String graduationMajor;
	private String graduationgrade;
	private String matricStartYear;
	private String matricEndYear;
	private String matricgrade;
	private String secondaryStartYear;
	private String secondaryEndYear;
	private String secondarygrade;
	private String postGraduation;
	private String postGraduationStartYear;
	private String postGraduationEndYear;
	private String postGraduationMajor;
	private String postGraduationGrade;
	private List<Skills> skills;
	private Privilege privilege;
	private Integer status;
	
	public String getFatherDateOfBirth() {
		return fatherDateOfBirth;
	}
	public void setFatherDateOfBirth(String fatherDateOfBirth) {
		this.fatherDateOfBirth = fatherDateOfBirth;
	}
	public String getSibling1DateOfBirth() {
		return sibling1DateOfBirth;
	}
	public void setSibling1DateOfBirth(String sibling1DateOfBirth) {
		this.sibling1DateOfBirth = sibling1DateOfBirth;
	}
	public String getSibling2() {
		return sibling2;
	}
	public void setSibling2(String sibling2) {
		this.sibling2 = sibling2;
	}
	public String getSibling2DateOfBirth() {
		return sibling2DateOfBirth;
	}
	public void setSibling2DateOfBirth(String sibling2DateOfBirth) {
		this.sibling2DateOfBirth = sibling2DateOfBirth;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getMotherDateOfBirth() {
		return motherDateOfBirth;
	}
	public void setMotherDateOfBirth(String motherDateOfBirth) {
		this.motherDateOfBirth = motherDateOfBirth;
	}
	public String getSibling1() {
		return sibling1;
	}
	public void setSibling1(String sibling1) {
		this.sibling1 = sibling1;
	}
	public String getSibling3() {
		return sibling3;
	}
	public void setSibling3(String sibling3) {
		this.sibling3 = sibling3;
	}
	public String getSibling3DateOfBirth() {
		return sibling3DateOfBirth;
	}
	public void setSibling3DateOfBirth(String sibling3DateOfBirth) {
		this.sibling3DateOfBirth = sibling3DateOfBirth;
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
	public String getFatherAddar() {
		return fatherAddar;
	}
	public void setFatherAddar(String fatherAddar) {
		this.fatherAddar = fatherAddar;
	}
	public String getMotherAddar() {
		return motherAddar;
	}
	public void setMotherAddar(String motherAddar) {
		this.motherAddar = motherAddar;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	private String experience;
	
	
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
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
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(String dateofbirth) {
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
	public String getDateOfMarriage() {
		return dateOfMarriage;
	}
	public void setDateOfMarriage(String dateOfMarriage) {
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
	public String getDateOfJoin() {
		return dateOfJoin;
	}
	public void setDateOfJoin(String dateOfJoin) {
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
	public List<Skills> getSkills() {
		return skills;
	}
	public void setSkills(List<Skills> skills) {
		this.skills = skills;
	}
	public Privilege getPrivilege() {
		return privilege;
	}
	public void setPrivilege(Privilege privilege) {
		this.privilege = privilege;
	}
	
	

}
