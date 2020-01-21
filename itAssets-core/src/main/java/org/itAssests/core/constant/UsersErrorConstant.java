package org.itAssests.core.constant;

import com.anabatic.generic.core.constant.ErrorConstant;
import com.anabatic.generic.core.exception.Error;

public class UsersErrorConstant extends ErrorConstant{

	public static final String USER_LOGIN_VALIDATION_KEY = "USER_LOGIN_VALIDATION";
	public static final String LOGIN_VALIDATION_KEY = "LOGIN_VALIDATION";
	public static final String USER_NOT_FOUND_KEY = "USER_NOT_FOUND";
	public static final String EMPLOYEE_ID_KEY = "EMPLOYEE_ID";
	public static final String PHONE_NO_KEY = "PHONE_NO";
	public static final String CANDIDATE_KEY = "CANDIDATE";
	public static final String INVALID_PHONE_KEY = "INVALID_PHONE";
	public static final String INVALID_EMAIL_KEY = "EMAIL_ID";
	public static final String INVALID_CANDIDATE_KEY = "CANDIDATE_EXISTS";



	public static final com.anabatic.generic.core.exception.Error PHONE_NO = new Error("user-100","Phone No already exists", "Phone No already exists");

	
	public static final com.anabatic.generic.core.exception.Error USER_LOGIN_VALIDATION = new Error("user-100","Invalid employeID or password ", "Invalid employeID or password ");
	public static final com.anabatic.generic.core.exception.Error LOGIN_VALIDATION = new Error("user-101","Invalid UserName or password ", "Invalid UserName or password ");
	public static final com.anabatic.generic.core.exception.Error USER_NOT_FOUND = new Error("user-102","User not found", "User not found");
	public static final com.anabatic.generic.core.exception.Error EMPLOYEE_ID = new Error("user-103","EMPLOYEE_ID already assign to other user", "EMPLOYEE_ID already assign to other user");
	public static final com.anabatic.generic.core.exception.Error INVALID_PHONE = new Error("candidate-101","PHONE_NO already in use", "PHONE_NO already in use");
	public static final com.anabatic.generic.core.exception.Error EMAIL_ID = new Error("candidate-102","EmailId already in use", "EMAIL_ID already in use");
	public static final com.anabatic.generic.core.exception.Error CANDIDATE_EXISTS = new Error("candidate-100","candidate with same EMAIL_ID and PHONE_NO already exists", "candidate with same EMAIL_ID and PHONE_NO already exists");
	public static final com.anabatic.generic.core.exception.Error CANDIDATE = new Error("candidate-107","Candidate not present", "candidate not present please check candidate id");

	static  {
		
		errors.put(PHONE_NO_KEY, PHONE_NO);
		errors.put(CANDIDATE_KEY, CANDIDATE);
		errors.put(USER_LOGIN_VALIDATION_KEY, USER_LOGIN_VALIDATION);
		errors.put(LOGIN_VALIDATION_KEY, LOGIN_VALIDATION);
		errors.put(USER_NOT_FOUND_KEY, USER_NOT_FOUND);
		errors.put(EMPLOYEE_ID_KEY, EMPLOYEE_ID);
		errors.put(INVALID_PHONE_KEY, INVALID_PHONE);
		errors.put(INVALID_EMAIL_KEY, EMAIL_ID);
		errors.put(INVALID_CANDIDATE_KEY, CANDIDATE_EXISTS);


	}

}
