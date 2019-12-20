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
import com.anabatic.itAssets.endpoint.Request.AvailableAssetRequest;
import com.anabatic.itAssets.endpoint.Request.RequestId;
import com.anabatic.itAssets.endpoint.converter.AvailableAssetsConverter;
import com.anabatic.itAssets.persistence.model.AvailableAsset;
import com.anabatic.itAssets.services.service.AvailableAssetService;

@CrossOrigin(origins="*",allowedHeaders="*")
@RestController
@RequestMapping("/available-assets")
public class AvailableAssetController {

    private BaseResponse baseResponse = new BaseResponse();

    @Autowired
    private AvailableAssetService availableAssetService;

    @Autowired
    private AvailableAssetsConverter availableAssetsConverter;

    @PostMapping("/insert")
    public ResponseEntity<BaseResponse> insert(
            @RequestBody AvailableAssetRequest request) {
        AvailableAsset insert = availableAssetsConverter.toModel(request);
        AvailableAsset response = availableAssetService.insert(insert);
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setResponse(availableAssetsConverter.toContract(response));
        return ResponseEntity.ok().body(baseResponse);
    }

    @PostMapping("/get-by-id")
    public ResponseEntity<BaseResponse> getById(
            @RequestBody RequestId request) {
        AvailableAsset response = availableAssetService.getById(request.getId());
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setResponse(availableAssetsConverter.toContract(response));
        return ResponseEntity.ok().body(baseResponse);
    }
    
    @GetMapping("/get-all")
    public ResponseEntity<BaseResponse> getAll() {

        List<AvailableAsset> response = availableAssetService.getAll();
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setResponse(availableAssetsConverter.toContracts(response));
        return ResponseEntity.ok().body(baseResponse);
    }
    
    @PostMapping("/delete")
    public ResponseEntity<BaseResponse> delete(
            @RequestBody RequestId request) {
        availableAssetService.delete(request.getId());
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setResponse("Operation performed Successfully");
        return ResponseEntity.ok().body(baseResponse);
    }
}
