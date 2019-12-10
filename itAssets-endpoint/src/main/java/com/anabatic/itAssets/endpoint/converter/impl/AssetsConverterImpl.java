package com.anabatic.itAssets.endpoint.converter.impl;

import java.util.List;

import com.anabatic.itAssets.endpoint.Request.AssetsRequest;
import com.anabatic.itAssets.endpoint.Response.AssetsResponse;
import com.anabatic.itAssets.endpoint.converter.AssetsConverter;
import com.anabatic.itAssets.persistence.model.Assets;

/**
 * !place your description here!
 *
 * @author yeshwantk (&copy;25-Jul-2019)
 */
public class AssetsConverterImpl implements AssetsConverter {

    @Override
    public Assets toModel(AssetsRequest object) {
        Assets request = new Assets();
        request.setId(object.getId());
        request.setAssetsId(object.getAssetsId());
        request.setMake(object.getMake());
        request.setModel(object.getModel());
        request.setSerialNumber(object.getSerialNumber());
        request.setAssignedTo(object.getAssignedTo());
        request.setInvoiceDate(object.getInvoiceDate());
        request.setProcessDate(object.getProcessDate());
        request.setAge(object.getAge());
        request.setProcessor(object.getProcessor());
        request.setRam(object.getRam());
        request.setHdd(object.getHdd());
        request.setCdDrive(object.getCdDrive());
        request.setOperatingSys(object.getOperatingSys());
        request.setLocation(object.getLocation());
        request.setComments(object.getComments());
        request.setAssetsCategory(object.getAssetsCategory());
        return request;
    }

    @Override
    public List<Assets> toModels(List<AssetsRequest> objects) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public AssetsResponse toContract(Assets object) {
        AssetsResponse response = new AssetsResponse();
        response.setId(object.getId());
        response.setAssetsId(object.getAssetsId());
        response.setMake(object.getMake());
        response.setModel(object.getModel());
        response.setSerialNumber(object.getSerialNumber());
        response.setAssignedTo(object.getAssignedTo());
        response.setInvoiceDate(object.getInvoiceDate());
        response.setProcessDate(object.getProcessDate());
        response.setAge(object.getAge());
        response.setProcessor(object.getProcessor());
        response.setRam(object.getRam());
        response.setHdd(object.getHdd());
        response.setCdDrive(object.getCdDrive());
        response.setOperatingSys(object.getOperatingSys());
        response.setLocation(object.getLocation());
        response.setComments(object.getComments());
        response.setAssetsCategory(object.getAssetsCategory());
        return response;
    }

    @Override
    public List<AssetsResponse> toContracts(List<Assets> objects) {
        // TODO Auto-generated method stub
        return null;
    }

}
