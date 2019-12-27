package com.anabatic.itAssets.endpoint.Response;

import java.util.Date;
import java.util.List;

import com.anabatic.itAssets.endpoint.Request.SkillBean;
import com.anabatic.itAssets.endpoint.param.bean.PrivilegeTypeBean;
import com.anabatic.itAssets.endpoint.param.bean.UsersBean;

public class GetByStatusPrivilegeResponse {
	
	private Long id;
	private Integer status;
	private Date fromDate;
	private Date toDate;
	
	private Long privilegeTypeId;
	private String privilegeType;
	private Integer privilegeTypeStatus;
	private String icon;
	private String color;
	private Integer priviCount;
	
	private Long UserId;
	private String firstName;
	private String lastName;
	private String employeeId;
	private String gender;
	private Date dateofbirth;
	private String birthPlace;
	private String nationality;
	private String currentAddress;
	private String city;
	private String pincode;
	private String religion;
	private String maritalStatus;
	private Date dateOfMarriage;
	private String phoneNumber;
	private String drivingLicense;
	private String passportNumber;
	private String pan;
	private String aadhar;
	private String personalEmail;
	private String officalEmail;
	private String reportingManager;
	private String department;
	private String jobTitle;
	private Date dateOfJoin;
	private String permanetAddress;
	private String photo;
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
	private String userstatus;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	public Long getPrivilegeTypeId() {
		return privilegeTypeId;
	}
	public void setPrivilegeTypeId(Long privilegeTypeId) {
		this.privilegeTypeId = privilegeTypeId;
	}
	public String getPrivilegeType() {
		return privilegeType;
	}
	public void setPrivilegeType(String privilegeType) {
		this.privilegeType = privilegeType;
	}
	public Integer getPrivilegeTypeStatus() {
		return privilegeTypeStatus;
	}
	public void setPrivilegeTypeStatus(Integer privilegeTypeStatus) {
		this.privilegeTypeStatus = privilegeTypeStatus;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Integer getPriviCount() {
		return priviCount;
	}
	public void setPriviCount(Integer priviCount) {
		this.priviCount = priviCount;
	}
	public Long getUserId() {
		return UserId;
	}
	public void setUserId(Long userId) {
		UserId = userId;
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
	public String getUserstatus() {
		return userstatus;
	}
	public void setUserstatus(String userstatus) {
		this.userstatus = userstatus;
	}
	public List<SkillBean> getSkills() {
		return skills;
	}
	public void setSkills(List<SkillBean> skills) {
		this.skills = skills;
	}
	private List<SkillBean> skills;
	
	

	
	
	
	
	
	

}
