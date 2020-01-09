package com.anabatic.itAssets.endpoint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.anabatic.generic.endpoint.contract.BaseResponse;
import com.anabatic.itAssets.endpoint.Request.RequestId;
import com.anabatic.itAssets.endpoint.Request.UserInitiationRequest;
import com.anabatic.itAssets.endpoint.converter.UserInitiationConverter;
import com.anabatic.itAssets.persistence.model.UserInitiation;
import com.anabatic.itAssets.services.service.UserInitiationService;

/**
 * !place your description here!
 *
 * @author yeshwantk (&copy;09-Jan-2020) 
 */

@CrossOrigin(origins="*",allowedHeaders="*")
@RestController
@RequestMapping("/user-initiation")
public class UserInitiationController {
    @Autowired
    private UserInitiationService userInitiationService;

    @Autowired
    private UserInitiationConverter userInitiationConverter;

    @PostMapping("/insert")
    public ResponseEntity<BaseResponse> insert(@RequestBody UserInitiationRequest request) {
        UserInitiation insert = userInitiationConverter.toModel(request);
        UserInitiation response = userInitiationService.insert(insert);
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setResponse(userInitiationConverter.toContract(response));
        return ResponseEntity.ok().body(baseResponse);
    }
    
    @RequestMapping(value="/get-by-id", method=RequestMethod.POST)
    public ResponseEntity<BaseResponse> getById(
            @RequestBody RequestId request) {
        UserInitiation response = userInitiationService.getById(request.getId());
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setResponse(userInitiationConverter.toContract(response));
        return ResponseEntity.ok().body(baseResponse);
    }
    @RequestMapping(value="/get-all", method=RequestMethod.GET)
    public ResponseEntity<BaseResponse> getAll() {
        List<UserInitiation> response = userInitiationService.getAll();
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setResponse(userInitiationConverter.toContracts(response));
        return ResponseEntity.ok().body(baseResponse);
    }
    
    
    @PostMapping("/delete")
    public ResponseEntity<BaseResponse> delete(
            @RequestBody RequestId request) {
        userInitiationService.delete(request.getId());
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setResponse("Operation performed Successfully");
        return ResponseEntity.ok().body(baseResponse);
    }
    
}
