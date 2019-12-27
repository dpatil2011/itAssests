package com.anabatic.itAssets.endpoint.converter.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.User;

import com.anabatic.itAssets.endpoint.Request.GetByStatusRequest;
import com.anabatic.itAssets.endpoint.Request.GetByStatusUsersRequest;
import com.anabatic.itAssets.endpoint.Request.SkillBean;
import com.anabatic.itAssets.endpoint.Response.GetAllUsersResponse;
import com.anabatic.itAssets.endpoint.Response.GetByStatusResponse;
import com.anabatic.itAssets.endpoint.Response.GetByStatusUsersResponse;
import com.anabatic.itAssets.endpoint.converter.GetByStatusUserConverter;
import com.anabatic.itAssets.endpoint.converter.GetByStatusUsersConverter;
import com.anabatic.itAssets.persistence.model.Skills;
import com.anabatic.itAssets.persistence.model.Users;

public class GetByStatusUsersConverterImpl implements GetByStatusUserConverter {

	@Override
	public Users toModel(GetByStatusRequest object) {
		Users user = new Users();
		user.setStatus(object.getStatus());
		return user;
	}

	@Override
	public List<Users> toModels(List<GetByStatusRequest> objects) {
		return null;
	}

	@Override
	public GetByStatusResponse toContract(Users object) {
		return null;
	}

	@Override
	public List<GetByStatusResponse> toContracts(List<Users> objects) {
List<GetByStatusResponse> list = new ArrayList<>(objects.size());
		
		for(Users object : objects) {
			
			GetByStatusResponse user = new GetByStatusResponse();			
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
				skObj.setId(skill.getId());
				skObj.setSkill(skill.getSkill());
				skObj.setUserId(skill.getUsers().getId());
			    skObj.setExperience(skill.getExperience());
				skObj.setCategory(skill.getCategory());
				skillList.add(skObj);
			}		
			user.setSkills(skillList);	
			list.add(user);

			
		}
		
		
		return list;
		
	}


}
