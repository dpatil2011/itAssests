package com.anabatic.itAssets.endpoint.controller;

import java.io.IOException;
import java.util.Random;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.itAssests.core.constant.UsersErrorConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.anabatic.generic.endpoint.contract.BaseResponse;
import com.anabatic.generic.persistence.validator.field.ValidationCheck;
import com.anabatic.itAssets.endpoint.Request.DeleteCandidateByIdRequest;
import com.anabatic.itAssets.endpoint.Request.GetByCINCandidateRequest;
import com.anabatic.itAssets.endpoint.Request.GetByHmCandidateRequest;
import com.anabatic.itAssets.endpoint.Request.GetByIdCandidateRequest;
import com.anabatic.itAssets.endpoint.Request.GetByStatusAndStepCandidateRequest;
import com.anabatic.itAssets.endpoint.Request.GetByStatusStepHmCandidateRequest;
import com.anabatic.itAssets.endpoint.Request.GetByStepCandidateRequest;
import com.anabatic.itAssets.endpoint.Request.InsertCandidateRequest;
import com.anabatic.itAssets.endpoint.Request.JoiningDateCandidateRequest;
import com.anabatic.itAssets.endpoint.Request.MailRequest;
import com.anabatic.itAssets.endpoint.Request.ScheduleInterviewCandidateRequest;
import com.anabatic.itAssets.endpoint.Request.UpdateCandidateRequest;
import com.anabatic.itAssets.endpoint.Request.UpdateSelectionAndCommentRequest;
import com.anabatic.itAssets.endpoint.Request.UpdateSelectionCandidateRequest;
import com.anabatic.itAssets.endpoint.Request.UpdateStepAndStatusCandidateRequest;
import com.anabatic.itAssets.endpoint.converter.GetAllCandidateConverter;
import com.anabatic.itAssets.endpoint.converter.GetByCINCandidateConverter;
import com.anabatic.itAssets.endpoint.converter.GetByIdCandidateConverter;
import com.anabatic.itAssets.endpoint.converter.InsertCandidateConverter;
import com.anabatic.itAssets.endpoint.converter.InsertCandidateRecordConverter;
import com.anabatic.itAssets.endpoint.converter.UpdateCandidateConverter;
import com.anabatic.itAssets.persistence.dto.BulkUpdateCandidateResponseDto;
import com.anabatic.itAssets.persistence.model.Candidate;
import com.anabatic.itAssets.persistence.model.CandidateRecord;
import com.anabatic.itAssets.persistence.model.Users;
import com.anabatic.itAssets.services.service.CandidateRecordService;
import com.anabatic.itAssets.services.service.CandidateService;
import com.anabatic.itAssets.services.service.impl.FileStorageService;
import com.anabatic.logging.executor.Logging;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/candidate")
public class CandidateController {

	private static final Logging LOGGING = new Logging(CandidateController.class);
	private BaseResponse baseResponse = new BaseResponse();

	@Autowired
	private CandidateService candidateService;

	@Autowired
	private InsertCandidateConverter insertCandidateConverter;

	@Autowired
	private GetByIdCandidateConverter getByIdCandidateConverter;

	@Autowired
	private GetByCINCandidateConverter getByCINCandidateConverter;

	@Autowired
	private GetAllCandidateConverter getAllCandidateConverter;

	@Autowired
	private UpdateCandidateConverter updateCandidateConverter;

	@Autowired
	private FileStorageService fileStorageService;
	@Autowired
	private CandidateRecordService candidateRecordService;

	@Autowired
	private InsertCandidateRecordConverter insertCandidateRecordConverter;
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	public String random() {
		Random rand = new Random();
		String a = "CIN";
		int rand_int1 = rand.nextInt(10000);
		String b = a + rand_int1;

		Candidate random = candidateService.checkCin(b);
		if (random == null) {
			return b;
		} else {
			return null;
		}

	}
	
