package com.anabatic.itAssets.endpoint.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anabatic.generic.endpoint.contract.BaseResponse;
import com.anabatic.generic.persistence.validator.field.ValidationCheck;
import com.anabatic.itAssets.endpoint.Request.ChangePasswordRequest;
import com.anabatic.itAssets.endpoint.Request.DeleteByIdUserRequest;
import com.anabatic.itAssets.endpoint.Request.GetByIdUsersRequest;
import com.anabatic.itAssets.endpoint.Request.GetByStatusRequest;
import com.anabatic.itAssets.endpoint.Request.UserLoginRequest;
import com.anabatic.itAssets.endpoint.Request.UsersReq;
import com.anabatic.itAssets.endpoint.Request.UsersRequest;
import com.anabatic.itAssets.endpoint.Request.UsersUpdateRequest;
import com.anabatic.itAssets.endpoint.Response.GetAllUsersResponse;
import com.anabatic.itAssets.endpoint.Response.GetByIdUsersResponse;
import com.anabatic.itAssets.endpoint.Response.GetByStatusResponse;
import com.anabatic.itAssets.endpoint.Response.UserLoginResponse;
import com.anabatic.itAssets.endpoint.Response.UsersUpdateResponse;
import com.anabatic.itAssets.endpoint.converter.ChangePasswordConverter;
import com.anabatic.itAssets.endpoint.converter.DeleteByIdUserConverter;
import com.anabatic.itAssets.endpoint.converter.GetAllUsersConverter;
import com.anabatic.itAssets.endpoint.converter.GetByIdUsersConverter;
import com.anabatic.itAssets.endpoint.converter.GetByStatusUserConverter;
import com.anabatic.itAssets.endpoint.converter.UserLoginConverter;
import com.anabatic.itAssets.endpoint.converter.UsersConverter;
import com.anabatic.itAssets.endpoint.converter.UsersRequestConverter;
import com.anabatic.itAssets.endpoint.converter.UsersUpdateConverter;
import com.anabatic.itAssets.persistence.model.Users;
import com.anabatic.itAssets.services.service.RequestService;
import com.anabatic.itAssets.services.service.UsersService;
import com.anabatic.logging.annotation.Log;
import com.anabatic.logging.executor.Logging;
@CrossOrigin(origins="*",allowedHeaders="*")
@RestController
@RequestMapping("/users")
public class UsersController {

    private BaseResponse baseResponse = new BaseResponse();
	 private Logging logging = new Logging(this.getClass());

    
    @Autowired
    private UsersService usersService;
    
    @Autowired
    private UsersConverter usersConverter;
    
    @Autowired
    private GetAllUsersConverter getAllUsersConverter;
    
    @Autowired
    private GetByIdUsersConverter getByIdUsersConverter;
    
    @Autowired
    private UsersUpdateConverter usersUpdateConverter;
    
    @Autowired
    private DeleteByIdUserConverter deleteByIdUserConverter;
    
    @Autowired
    private UserLoginConverter userLoginConverter;
    
    @Autowired
    private UsersRequestConverter usersRequestConverter;
    
    @Autowired
    private GetByStatusUserConverter getByStatusUserConverter;
    
    @Autowired
    private RequestService requestService;
    
    @Autowired
    private ChangePasswordConverter changePasswordConverter;
    
    
    
