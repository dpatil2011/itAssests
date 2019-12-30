package com.anabatic.itAssets.endpoint.controller;

import java.util.Date;
import java.util.List;
import java.time.format.DateTimeFormatter;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.anabatic.generic.endpoint.contract.BaseResponse;
import com.anabatic.itAssets.endpoint.Request.GetByIdCandidateRequest;
import com.anabatic.itAssets.endpoint.Request.InsertCandidateRequest;
import com.anabatic.itAssets.endpoint.Request.UpdateCandidateRequest;
import com.anabatic.itAssets.endpoint.Response.InsertCandidateResponse;
import com.anabatic.itAssets.endpoint.converter.GetAllCandidateConverter;
import com.anabatic.itAssets.endpoint.converter.GetByIdCandidateConverter;
import com.anabatic.itAssets.endpoint.converter.InsertCandidateConverter;
import com.anabatic.itAssets.endpoint.converter.InsertCandidateRecordConverter;
import com.anabatic.itAssets.endpoint.converter.UpdateCandidateConverter;
import com.anabatic.itAssets.persistence.model.Candidate;
import com.anabatic.itAssets.persistence.model.CandidateRecord;
import com.anabatic.itAssets.persistence.model.Users;
import com.anabatic.itAssets.services.service.CandidateRecordService;
import com.anabatic.itAssets.services.service.CandidateService;
import com.anabatic.itAssets.services.service.impl.FileStorageService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/candidate")
public class CandidateController {
	@Autowired
	private CandidateService candidateService;

	@Autowired
	private InsertCandidateConverter insertCandidateConverter;

	@Autowired
	private GetByIdCandidateConverter getByIdCandidateConverter;

	@Autowired
	private GetAllCandidateConverter getAllCandidateConverter;

	@Autowired
	private UpdateCandidateConverter updateCandidateConverter;

	@Autowired
	private FileStorageService fileStorageService;

	// @Autowired
	// private InsertCandidateRecordConverter insertCandidateRecordConverter;
	//
	@Autowired
	private CandidateRecordService candidateRecordService;

	@PostMapping("/insert")
	public ResponseEntity<BaseResponse> insert(@RequestParam("file") MultipartFile file,
			@RequestParam(value = "name", required = true) final String name,
			@RequestParam(value = "email", required = true) final String email,
			@RequestParam(value = "phoneNo", required = true) final Integer phoneNo,
			@RequestParam(value = "skills", required = true) final String skills,
			@RequestParam(value = "experience", required = true) final Float experience,
			@RequestParam(value = "status", required = true) final Integer status,
			@RequestParam(value = "comment", required = true) final String comment,
			@RequestParam(value = "hmId", required = true) final Long hmId,
			@RequestParam(value = "rId", required = true) final Long recruiterId) {
		String fileName = fileStorageService.storeFile(file);
		String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath().path("/upload/").path(fileName)
				.toUriString();
		InsertCandidateRequest request = new InsertCandidateRequest();
		request.setName(name);
		request.setComment(comment);
		request.setEmail(email);
		request.setExperience(experience);
		request.setHmId(hmId);
		request.setrId(recruiterId);
		request.setPhoneNo(phoneNo);
		request.setSkills(skills);
		request.setStatus(status);
		Candidate can = insertCandidateConverter.toModel(request);
		can.setFileName(fileName);
		can.setUploadDir(fileDownloadUri);
		can.setFilesize(file.getSize());
		can.setFileType(file.getContentType());
		Candidate can1 = candidateService.insert(can);
		CandidateRecord c = new CandidateRecord();
		c.setStatus(1);
		c.setrUserId(can1.getrUsers());
		c.setHmUserId(can1.getHmUsers());
		c.setcId(can1);
		c.setSteps(1);
//		 SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
		 Date date = new Date();  
		c.setDate(date);
		c.setData(can1.getComment());
		candidateRecordService.insert(c);
		BaseResponse baseResponse = new BaseResponse();
		baseResponse.setResponse(insertCandidateConverter.toContract(can1));

		return ResponseEntity.ok().body(baseResponse);
	}

	@PostMapping("/getById")
	public ResponseEntity<BaseResponse> getById(@RequestBody GetByIdCandidateRequest request) {
		Candidate can = getByIdCandidateConverter.toModel(request);
		Candidate can1 = candidateService.getById(can.getId());
		BaseResponse baseResponse = new BaseResponse();
		baseResponse.setResponse(getByIdCandidateConverter.toContract(can1));
		return ResponseEntity.ok().body(baseResponse);
	}

	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public ResponseEntity<BaseResponse> getAll() {
		List<Candidate> response = candidateService.getAll();
		BaseResponse baseResponse = new BaseResponse();
		baseResponse.setResponse(getAllCandidateConverter.toContracts(response));
		return ResponseEntity.ok().body(baseResponse);
	}

	@PostMapping("/update")
	public ResponseEntity<BaseResponse> update(@RequestBody UpdateCandidateRequest request) {
		Candidate request2 = updateCandidateConverter.toModel(request);
		Candidate request3 = candidateService.update(request2);
		BaseResponse baseResponse = new BaseResponse();
		baseResponse.setResponse(updateCandidateConverter.toContract(request3));
		return ResponseEntity.ok().body(baseResponse);
	}

}