	@PostMapping("/insert")
	public ResponseEntity<BaseResponse> insert(@RequestParam("file") MultipartFile file,
			@RequestParam(value = "name", required = true) final String name,
			@RequestParam(value = "email", required = true) final String email,
			@RequestParam(value = "phoneNo", required = true) final String phoneNo,
			@RequestParam(value = "skills", required = true) final String skills,
			@RequestParam(value = "experience", required = true) final Float experience,
			@RequestParam(value = "status", required = true) final Integer status,
			@RequestParam(value = "comment", required = true) final String comment,
			@RequestParam(value = "hmId", required = true) final Long hmId,
			@RequestParam(value = "rId", required = true) final Long recruiterId) {

		String fileName = fileStorageService.storeFile(file);
		String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath().path("/candidate/").path(fileName)
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
		request.setStep(0);

		Candidate can = insertCandidateConverter.toModel(request);
		if(file.getContentType()!="application/pdf"||file.getContentType()!="image/png") {
			can.setFileType("application/docx");
		} else {
			can.setFileType(file.getContentType());
		}
		can.setFileName(fileName);
		can.setUploadDir(fileDownloadUri);
		can.setFilesize(file.getSize());
		Users user = new Users();
		user.setId(request.getrId());
		can.setUsers(user);

		// if (random2 == null) {
		// random2 = random();
		// }
		// can.setCin(random2);
		Candidate can1 = candidateService.insert(can);

		CandidateRecord c = new CandidateRecord();
		c.setStatus(1);

		// c.setrUserId(can1.getrUsers());
		// c.setHmUserId(can1.getHmUsers());
		// c.setcId(can1);
		// c.setSteps(1);
		// SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		c.setDate(date);
		c.setData(can1.getComment());
		candidateRecordService.insert(c);

		baseResponse.setResponse(insertCandidateConverter.toContract(can1));

		return ResponseEntity.ok().body(baseResponse);
	}

	@PostMapping("/getById")
	public ResponseEntity<BaseResponse> getById(@RequestBody GetByIdCandidateRequest request) {
		Candidate can = getByIdCandidateConverter.toModel(request);
		Candidate can1 = candidateService.getById(can.getId());
		baseResponse.setResponse(getByIdCandidateConverter.toContract(can1));
		return ResponseEntity.ok().body(baseResponse);
	}

	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public ResponseEntity<BaseResponse> getAll() {
		List<Candidate> response = candidateService.getAll();
		baseResponse.setResponse(getAllCandidateConverter.toContracts(response));
		return ResponseEntity.ok().body(baseResponse);
	}

	@PostMapping("/update")
	public ResponseEntity<BaseResponse> update(@RequestBody UpdateCandidateRequest request) {
		Candidate request2 = updateCandidateConverter.toModel(request);
		Candidate request3 = candidateService.update(request2);
		baseResponse.setResponse(updateCandidateConverter.toContract(request3));
		return ResponseEntity.ok().body(baseResponse);
	}

	@PostMapping("/update-list")
	public ResponseEntity<BaseResponse> updateList(@RequestBody List<UpdateCandidateRequest> request) {
		LOGGING.INFO("Accessed Bulk Update Candidate Controller Accesed");
		ValidationCheck.hasValidate(request, UsersErrorConstant.class);
		List<Candidate> request2 = updateCandidateConverter.toModels(request);
		BulkUpdateCandidateResponseDto response = candidateService.update(request2);
		// baseResponse.setResponse(updateCandidateConverter.toContracts(request3));
		baseResponse.setResponse(response);
		return ResponseEntity.ok().body(baseResponse);
	}

