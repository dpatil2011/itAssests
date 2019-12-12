package com.anabatic.itAssets.endpoint.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anabatic.generic.endpoint.contract.BaseResponse;
import com.anabatic.itAssets.endpoint.Request.AssetsRequest;
import com.anabatic.itAssets.endpoint.Request.UsersRequest;
import com.anabatic.itAssets.endpoint.converter.UsersConverter;
import com.anabatic.itAssets.services.service.UsersService;

@RestController
@RequestMapping("/users")
public class UsersController {

    private BaseResponse baseResponse = new BaseResponse();
    
    @Autowired
    private UsersService usersService;
    
    @Autowired
    private UsersConverter usersConverter;
    
    @PostMapping(value = "/insert", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BaseResponse> insert(
            @Valid @RequestBody UsersRequest usersRequest) {

       
        return ResponseEntity.ok().body(baseResponse);

    }

}
