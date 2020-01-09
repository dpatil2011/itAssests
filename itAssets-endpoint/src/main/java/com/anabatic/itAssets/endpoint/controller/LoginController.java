package com.anabatic.itAssets.endpoint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anabatic.generic.endpoint.contract.BaseResponse;
import com.anabatic.itAssets.endpoint.Request.LoginVarificationRequest;
import com.anabatic.itAssets.endpoint.Request.UpdateLoginRequest;
import com.anabatic.itAssets.endpoint.Request.UserLogin;
import com.anabatic.itAssets.endpoint.Response.GetByIdUsersResponse;
import com.anabatic.itAssets.endpoint.Response.LoginResponse;
import com.anabatic.itAssets.endpoint.converter.GetByIdUsersConverter;
import com.anabatic.itAssets.endpoint.converter.InsertLoginConverter;
import com.anabatic.itAssets.endpoint.converter.LoginConverter;
import com.anabatic.itAssets.endpoint.converter.UpdateLoginConverter;
import com.anabatic.itAssets.persistence.model.Login;
import com.anabatic.itAssets.persistence.model.Users;
import com.anabatic.itAssets.services.service.LoginService;

@CrossOrigin(origins="*",allowedHeaders="*")
@RestController
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@Autowired
	private LoginConverter loginConverter;
	
	@Autowired
	private InsertLoginConverter insertLoginConverter;
	
	@Autowired
	private UpdateLoginConverter updateLoginConverter;
	
	@Autowired
    private GetByIdUsersConverter getByIdUsersConverter;
	
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
	    
	    @PostMapping("/login")
		public ResponseEntity<BaseResponse> insert(@RequestBody LoginVarificationRequest request) {
			Login can1 = loginService.login(request.getUserName(),request.getPassword(),request.getRole());
		
			BaseResponse baseResponse = new BaseResponse();
			baseResponse.setResponse(insertLoginConverter.toContract(can1));
			return ResponseEntity.ok().body(baseResponse);
		}
	    
	    @PostMapping("/user-login")
        public ResponseEntity<BaseResponse> userLogin(@RequestBody UserLogin request) {
            Users login = loginService.userLogin(request.getUsername(),request.getPassword(),request.getPrivi());
        
            BaseResponse baseResponse = new BaseResponse();
            GetByIdUsersResponse response = getByIdUsersConverter
                    .toContract(login);
            baseResponse.setResponse(response);
            return ResponseEntity.ok().body(baseResponse);
        }
        
	    @PostMapping("/update")
		public ResponseEntity<BaseResponse> update(@RequestBody UpdateLoginRequest request) {
	    	Login request2 = updateLoginConverter.toModel(request);
	    	Login request3 = loginService.update(request2);
			BaseResponse baseResponse = new BaseResponse();
			baseResponse.setResponse(updateLoginConverter.toContract(request3));
			return ResponseEntity.ok().body(baseResponse);
		}

}
