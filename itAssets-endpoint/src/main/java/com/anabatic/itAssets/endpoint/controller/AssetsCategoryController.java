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
import com.anabatic.generic.persistence.validator.field.ValidationCheck;
import com.anabatic.itAssets.endpoint.Request.AssetsCategoryRequest;
import com.anabatic.itAssets.endpoint.Request.BelongsToRequest;
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
    public ResponseEntity<BaseResponse> getById(
            @RequestBody RequestId request) {
        AssetsCategory response = assetsCategoryService.getById(request.getId());
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setResponse(assetsCategoryConverter.toContract(response));
        return ResponseEntity.ok().body(baseResponse);
    }
    @RequestMapping(value="/get-all", method=RequestMethod.GET)
    public ResponseEntity<BaseResponse> getAll() {
        List<AssetsCategory> response = assetsCategoryService.getAll();
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setResponse(assetsCategoryConverter.toContracts(response));
        return ResponseEntity.ok().body(baseResponse);
    }
    
    
    @PostMapping("/delete")
    public ResponseEntity<BaseResponse> delete(
            @RequestBody RequestId request) {
        assetsCategoryService.delete(request.getId());
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setResponse("Operation performed Successfully");
        return ResponseEntity.ok().body(baseResponse);
    }
    
    @RequestMapping(value="/belongs-to", method=RequestMethod.POST)
    public ResponseEntity<BaseResponse> belongsTo(
            @RequestBody BelongsToRequest request) {
        ValidationCheck.hasValidate(request);
        List<AssetsCategory> response = assetsCategoryService.belongsTo(request.getBelongsTo());
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setResponse(assetsCategoryConverter.toContracts(response));
        return ResponseEntity.ok().body(baseResponse);
    }
}
