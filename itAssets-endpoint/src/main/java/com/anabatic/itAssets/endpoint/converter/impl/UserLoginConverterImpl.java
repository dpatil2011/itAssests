package com.anabatic.itAssets.endpoint.converter.impl;

import java.util.ArrayList;
import java.util.List;

import com.anabatic.itAssets.endpoint.Request.SkillBean;
import com.anabatic.itAssets.endpoint.Request.UserLoginRequest;
import com.anabatic.itAssets.endpoint.Response.GetByIdUsersResponse;
import com.anabatic.itAssets.endpoint.Response.UserLoginResponse;
import com.anabatic.itAssets.endpoint.converter.UserLoginConverter;
import com.anabatic.itAssets.persistence.model.Skills;
import com.anabatic.itAssets.persistence.model.Users;

public class UserLoginConverterImpl implements UserLoginConverter {

	@Override
	public Users toModel(UserLoginRequest object) {
      Users user = new Users();
      user.setEmployeeId(object.getEmployeeId());
      user.setPassword(object.getPassword());
		return user;
	}

	@Override
	public List<Users> toModels(List<UserLoginRequest> objects) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserLoginResponse toContract(Users object) {
		UserLoginResponse user = new UserLoginResponse();			
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
		user.setMotherName(object.getMotherName());
		user.setFatherName(object.getFatherName());
		user.setMotherDateOfBirth(object.getMotherDateOfBirth());
		user.setFatherDateOfBirth(object.getFatherDateOfBirth());
		user.setMotherAddar(object.getMotherAddar());
		user.setFatherAddar(object.getFatherAddar());
		user.setSibling1(object.getSibling1());
		user.setSibling2(object.getSibling2());
		user.setSibling3(object.getSibling3());
		user.setSibling1DateOfBirth(object.getSibling1DateOfBirth());
		user.setSibling2DateOfBirth(object.getSibling2DateOfBirth());
		user.setSibling3DateOfBirth(object.getSibling3DateOfBirth());
		user.setSpouceAdhar(object.getSpouceAdhar());
		user.setSpouceName(object.getSpouceName());
		user.setStatus(0);
		List<SkillBean> skillList = new ArrayList<>();
		for (Skills skill : object.getSkills()) {
			SkillBean skObj = new SkillBean();
			skObj.setCategory(skill.getCategory());
			skObj.setId(skill.getId());
			skObj.setUserId(skill.getUsers().getId());
			skObj.setExperience(skill.getExperience());
			skObj.setSkill(skill.getSkill());
			skillList.add(skObj);
		}		
		user.setSkills(skillList);	
		
		return user;
	
	}

	@Override
	public List<UserLoginResponse> toContracts(List<Users> objects) {
		// TODO Auto-generated method stub
		return null;
	}

}
