package org.itAssests.core.constant;

import com.anabatic.generic.core.constant.ErrorConstant;
import com.anabatic.generic.core.exception.Error;

public class UsersErrorConstant extends ErrorConstant{

	public static final String USER_LOGIN_VALIDATION_KEY = "USER_LOGIN_VALIDATION";
	public static final String LOGIN_VALIDATION_KEY = "LOGIN_VALIDATION";
	public static final String USER_NOT_FOUND_KEY = "USER_NOT_FOUND";
	public static final String EMPLOYEE_ID_KEY = "EMPLOYEE_ID";


	
	
	public static final com.anabatic.generic.core.exception.Error USER_LOGIN_VALIDATION = new Error("user-100","Invalid employeID or password ", "Invalid employeID or password ");
	public static final com.anabatic.generic.core.exception.Error LOGIN_VALIDATION = new Error("user-101","Invalid UserName or password ", "Invalid UserName or password ");
	public static final com.anabatic.generic.core.exception.Error USER_NOT_FOUND = new Error("user-102","User not found", "User not found");
	public static final com.anabatic.generic.core.exception.Error EMPLOYEE_ID = new Error("user-103","EMPLOYEE_ID already assign to other user", "EMPLOYEE_ID already assign to other user");

	static  {
		errors.put(USER_LOGIN_VALIDATION_KEY, USER_LOGIN_VALIDATION);
		errors.put(LOGIN_VALIDATION_KEY, LOGIN_VALIDATION);
		errors.put(USER_NOT_FOUND_KEY, USER_NOT_FOUND);
		errors.put(EMPLOYEE_ID_KEY, EMPLOYEE_ID);


	}

}
