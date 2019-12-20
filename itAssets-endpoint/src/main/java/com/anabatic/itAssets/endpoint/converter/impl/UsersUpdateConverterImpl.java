package com.anabatic.itAssets.endpoint.converter.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.anabatic.itAssets.endpoint.Request.UsersUpdateRequest;
import com.anabatic.itAssets.endpoint.Response.GetByIdUsersResponse;
import com.anabatic.itAssets.endpoint.Response.UsersUpdateResponse;
import com.anabatic.itAssets.endpoint.converter.UsersUpdateConverter;
import com.anabatic.itAssets.persistence.model.Skills;
import com.anabatic.itAssets.persistence.model.Users;

public class UsersUpdateConverterImpl implements UsersUpdateConverter {

	@Override
	public Users toModel(UsersUpdateRequest object) {
		 Date date1 = null;
		   Date date2 = null;
		   Date date3 = null;
		   Date date4 = null;
		   Date date5 = null;
		   Date date6 = null;
		   Date date7 = null;
		   Date date8 = null;
		try {
			if(object.getDateOfMarriage()!=null) {	
				date3 = new SimpleDateFormat("dd-MM-yyyy").parse(object.getDateOfJoin());
				date1 = new SimpleDateFormat("dd-MM-yyyy").parse(object.getDateofbirth());
				date2 = new SimpleDateFormat("dd-MM-yyyy").parse(object.getDateOfMarriage());
			} else {
				date3 = new SimpleDateFormat("dd-MM-yyyy").parse(object.getDateOfJoin());
				date1 = new SimpleDateFormat("dd-MM-yyyy").parse(object.getDateofbirth());
			}
			if(object.getFatherDateOfBirth()!=null) {
				date4 = new SimpleDateFormat("dd-MM-yyyy").parse(object.getFatherDateOfBirth());
			} 
			if(object.getMotherDateOfBirth()!=null) {
				date5 = new SimpleDateFormat("dd-MM-yyyy").parse(object.getMotherDateOfBirth());
			}
			if(object.getSibling1DateOfBirth()!=null) {
				date6 = new SimpleDateFormat("dd-MM-yyyy").parse(object.getSibling1DateOfBirth());
			}
			if(object.getSibling2DateOfBirth()!=null) {
				date7 = new SimpleDateFormat("dd-MM-yyyy").parse(object.getSibling1DateOfBirth());
			}
			if(object.getSibling3DateOfBirth()!=null) {
				date8 = new SimpleDateFormat("dd-MM-yyyy").parse(object.getSibling1DateOfBirth());
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
		user.setMotherName(object.getMotherName());
		user.setFatherName(object.getFatherName());
		user.setMotherDateOfBirth(date5);
		user.setFatherDateOfBirth(date4);
		user.setMotherAddar(object.getMotherAddar());
		user.setFatherAddar(object.getFatherAddar());
		user.setSibling1(object.getSibling1());
		user.setSibling2(object.getSibling2());
		user.setSibling3(object.getSibling3());
		user.setSibling1DateOfBirth(date6);
		user.setSibling2DateOfBirth(date7);
		user.setSibling3DateOfBirth(date8);
		user.setSpouceAdhar(object.getSpouceAdhar());
		user.setSpouceName(object.getSpouceName());
		
		user.setStatus(object.getStatus());
		List<Skills> skillList = new ArrayList<>(object.getSkills().size());
		for (Skills skill : object.getSkills()) {
			Skills skObj = new Skills();
			skObj.setCategory(skill.getCategory());
			skObj.setDescription(skill.getDescription());
			skObj.setExperience(skill.getExperience());
			skObj.setSkill(skill.getSkill());
			skObj.setUsers(user);
			skillList.add(skObj);
		}		
		user.setSkills(skillList);	
		return user;
		
	}

	@Override
	public List<Users> toModels(List<UsersUpdateRequest> objects) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UsersUpdateResponse toContract(Users object) {
		UsersUpdateResponse user = new UsersUpdateResponse();			
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
		user.setStatus(object.getStatus());
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
	public List<UsersUpdateResponse> toContracts(List<Users> objects) {
		// TODO Auto-generated method stub
		return null;
	}

}
