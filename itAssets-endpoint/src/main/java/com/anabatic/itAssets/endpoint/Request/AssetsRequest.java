package com.anabatic.itAssets.endpoint.Request;

import java.util.Date;

import com.anabatic.itAssets.persistence.model.AssetsCategory;

/**
 * !place your description here!
 *
 * @author yeshwantk (&copy;25-Jul-2019) 
 */
public class AssetsRequest {

    private Long id;
    private String assetsId;
    private String make;
    private String model;
    private String serialNumber;
    private String assignedTo;
    private Date invoiceDate;
    private Date processDate;
    private String age;
    private String processor;
    private String ram;
    private String hdd;
    private String cdDrive;
    private String operatingSys;
    private String location;
    private String comments;
    private AssetsCategory assetsCategory;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAssetsId() {
        return assetsId;
    }

    public void setAssetsId(String assetsId) {
        this.assetsId = assetsId;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public Date getProcessDate() {
        return processDate;
    }

    public void setProcessDate(Date processDate) {
        this.processDate = processDate;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public String getCdDrive() {
        return cdDrive;
    }

    public void setCdDrive(String cdDrive) {
        this.cdDrive = cdDrive;
    }

    public String getOperatingSys() {
        return operatingSys;
    }

    public void setOperatingSys(String operatingSys) {
        this.operatingSys = operatingSys;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public AssetsCategory getAssetsCategory() {
        return assetsCategory;
    }

    public void setAssetsCategory(AssetsCategory assetsCategory) {
        this.assetsCategory = assetsCategory;
    }
}
