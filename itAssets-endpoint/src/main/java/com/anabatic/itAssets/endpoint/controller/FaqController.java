package com.anabatic.itAssets.endpoint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anabatic.generic.endpoint.contract.BaseResponse;
import com.anabatic.itAssets.endpoint.Request.DeleteFaqRequest;
import com.anabatic.itAssets.endpoint.Request.GetByIdFaqRequest;
import com.anabatic.itAssets.endpoint.Request.InsertFaqRequest;
import com.anabatic.itAssets.endpoint.Request.UpdateFaqRequest;
import com.anabatic.itAssets.endpoint.converter.DeleteFaqConverter;
import com.anabatic.itAssets.endpoint.converter.GetAllFaqConverter;
import com.anabatic.itAssets.endpoint.converter.GetByIdFaqConverter;
import com.anabatic.itAssets.endpoint.converter.InsertFaqConverter;
import com.anabatic.itAssets.endpoint.converter.UpdateFaqConverter;
import com.anabatic.itAssets.persistence.model.Faq;
import com.anabatic.itAssets.services.service.FaqService;

@RestController
@RequestMapping("/faq")
public class FaqController {

	@Autowired
	private FaqService faqService;

	@Autowired
	private InsertFaqConverter insertFaqConverter;

	@Autowired
	private GetByIdFaqConverter getByIdFaqConverter;

	@Autowired
	private UpdateFaqConverter updateFaqConverter;

	@Autowired
	private DeleteFaqConverter deleteFaqConverter;

	@Autowired
	private GetAllFaqConverter getAllFaqConverter;

	@PostMapping("/insert")
	public ResponseEntity<BaseResponse> insert(@RequestBody InsertFaqRequest request) {
		Faq faq = insertFaqConverter.toModel(request);
		Faq faq2 = faqService.insert(faq);
		BaseResponse baseResponse = new BaseResponse();
		baseResponse.setResponse(insertFaqConverter.toContract(faq2));
		return ResponseEntity.ok().body(baseResponse);
	}

	@PostMapping("/getById")
	public ResponseEntity<BaseResponse> getById(@RequestBody GetByIdFaqRequest request) {
		Faq faq = getByIdFaqConverter.toModel(request);
		Faq faq2 = faqService.getById(faq);
		BaseResponse baseResponse = new BaseResponse();
		baseResponse.setResponse(getByIdFaqConverter.toContract(faq2));
		return ResponseEntity.ok().body(baseResponse);
	}

	@PostMapping("/update")
	public ResponseEntity<BaseResponse> update(@RequestBody UpdateFaqRequest request) {
		Faq faq = updateFaqConverter.toModel(request);
		Faq faq2 = faqService.update(faq);
		BaseResponse baseResponse = new BaseResponse();
		baseResponse.setResponse(updateFaqConverter.toContract(faq2));
		return ResponseEntity.ok().body(baseResponse);
	}

	@PostMapping("/delete")
	public ResponseEntity<BaseResponse> delete(@RequestBody DeleteFaqRequest request) {
		Faq faq = deleteFaqConverter.toModel(request);
		faqService.delete(faq);
		BaseResponse baseResponse = new BaseResponse();
		return ResponseEntity.ok().body(baseResponse);
	}

	@RequestMapping("/getall")
	public ResponseEntity<BaseResponse> update() {
		List<Faq> faqs = faqService.getAll();
		BaseResponse baseResponse = new BaseResponse();
		baseResponse.setResponse(getAllFaqConverter.toContracts(faqs));
		return ResponseEntity.ok().body(baseResponse);
	}

}
