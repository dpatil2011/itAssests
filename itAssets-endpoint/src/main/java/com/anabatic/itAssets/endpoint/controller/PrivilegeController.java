package com.anabatic.itAssets.endpoint.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.anabatic.generic.endpoint.contract.BaseResponse;
import com.anabatic.itAssets.endpoint.Request.GetByStatusPrivilegeRequest;
import com.anabatic.itAssets.endpoint.Request.PrivilegeInsertRequest;
import com.anabatic.itAssets.endpoint.Request.RemovePrivilegeRequest;
import com.anabatic.itAssets.endpoint.Response.PrivilegeInsertResponse;
import com.anabatic.itAssets.endpoint.converter.GetByStatusPrivilegeConverter;
import com.anabatic.itAssets.endpoint.converter.PrivilegeInsertConverter;
import com.anabatic.itAssets.endpoint.converter.RemovePrivilegeConverter;
import com.anabatic.itAssets.persistence.model.Privilege;
import com.anabatic.itAssets.persistence.model.PrivilegeType;
import com.anabatic.itAssets.services.service.PrivilegeService;
import com.anabatic.itAssets.services.service.PrivilegeTypeService;

@CrossOrigin(origins="*",allowedHeaders="*")
@RestController
@RequestMapping("/privilege")
public class PrivilegeController {
	
	@Autowired
	private GetByStatusPrivilegeConverter getByStatusPrivilegeConverter;
	
	@Autowired
	private PrivilegeService privilegeService;

	@Autowired
	private PrivilegeTypeService PrivilegeTypeService;
	
	@Autowired
	private PrivilegeInsertConverter privilegeInsertConverter;
	

    @Autowired
    private RemovePrivilegeConverter removePrivilegeConverter;
	
	@RequestMapping(value = "/getbystatus", method = RequestMethod.GET)

	public ResponseEntity<BaseResponse> getByStatus(@RequestBody GetByStatusPrivilegeRequest request) {
		Privilege p = getByStatusPrivilegeConverter.toModel(request);
		List<Privilege> response = privilegeService.getByStatus(p,request.getPriviId());
		BaseResponse baseResponse = new BaseResponse();
		baseResponse.setResponse(getByStatusPrivilegeConverter.toContracts(response));
		return ResponseEntity.ok().body(baseResponse);
	}
	
	  @PostMapping(value = "/insert", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<BaseResponse> insert(
	            @Valid @RequestBody PrivilegeInsertRequest usersRequest) {
	  
		    Privilege model = privilegeInsertConverter.toModel(usersRequest);
		    Privilege p = privilegeService.insert(model);
		    PrivilegeInsertResponse contract = privilegeInsertConverter.toContract(p);
		    if (contract!=null) {
		    	PrivilegeType updatePriviCount = PrivilegeTypeService.updatePriviCount(contract.getPrivilegeTypeId());
		    }
			BaseResponse baseResponse = new BaseResponse();
			baseResponse.setResponse(contract);
	        return ResponseEntity.ok().body(baseResponse);

	    }
	  
	  @PostMapping(value = "/remove-privilege", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<BaseResponse> removePrivilege(
	            @Valid @RequestBody RemovePrivilegeRequest usersRequest) {
	  
		    Privilege model = removePrivilegeConverter.toModel(usersRequest);
		    Privilege p = privilegeService.removePrivilege(model);
		  
		    if (p!=null) {
		    	PrivilegeType updatePriviCount = PrivilegeTypeService.updatePriviCountTo(p.getPrivilegeType().getId());
		    }
			BaseResponse baseResponse = new BaseResponse();
			
	        return ResponseEntity.ok().body(baseResponse);

	    }

}
