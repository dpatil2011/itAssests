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
import com.anabatic.generic.persistence.model.TypicalGenericModel;

@Entity
@Table(name = "users")
public class Users extends TypicalGenericModel {
 
    	private static final long serialVersionUID = 1L;

		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id")
	    private Long id;
	 
	    @Column(name = "first_name")
	    private String firstName;
	    
	    @Column(name = "last_name")
	    private String lastName;
	    
	    @Column(name = "employee_id")
	    private String employeeId;
	    
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
	    private String dateOfMarriage;
	    
	    @Column(name = "phonenumber")
	    private String phone_number;
	    
	    @Column(name = "driving_license")
	    private String driving_license;
	    
	    @Column(name = "passport_number")
	    private String passportNumber;
	    
	    @Column(name = "pan")
	    private String pan;
	    
	    @Column(name = "aadhar")
	    private String aadhar;
	    
	    @Column(name = "personal_email")
	    private String personal_email;
	    
	    
	    @Column(name = "Offical Email")
	    private String officalEmail;
	    
	    
	    @Column(name = "reporting_manager")
	    private String reportingManager;
	    
	    @Column(name = "department")
	    private String department;
	    
	    @Column(name = "job_title")
	    private String jobTitle;
	    
	    @Column(name = "date_Of_ Join")
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
	    
	    @Column( name = "graduation" )
	    private String graduation;
	    
	    @Column( name = "graduation_start_year" )
	    private String graduationStartYear;
	    
	    @Column( name = "graduation_end_year" )
	    private String graduationEndYear;
	    
	    @Column( name = "graduation_major" )
	    private String graduationMajor;
	    
	    @Column( name = "graduation_grade" )
	    private String graduationgrade;
	    
	    @Column( name = "matric_start_year" )
	    private String matricStartYear;
	    
	    @Column( name = "matric_end_year" )
	    private String matricEndYear;
	    
	    @Column( name = "matric_grade" )
	    private String matricgrade;
	    
	    @Column( name = "secondary_start_year" )
	    private String secondaryStartYear;
	    
	    @Column( name = "secondary_end_year")
	    private String secondaryEndYear;
	    
	    @Column( name = "secondary_grade")
	    private String secondarygrade;
	    
	    @Column( name = "postGraduation" )
	    private String postGraduation;
	    
	    @Column( name = "post_graduation_start_year" )
	    private String postGraduationStartYear;
	    
	    @Column( name = "post_graduation_end_year" )
	    private String postGraduationEndYear;
	    
	    @Column( name = "post_graduation_major" )
	    private String postGraduationMajor;
	    
	    @Column( name = "post_graduation_grade" )
	    private String postGraduationGrade;
	    
	    
	    @OneToMany(mappedBy = "users", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	    private List<Skills> skills;

		public List<Skills> getSkills() {
			return skills;
		}

		public void setSkills(List<Skills> skills) {
			this.skills = skills;
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

		public String getDateOfMarriage() {
			return dateOfMarriage;
		}

		public void setDateOfMarriage(String dateOfMarriage) {
			this.dateOfMarriage = dateOfMarriage;
		}

		public String getPhone_number() {
			return phone_number;
		}

		public void setPhone_number(String phone_number) {
			this.phone_number = phone_number;
		}

		public String getDriving_license() {
			return driving_license;
		}

		public void setDriving_license(String driving_license) {
			this.driving_license = driving_license;
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

		public String getPersonal_email() {
			return personal_email;
		}

		public void setPersonal_email(String personal_email) {
			this.personal_email = personal_email;
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
//
//		public List<Skills> getSkills() {
//			return skills;
//		}
//
//		public void setSkills(List<Skills> skills) {
//			this.skills = skills;
//		}

	
	        
	   
}
