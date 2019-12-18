package com.anabatic.itAssets.endpoint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.anabatic.generic.endpoint.contract.BaseResponse;
import com.anabatic.itAssets.endpoint.Request.AssetsCategoryRequest;
import com.anabatic.itAssets.endpoint.Request.RequestId;
import com.anabatic.itAssets.endpoint.converter.AssetsCategoryConverter;
import com.anabatic.itAssets.persistence.model.AssetsCategory;
import com.anabatic.itAssets.services.service.AssetsCategoryService;

/**
 * !place your description here!
 *
 * @author yeshwantk (&copy;25-Jul-2019)
 */
@CrossOrigin(origins="*",allowedHeaders="*")
@RestController
@RequestMapping("/assets-category")
public class AssetsCategoryController {

    @Autowired
    private AssetsCategoryService assetsCategoryService;

    @Autowired
    private AssetsCategoryConverter assetsCategoryConverter;

    @PostMapping("/insert")
    public ResponseEntity<BaseResponse> insert(@RequestBody AssetsCategoryRequest request) {
        AssetsCategory insert = assetsCategoryConverter.toModel(request);
        AssetsCategory response = assetsCategoryService.insert(insert);
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setResponse(assetsCategoryConverter.toContract(response));
        return ResponseEntity.ok().body(baseResponse);
    }
    
    @RequestMapping(value="/get-by-id", method=RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<BaseResponse> getById(
            @RequestBody RequestId request) {
        AssetsCategory response = assetsCategoryService.getById(request.getId());
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setResponse(assetsCategoryConverter.toContract(response));
        return ResponseEntity.ok().body(baseResponse);
    }
    @RequestMapping(value="/getall", method=RequestMethod.GET)
    public List<AssetsCategory> getAll(
            @RequestBody RequestId request) {
        List<AssetsCategory> response = assetsCategoryService.getAll();
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setResponse(assetsCategoryConverter.toContracts(response));
        return response;
    }
    
    @RequestMapping(value="/welcome", method=RequestMethod.GET)
    public String welcome() {
        
        return "Welcome";
    }
    
    @PostMapping("/delete")
    public ResponseEntity<BaseResponse> delete(
            @RequestBody RequestId request) {
        assetsCategoryService.delete(request.getId());
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setResponse("Operation performed Successfully");
        return ResponseEntity.ok().body(baseResponse);
    }
}
