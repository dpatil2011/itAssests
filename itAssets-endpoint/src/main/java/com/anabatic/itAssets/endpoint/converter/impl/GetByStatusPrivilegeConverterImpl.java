package com.anabatic.itAssets.endpoint.converter.impl;

import java.util.ArrayList;
import java.util.List;

import com.anabatic.itAssets.endpoint.Request.GetByStatusPrivilegeRequest;
import com.anabatic.itAssets.endpoint.Request.SkillBean;
import com.anabatic.itAssets.endpoint.Response.GetAllCandidateRecordResponse;
import com.anabatic.itAssets.endpoint.Response.GetByStatusPrivilegeResponse;
import com.anabatic.itAssets.endpoint.converter.GetByStatusPrivilegeConverter;
import com.anabatic.itAssets.persistence.model.Privilege;
import com.anabatic.itAssets.persistence.model.Skills;

public class GetByStatusPrivilegeConverterImpl implements GetByStatusPrivilegeConverter{

	@Override
	public Privilege toModel(GetByStatusPrivilegeRequest object) {
		// TODO Auto-generated method stub
		Privilege p=new Privilege();
		p.setStatus(object.getStatus());
		return p;
	}

	@Override
	public List<Privilege> toModels(List<GetByStatusPrivilegeRequest> objects) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetByStatusPrivilegeResponse toContract(Privilege object) {
		// TODO Auto-generated method stub
		GetByStatusPrivilegeResponse user=new GetByStatusPrivilegeResponse();
		user.setFromDate(object.getFromDate());
		user.setToDate(object.getToDate());
		user.setId(object.getId());
		user.setStatus(object.getStatus());
		user.setPrivilegeTypeId(object.getPrivilegeType().getId());
		user.setPrivilegeType(object.getPrivilegeType().getPrivilegeType());
		user.setPrivilegeTypeStatus(object.getPrivilegeType().getStatus());
		user.setIcon(object.getPrivilegeType().getIcon());
		user.setColor(object.getPrivilegeType().getColor());
		user.setPriviCount(object.getPrivilegeType().getPriviCount());
		user.setUserId(object.getUsers().getId());
		user.setAadhar(object.getUsers().getAadhar());
		user.setBloodGroup(object.getUsers().getBloodGroup());
		user.setCity(object.getUsers().getCity());
		user.setDepartment(object.getUsers().getDepartment());
		user.setFirstName(object.getUsers().getFirstName());
		user.setLastName(object.getUsers().getLastName());
		user.setAadhar(object.getUsers().getAadhar());
		user.setCity(object.getUsers().getCity());
		user.setCurrentAddress(object.getUsers().getCurrentAddress());
		user.setAtiplId(object.getUsers().getAtiplId());
		user.setBirthPlace(object.getUsers().getBirthPlace());
		user.setCorpId(object.getUsers().getCorpId());
		user.setCurrentAddress(object.getUsers().getCurrentAddress());		
		user.setDateofbirth(object.getUsers().getDateofbirth());
		user.setDateOfJoin(object.getUsers().getDateOfJoin());
		user.setDateOfMarriage(object.getUsers().getDateOfMarriage());
		user.setDlGroup(object.getUsers().getDlGroup());
		user.setDrivingLicense(object.getUsers().getDrivingLicense());
		user.setEmployeeId(object.getUsers().getEmployeeId());
		user.setGender(object.getUsers().getGender());
		user.setGraduation(object.getUsers().getGraduation());
		user.setGraduationStartYear(object.getUsers().getGraduationStartYear());
		user.setGraduationEndYear(object.getUsers().getGraduationEndYear());
		user.setGraduationMajor(object.getUsers().getGraduationMajor());
		user.setPostGraduation(object.getUsers().getPostGraduation());
		user.setPostGraduationMajor(object.getUsers().getPostGraduationMajor());
		user.setPostGraduationStartYear(object.getUsers().getPostGraduationStartYear());
		user.setPostGraduationEndYear(object.getUsers().getPostGraduationEndYear());
		user.setMatricgrade(object.getUsers().getMatricgrade());
		user.setMatricStartYear(object.getUsers().getMatricStartYear());
		user.setMatricEndYear(object.getUsers().getMatricEndYear());
		user.setHrPassword(object.getUsers().getHrPassword());
		user.setPassword(object.getUsers().getPassword());
		user.setJobTitle(object.getUsers().getJobTitle());
		user.setMaritalStatus(object.getUsers().getMaritalStatus());
		user.setNationality(object.getUsers().getNationality());
		user.setPassportNumber(object.getUsers().getPassportNumber());
		user.setPermanetAddress(object.getUsers().getPermanetAddress());
		user.setPersonalEmail(object.getUsers().getPersonalEmail());
		user.setOfficalEmail(object.getUsers().getOfficalEmail());
		user.setPan(object.getUsers().getPan());
		user.setPhoneNumber(object.getUsers().getPhoneNumber());
		user.setPincode(object.getUsers().getPincode());
		user.setPhoto(object.getUsers().getPhoto());
		user.setReligion(object.getUsers().getReligion());
		user.setReportingManager(object.getUsers().getReportingManager());
		user.setSecondarygrade(object.getUsers().getSecondarygrade());
		user.setSecondaryStartYear(object.getUsers().getSecondaryStartYear());
		user.setSecondaryEndYear(object.getUsers().getSecondaryEndYear());	
		user.setStatus(0);
		List<SkillBean> skillList = new ArrayList<>();
		for (Skills skill : object.getUsers().getSkills()) {
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
	public List<GetByStatusPrivilegeResponse> toContracts(List<Privilege> objects) {
		List<GetByStatusPrivilegeResponse> list = new ArrayList<>();
		objects.forEach(x -> list.add(toContract(x)));
		return list;
	}

}