	@GetMapping("/{fileName:.+}")
	public ResponseEntity<Resource> downloadFile(@PathVariable String fileName, HttpServletRequest request) {

		Resource resource = fileStorageService.loadFileAsResource(fileName);
		String contentType = null;
		try {
			contentType = request.getServletContext().getMimeType(resource.getFile().getAbsolutePath());
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		if (contentType == null) {
			contentType = "application/octet-stream";
		}
		return ResponseEntity.ok().contentType(MediaType.parseMediaType(contentType))
				.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
				.body(resource);
	}

	@PostMapping("/getByHm")
	public ResponseEntity<BaseResponse> getByHm(@RequestBody GetByHmCandidateRequest request) {
		ValidationCheck.hasValidate(request);
		LOGGING.INFO("Inside GetBy HiringManager Candidate Controller");
		baseResponse.setResponse(getAllCandidateConverter.toContracts(candidateService.getByHm(request.getId())));
		return ResponseEntity.ok().body(baseResponse);
	}

	@PostMapping("/getByRecuriter")
	public ResponseEntity<BaseResponse> getByRecuriter(@RequestBody GetByHmCandidateRequest request) {
		ValidationCheck.hasValidate(request);
		LOGGING.INFO("Inside GetBy Recuriter Candidate Controller");
		baseResponse
				.setResponse(getAllCandidateConverter.toContracts(candidateService.getByRecuriter(request.getId())));
		return ResponseEntity.ok().body(baseResponse);
	}

	@PostMapping("/schedule-interview")
	public ResponseEntity<BaseResponse> scheduleInterview(@RequestBody ScheduleInterviewCandidateRequest request) {
		ValidationCheck.hasValidate(request);
		LOGGING.INFO("Inside scheduleInterview Candidate Controller");
		Candidate request3 = candidateService.scheduleInterview(request.getcId(), request.getInterviewDate(),
				request.getMode(), request.getEndTime(), request.getStatus(), request.getComment(), request.getStartTime());
		// if(request3!=null) {
		// CandidateRecord candidateRecord = new CandidateRecord();
		
		// ObjectMapper Obj = new ObjectMapper();
		// Candidate candidate=candidateService.getById(request.getcId());
		// candidate.setComment(request.getComment());
		// candidate.setStep(request.getStep());
		// String jsonStr=null;
		// try {
		// jsonStr = Obj.writeValueAsString(candidate);
		// } catch (JsonProcessingException e) {
		// e.printStackTrace();
		// }
		// candidateRecord.setcId(request3);
		// candidateRecord.setComment(request.getComment());
		// candidateRecord.setHmUserId(request3.getUsers());
		// candidateRecord.setrUserId(request3.getUsersr());
		// candidateRecord.setData(jsonStr);
		// candidateRecord.setDate(new Date());
		// candidateRecord.setStatus(request.getStatus());
		// candidateRecord.setSteps(request3.getStep());
		// CandidateRecord insert = candidateRecordService.insert(candidateRecord);
		// }
		baseResponse.setResponse(updateCandidateConverter.toContract(request3));
		return ResponseEntity.ok().body(baseResponse);
	}

	@PostMapping("/joining-date")
	public ResponseEntity<BaseResponse> joiningDate(@RequestBody JoiningDateCandidateRequest request) {
		ValidationCheck.hasValidate(request);
		LOGGING.INFO("Inside joiningDate Candidate Controller");
		Candidate request3 = candidateService.joiningDate(request.getDateOfJoining(), request.getId(),
				request.getComment(), request.getSelection(), request.getStatus(), request.getStep());
		baseResponse.setResponse(updateCandidateConverter.toContract(request3));
		return ResponseEntity.ok().body(baseResponse);
	}

	@PostMapping("/getByCIN")
	public ResponseEntity<BaseResponse> getByCIN(@RequestBody GetByCINCandidateRequest request) {
		ValidationCheck.hasValidate(request);
		Candidate can = getByCINCandidateConverter.toModel(request);
		Candidate can1 = candidateService.getByCIN(can.getCin());
		BaseResponse baseResponse = new BaseResponse();
		baseResponse.setResponse(getByCINCandidateConverter.toContract(can1));
		return ResponseEntity.ok().body(baseResponse);
	}

	@PostMapping("/getByStatusAndStep")
	public ResponseEntity<BaseResponse> getByStatusAndStep(@RequestBody GetByStatusAndStepCandidateRequest request) {
		ValidationCheck.hasValidate(request);
		// Candidate can = getByCINCandidateConverter.toModel(request);
		List<Candidate> can1 = candidateService.getByStatusAndStep(request.getStatus(), request.getStep());
		BaseResponse baseResponse = new BaseResponse();
		baseResponse.setResponse(getAllCandidateConverter.toContracts(can1));
		return ResponseEntity.ok().body(baseResponse);
	}
	
	@PostMapping("/getByStatusStepHm")
	public ResponseEntity<BaseResponse> getByStatusStepHm(@RequestBody GetByStatusStepHmCandidateRequest request) {
		ValidationCheck.hasValidate(request);
		// Candidate can = getByCINCandidateConverter.toModel(request);
		List<Candidate> can1 = candidateService.getByStatusStepHm(request.getStatus(), request.getStep(), request.getHmId());
		BaseResponse baseResponse = new BaseResponse();
		baseResponse.setResponse(getAllCandidateConverter.toContracts(can1));
		return ResponseEntity.ok().body(baseResponse);
	}

	@PostMapping("/getByStatusStepSelection")
	public ResponseEntity<BaseResponse> getByStatusStepSelection(
			@RequestBody GetByStatusAndStepCandidateRequest request) {
		ValidationCheck.hasValidate(request);
		// Candidate can = getByCINCandidateConverter.toModel(request);
		List<Candidate> can1 = candidateService.getByStatusStepSelection(request.getStatus(), request.getStep(),
				request.getSelection());
		BaseResponse baseResponse = new BaseResponse();
		baseResponse.setResponse(getAllCandidateConverter.toContracts(can1));
		return ResponseEntity.ok().body(baseResponse);
	}

	@PostMapping("/getByStep")
	public ResponseEntity<BaseResponse> getByStep(@RequestBody GetByStepCandidateRequest request) {
		ValidationCheck.hasValidate(request);
		List<Candidate> can1 = candidateService.getByStep(request.getStep());
		baseResponse = new BaseResponse();
		baseResponse.setResponse(getAllCandidateConverter.toContracts(can1));
		return ResponseEntity.ok().body(baseResponse);
	}

	@PostMapping("/update-step-status")
	public ResponseEntity<BaseResponse> updateStepAndStatus(@RequestBody UpdateStepAndStatusCandidateRequest request) {
		Candidate request3 = candidateService.updateStepAndStatus(request.getStatus(), request.getStep(),
				request.getId(), request.getSelection(), request.getComment());
		baseResponse.setResponse(updateCandidateConverter.toContract(request3));
		return ResponseEntity.ok().body(baseResponse);
	}

	@PostMapping("/update-selection")
	public ResponseEntity<BaseResponse> updateSelection(@RequestBody UpdateSelectionCandidateRequest request) {
		Candidate request3 = candidateService.updateSelection(request.getId(), request.getSelection());
		baseResponse.setResponse(updateCandidateConverter.toContract(request3));
		return ResponseEntity.ok().body(baseResponse);
	}

	@PostMapping("/deleteById")
	public ResponseEntity<BaseResponse> deleteById(@RequestBody DeleteCandidateByIdRequest request) {
		ValidationCheck.hasValidate(request);
		candidateService.deleteById(request.getId());
		return ResponseEntity.ok().body(baseResponse);
	}

	@PostMapping("/sendmail")
	public ResponseEntity<BaseResponse> sendMail(@RequestBody MailRequest request) {
		SimpleMailMessage msg = new SimpleMailMessage();
		// can be send for multiple user
		msg.setTo(request.getToMail());
		msg.setSubject(request.getSubject());
		msg.setText(request.getBody());
		javaMailSender.send(msg);
		baseResponse.setResponse("Email sent successfully");
		return ResponseEntity.ok().body(baseResponse);
	}

	@PostMapping("/updateSelectionAndComment")
	public ResponseEntity<BaseResponse> updateSelectionAndComment(
			@RequestBody UpdateSelectionAndCommentRequest request) {
		ValidationCheck.hasValidate(request);
		BaseResponse baseResponse = new BaseResponse();
		baseResponse.setResponse(candidateService.updateSelectionAndComment(request.getId(), request.getComment(),
				request.getSelection()));
		return ResponseEntity.ok().body(baseResponse);
	}

}