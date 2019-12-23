package com.anabatic.itAssets.endpoint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anabatic.generic.persistence.validator.field.ValidationCheck;
import com.anabatic.itAssets.endpoint.Request.UserLoginRequest;
import com.anabatic.itAssets.endpoint.Response.GetAllUsersResponse;
import com.anabatic.itAssets.endpoint.Response.LoginResponse;
import com.anabatic.itAssets.endpoint.Response.UserLoginResponse;
import com.anabatic.itAssets.endpoint.converter.LoginConverter;
import com.anabatic.itAssets.persistence.model.Login;
import com.anabatic.itAssets.persistence.model.Users;
import com.anabatic.itAssets.services.service.LoginService;
import com.anabatic.logging.annotation.Log;

@CrossOrigin(origins="*",allowedHeaders="*")
@RestController
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@Autowired
	private LoginConverter loginConverter;
	
	    @GetMapping(value = "/get", consumes = "application/json", produces = "application/json")
	    public ResponseEntity<List<LoginResponse>> getAll() {
	    	  List<Login> res = loginService.getAll(); 
	    	  List<LoginResponse> contracts = loginConverter.toContracts(res);
	        return ResponseEntity.ok().body(contracts);
	    }
	    
//	    @PostMapping(path = "/login", consumes = "application/json", produces = "application/json")
//	    @Log(message = "post method Users login with \"\r\n"
//	            + "        + \"Users")
//	    public ResponseEntity<?> login(
//	            @RequestBody UserLoginRequest request) {
//	    	
//	         ValidationCheck.hasValidate(request);
//	        Users users = userLoginConverter.toModel(request);
//	        Users users2 = usersService.login(
//	                users.getEmployeeId(), users.getPassword());
//	        UserLoginResponse response = userLoginConverter
//	                .toContract(users2);
//	        baseResponse.setResponse(response);
//	        return new ResponseEntity<>(baseResponse, HttpStatus.OK);
//	    }    

}
