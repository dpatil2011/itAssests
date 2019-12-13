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
import com.anabatic.itAssets.endpoint.Request.AssetFormRequest;
import com.anabatic.itAssets.endpoint.Request.RequestId;
import com.anabatic.itAssets.endpoint.converter.AssetFormConverter;
import com.anabatic.itAssets.services.service.AssetFormService;

/**
 * !place your description here!
 *
 * @author yeshwantk (&copy;25-Jul-2019)
 */
@RestController
@RequestMapping("/assets")
public class AssetsController {

    private BaseResponse baseResponse = new BaseResponse();

    @Autowired
    private AssetFormService assetsService;

    @Autowired
    private AssetFormConverter assetsConverter;

    @PostMapping(value = "/insert", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BaseResponse> insert(
            @Valid @RequestBody AssetFormRequest assetsRequest) {

        baseResponse.setResponse(assetsConverter.toContract(
                assetsService.insert(assetsConverter.toModel(assetsRequest))));

        return ResponseEntity.ok().body(baseResponse);

    }

    @PostMapping(value = "/get", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BaseResponse> get(
            @Valid @RequestBody RequestId request) {

        baseResponse.setResponse(assetsConverter
                .toContract(assetsService.getById(request.getId())));

        return ResponseEntity.ok().body(baseResponse);

    }

    @PostMapping(value = "/getall", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BaseResponse> getall() {

        baseResponse.setResponse(
                assetsConverter.toContracts(assetsService.getAllData()));

        return ResponseEntity.ok().body(baseResponse);

    }

    @PostMapping(value = "/delete", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BaseResponse> delete(
            @Valid @RequestBody RequestId request) {

        assetsService.delete(request.getId());
        baseResponse.setResponse("Operation Performed successfully");

        return ResponseEntity.ok().body(baseResponse);

    }

}
