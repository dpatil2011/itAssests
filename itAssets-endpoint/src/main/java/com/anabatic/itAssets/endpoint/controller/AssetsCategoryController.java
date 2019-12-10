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
import com.anabatic.itAssets.endpoint.Request.RequestId;
import com.anabatic.itAssets.endpoint.Request.AssetsCategoryRequest;
import com.anabatic.itAssets.endpoint.converter.AssetsCategoryConverter;
import com.anabatic.itAssets.services.service.AssetsCategoryService;

/**
 * !place your description here!
 *
 * @author yeshwantk (&copy;25-Jul-2019)
 */
@RestController
@RequestMapping("/assetsCategory")
public class AssetsCategoryController {

    private BaseResponse baseResponse = new BaseResponse();

    @Autowired
    private AssetsCategoryService assetsCategoryService;

    @Autowired
    private AssetsCategoryConverter assetsCategoryConverter;

    @PostMapping(value = "/insert", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BaseResponse> insert(
            @Valid @RequestBody AssetsCategoryRequest assetsCategoryRequest) {

        baseResponse.setResponse(assetsCategoryConverter
                .toContract(assetsCategoryService.insert(assetsCategoryConverter
                        .toModel(assetsCategoryRequest))));

        return ResponseEntity.ok().body(baseResponse);

    }

    @PostMapping(value = "/get", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BaseResponse> get(
            @Valid @RequestBody RequestId request) {

        baseResponse.setResponse(assetsCategoryConverter
                .toContract(assetsCategoryService.getById(request.getId())));

        return ResponseEntity.ok().body(baseResponse);

    }
    
    @PostMapping(value = "/getall", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BaseResponse> getall() {

        baseResponse.setResponse(assetsCategoryConverter
                .toContracts(assetsCategoryService.getAllData()));

        return ResponseEntity.ok().body(baseResponse);

    }
    
    @PostMapping(value = "/delete", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BaseResponse> delete(
            @Valid @RequestBody RequestId request) {

        assetsCategoryService.delete(request.getId());
        baseResponse.setResponse("Operation Performed successfully");

        return ResponseEntity.ok().body(baseResponse);

    }
}
