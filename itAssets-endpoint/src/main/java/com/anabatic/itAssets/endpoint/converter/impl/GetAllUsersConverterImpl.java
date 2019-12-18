package com.anabatic.itAssets.endpoint.converter.impl;

import java.util.ArrayList;
import java.util.List;

import com.anabatic.itAssets.endpoint.Request.UsersRequest;
import com.anabatic.itAssets.endpoint.Response.GetAllUsersResponse;
import com.anabatic.itAssets.persistence.model.Skills;
import com.anabatic.itAssets.persistence.model.Users;

public class GetAllUsersConverterImpl implements com.anabatic.itAssets.endpoint.converter.GetAllUsersConverter {

	@Override
	public Users toModel(UsersRequest object) {
		return null;
	}

	@Override
	public List<Users> toModels(List<UsersRequest> objects) {
		
		return null;
	}

	@Override
	public GetAllUsersResponse toContract(Users object) {
		return null;
	}

	@Override
	public List<GetAllUsersResponse> toContracts(List<Users> objects) {
		List<GetAllUsersResponse> list = new ArrayList<>(objects.size());
		
		for(Users object : objects) {
			
			GetAllUsersResponse user = new GetAllUsersResponse();			
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
			user.setDateofbirth(object.getDateofbirth());
			user.setDateOfJoin(object.getDateOfJoin());
			user.setDateOfMarriage(object.getDateOfMarriage());
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
			list.add(user);
//			user.setAadhar(u.getAadhar());
//			user.setAtiplId(u.getAtiplId());
//			user.setBirthPlace(u.getBirthPlace());
//			user.setBloodGroup(u.getBloodGroup());
//			user.setCity(u.getCity());
//			user.setCorpId(u.getCorpId());
//			user.setCurrentAddress(u.getCurrentAddress());
//			user.setDateofbirth(u.getDateofbirth());
//			user.setDateOfJoin(u.getDateOfJoin());
//			user.setDateOfMarriage(u.getDateOfMarriage());
//			user.setDepartment(u.getDepartment());
//			user.setDlGroup(u.getDlGroup());
//			user.setDrivingLicense(u.getDrivingLicense());
//			user.setEmployeeId(u.getEmployeeId());
//			user.setFirstName(u.getFirstName());
//			user.setGender(u.getGender());
//			user.setGraduation(u.getGraduation());
//			user.setGraduationEndYear(u.getGraduationEndYear());
//			user.setGraduationStartYear(u.getGraduationStartYear());
//			user.setGraduationMajor(u.getGraduationMajor());
//			user.setGraduationgrade(u.getGraduationgrade());
//			user.setMatricgrade(u.getMatricgrade());
//			user.setMatricStartYear(u.getMatricStartYear());
//			user.setMatricEndYear(u.getMatricEndYear());
//			user.setMaritalStatus(u.getMaritalStatus());
//			user.setSecondarygrade(u.getSecondarygrade());
//			user.setSecondaryStartYear(u.getSecondaryStartYear());
//			user.setSecondaryEndYear(u.getSecondaryEndYear());
//			user.setJobTitle(u.getJobTitle());
//			user.setLastName(u.getLastName());
//			user.setMaritalStatus(u.getMaritalStatus());
//			user.setNationality(u.getNationality());
			
		}
		
		
		return list;
	}

}
