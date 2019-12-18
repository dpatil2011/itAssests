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
import com.anabatic.itAssets.endpoint.Request.AssetFormRequest;
import com.anabatic.itAssets.endpoint.Request.RequestId;
import com.anabatic.itAssets.endpoint.converter.AssetFormConverter;
import com.anabatic.itAssets.persistence.model.AssetsForm;
import com.anabatic.itAssets.services.service.AssetFormService;

/**
 * !place your description here!
 *
 * @author yeshwantk (&copy;25-Jul-2019)
 */
@CrossOrigin(origins="*",allowedHeaders="*")
@RestController
@RequestMapping("/assets-form")
public class AssetFormController {

    private BaseResponse baseResponse = new BaseResponse();

    @Autowired
    private AssetFormService assetsService;

    @Autowired
    private AssetFormConverter assetsConverter;

    @PostMapping("/insert")
    public ResponseEntity<BaseResponse> insert(
            @RequestBody AssetFormRequest request) {
        AssetsForm insert = assetsConverter.toModel(request);
        AssetsForm response = assetsService.insert(insert);
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setResponse(assetsConverter.toContract(response));
        return ResponseEntity.ok().body(baseResponse);
    }

    @PostMapping("/get-by-id")
    public ResponseEntity<BaseResponse> getById(
            @RequestBody RequestId request) {
        AssetsForm response = assetsService.getById(request.getId());
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setResponse(assetsConverter.toContract(response));
        return ResponseEntity.ok().body(baseResponse);
    }
    
    @GetMapping("/get-all")
    public ResponseEntity<BaseResponse> getAll(
            @RequestBody RequestId request) {
        List<AssetsForm> response = assetsService.getAll();
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setResponse(assetsConverter.toContracts(response));
        return ResponseEntity.ok().body(baseResponse);
    }
    
    @PostMapping("/delete")
    public ResponseEntity<BaseResponse> delete(
            @RequestBody RequestId request) {
        assetsService.delete(request.getId());
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setResponse("Operation performed Successfully");
        return ResponseEntity.ok().body(baseResponse);
    }
       

}