    @PostMapping(value = "/insert", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BaseResponse> insert(
            @Valid @RequestBody UsersRequest usersRequest) {
    	 logging.INFO("inside user insert");
         ValidationCheck.hasValidate(usersRequest);
    	   baseResponse.setResponse(usersConverter.toContract(
    			   usersService.insert(usersConverter.toModel(usersRequest))));       
        return ResponseEntity.ok().body(baseResponse);

    }
    
    @GetMapping(value = "/get", consumes = "application/json", produces = "application/json")
    public ResponseEntity<List<GetAllUsersResponse>> getAll() {
    	
    	String g = new String();
    
    	  List<Users> res = usersService.getAll(); 
    	  List<GetAllUsersResponse> contracts = getAllUsersConverter.toContracts(res);
        return ResponseEntity.ok().body(contracts);
    }
    
    @PostMapping(path = "/getbyid", consumes = "application/json", produces = "application/json")
    @Log(message = "post method getbyid Users with \"\r\n"
            + "        + \"Users")
    public ResponseEntity<?> getById(
            @RequestBody GetByIdUsersRequest request) {
        Users users = getByIdUsersConverter.toModel(request);
        Users users2 = usersService.getById(
                users.getId());
        GetByIdUsersResponse response = getByIdUsersConverter
                .toContract(users2);
        baseResponse.setResponse(response);
        return new ResponseEntity<>(baseResponse, HttpStatus.OK);
    }
    
    @PutMapping(path = "/update", consumes = "application/json", produces = "application/json")
    @Log(message = "post method updating role with CoreRoleApi")
    public ResponseEntity<?> updateCoreRole(
            @RequestBody UsersUpdateRequest Request) {
        Users user = usersUpdateConverter
                .toModel(Request);
        Users cr = usersService.updateUsers(user);
        UsersUpdateResponse updateCoreRoleResponse = usersUpdateConverter
                .toContract(cr);
        baseResponse.setResponse(updateCoreRoleResponse);
        return new ResponseEntity<>(baseResponse, HttpStatus.OK);
    }
    
    @PostMapping(path = "/delete", consumes = "application/json", produces = "application/json")
    @Log(message = "post method delete CoreRole with " + "CoreRoleApi")
    public ResponseEntity<BaseResponse> deleteUser(
            @RequestBody DeleteByIdUserRequest request) {
    	usersService.deleteById(request.getId());
        return ResponseEntity.ok().body(baseResponse);
    }
    
    @PostMapping(path = "/login", consumes = "application/json", produces = "application/json")
    @Log(message = "post method Users login with \"\r\n"
            + "        + \"Users")
    public ResponseEntity<?> login(
            @RequestBody UserLoginRequest request) {
    	 logging.INFO("getting inside login");
         ValidationCheck.hasValidate(request);
        Users users = userLoginConverter.toModel(request);
        Users users2 = usersService.login(
                users.getEmployeeId(), users.getPassword());
        UserLoginResponse response = userLoginConverter
                .toContract(users2);
        baseResponse.setResponse(response);
        return new ResponseEntity<>(baseResponse, HttpStatus.OK);
    }    
    @PostMapping(value = "/request", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BaseResponse> request(
            @Valid @RequestBody UsersReq usersRequest) {
    	   baseResponse.setResponse(usersRequestConverter.toContract(
    			   requestService.insertUserRequest(usersRequestConverter.toModel(usersRequest))));       
        return ResponseEntity.ok().body(baseResponse);
    }
    
    @PostMapping(path = "/changePassword", consumes = "application/json", produces = "application/json")
    @Log(message = "post method Users login with \"\r\n"
            + "        + \"Users")
    public ResponseEntity<?> changePassword(
            @RequestBody ChangePasswordRequest request) {
    	 logging.INFO("getting inside login");
         ValidationCheck.hasValidate(request);
        Users users = changePasswordConverter.toModel(request);
        Users users2 = usersService.login(
                users.getEmployeeId(), users.getPassword());
        UserLoginResponse response = userLoginConverter
                .toContract(users2);
        baseResponse.setResponse(response);
        return new ResponseEntity<>(baseResponse, HttpStatus.OK);
    } 
    
    @PostMapping(path = "/getbystatus", consumes = "application/json", produces = "application/json")
    @Log(message = "post method getbystatus Users with \"\r\n"
            + "        + \"Users")
    public ResponseEntity<?> getByStatus(
            @RequestBody GetByStatusRequest request) {	
        Users users = getByStatusUserConverter.toModel(request);
        List<Users> users2 = usersService.getByStatus(
                users.getStatus());
        List<GetByStatusResponse> response = getByStatusUserConverter
                .toContracts(users2);
        baseResponse.setResponse(response);
        return new ResponseEntity<>(baseResponse, HttpStatus.OK);
    }

}
