package com.anabatic.itAssets.endpoint.converter.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.anabatic.itAssets.endpoint.Request.UsersRequest;
import com.anabatic.itAssets.endpoint.Response.UsersResponse;
import com.anabatic.itAssets.endpoint.converter.UsersConverter;
import com.anabatic.itAssets.persistence.model.Skills;
import com.anabatic.itAssets.persistence.model.Users;

public class UsersConverterImpl implements UsersConverter{
    
	@Override
	public Users toModel(UsersRequest object) {
		   Date date1 = null;
		   Date date2 = null;
		   Date date3 = null;
		try {
			if(object.getDateOfMarriage()!=null) {	
				date3 = new SimpleDateFormat("dd-MM-yyyy").parse(object.getDateOfJoin());
				date1 = new SimpleDateFormat("dd-MM-yyyy").parse(object.getDateofbirth());
				date2 = new SimpleDateFormat("dd-MM-yyyy").parse(object.getDateOfMarriage());
			} else {
				date3 = new SimpleDateFormat("dd-MM-yyyy").parse(object.getDateOfJoin());
				date1 = new SimpleDateFormat("dd-MM-yyyy").parse(object.getDateofbirth());
			}
		
		} catch (ParseException e) {
			e.printStackTrace();
		}  
		Users user = new Users();
		user.setId(object.getId());
		user.setAadhar(object.getAadhar());
		user.setBloodGroup(object.getBloodGroup());
		user.setCity(object.getCity());
		user.setDepartment(object.getDepartment());
		user.setFirstName(object.getFirstName());
		user.setLastName(object.getLastName());
		user.setAadhar(object.getAadhar());
		user.setCity(object.getCity());
		user.setCurrentAddress(object.getCurrentAddress());
		user.setAtiplId(object.getAtiplId());
		user.setBirthPlace(object.getBirthPlace());
		user.setCorpId(object.getCorpId());
		user.setCurrentAddress(object.getCurrentAddress());		
		user.setDateofbirth(date1);
		user.setDateOfJoin(date2);
		user.setDateOfMarriage(date3);
		user.setDlGroup(object.getDlGroup());
		user.setDrivingLicense(object.getDrivingLicense());
		user.setEmployeeId(object.getEmployeeId());
		user.setGender(object.getGender());
		user.setGraduation(object.getGraduation());
		user.setGraduationStartYear(object.getGraduationStartYear());
		user.setGraduationEndYear(object.getGraduationEndYear());
		user.setGraduationMajor(object.getGraduationMajor());
		user.setPostGraduation(object.getPostGraduation());
		user.setPostGraduationMajor(object.getPostGraduationMajor());
		user.setPostGraduationStartYear(object.getPostGraduationStartYear());
		user.setPostGraduationEndYear(object.getPostGraduationEndYear());
		user.setMatricgrade(object.getMatricgrade());
		user.setMatricStartYear(object.getMatricStartYear());
		user.setMatricEndYear(object.getMatricEndYear());
		user.setHrPassword(object.getHrPassword());
		user.setPassword(object.getPassword());
		user.setJobTitle(object.getJobTitle());
		user.setMaritalStatus(object.getMaritalStatus());
		user.setNationality(object.getNationality());
		user.setPassportNumber(object.getPassportNumber());
		user.setPermanetAddress(object.getPermanetAddress());
		user.setPersonalEmail(object.getPersonalEmail());
		user.setOfficalEmail(object.getOfficalEmail());
		user.setPan(object.getPan());
		user.setPhoneNumber(object.getPhoneNumber());
		user.setPincode(object.getPincode());
		user.setPhoto(object.getPhoto());
		user.setPrivilege(object.getPrivilege());
		user.setReligion(object.getReligion());
		user.setReportingManager(object.getReportingManager());
		user.setSecondarygrade(object.getSecondarygrade());
		user.setSecondaryStartYear(object.getSecondaryStartYear());
		user.setSecondaryEndYear(object.getSecondaryEndYear());	
		user.setStatus(0);
		List<Skills> skillList = new ArrayList<>();
		for (Skills skill : object.getSkills()) {
			Skills skObj = new Skills();
			skObj.setCategory(skill.getCategory());
			skillList.add(skObj);
		}		
		user.setSkills(skillList);	
		return user;
	}
	@Override
	public List<Users> toModels(List<UsersRequest> objects) {
		return null;
	}
	@Override
	public UsersResponse toContract(Users object) {
		UsersResponse response = new UsersResponse();
		response.setId(object.getId());
		response.setFirstName(object.getFirstName());
		response.setLastName(object.getLastName());
		return response;
	}
	@Override
	public List<UsersResponse> toContracts(List<Users> objects) {
		return null;
	}

}
