package com.anabatic.itAssets.persistence.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.anabatic.generic.persistence.model.TypicalGenericModel;

@Entity
@Table(name = "users")
public class Users extends TypicalGenericModel {
 
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
	        
	
}
