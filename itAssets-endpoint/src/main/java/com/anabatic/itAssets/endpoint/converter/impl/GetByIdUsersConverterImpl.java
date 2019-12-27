package com.anabatic.itAssets.endpoint.converter.impl;

import java.util.ArrayList;
import java.util.List;

import com.anabatic.itAssets.endpoint.Request.GetByIdUsersRequest;
import com.anabatic.itAssets.endpoint.Request.SkillBean;
import com.anabatic.itAssets.endpoint.Response.GetAllUsersResponse;
import com.anabatic.itAssets.endpoint.Response.GetByIdUsersResponse;
import com.anabatic.itAssets.endpoint.converter.GetByIdUsersConverter;
import com.anabatic.itAssets.persistence.model.Skills;
import com.anabatic.itAssets.persistence.model.Users;

public class GetByIdUsersConverterImpl implements GetByIdUsersConverter {

	@Override
	public Users toModel(GetByIdUsersRequest object) {
     Users user = new Users();
     user.setId(object.getId());
		return user;
	}

	@Override
	public List<Users> toModels(List<GetByIdUsersRequest> objects) {

		
		return null;
	}

	@Override
	public GetByIdUsersResponse toContract(Users object) {
		GetByIdUsersResponse user = new GetByIdUsersResponse();			
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
		user.setReligion(object.getReligion());
		user.setReportingManager(object.getReportingManager());
		user.setSecondarygrade(object.getSecondarygrade());
		user.setSecondaryStartYear(object.getSecondaryStartYear());
		user.setSecondaryEndYear(object.getSecondaryEndYear());	
		user.setStatus(0);
		List<SkillBean> skillList = new ArrayList<>();
		for (Skills skill : object.getSkills()) {
			SkillBean skObj = new SkillBean();
			skObj.setCategory(skill.getCategory());
			skObj.setId(skill.getId());
			skObj.setUserId(skill.getUsers().getId());
			skillList.add(skObj);
		}		
		user.setSkills(skillList);	
		
		return user;
	}

	@Override
	public List<GetByIdUsersResponse> toContracts(List<Users> objects) {
		// TODO Auto-generated method stub
		return null;
	}

}
