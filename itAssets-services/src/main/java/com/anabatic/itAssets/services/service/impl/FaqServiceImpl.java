package com.anabatic.itAssets.services.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.anabatic.itAssets.persistence.dao.FaqDao;
import com.anabatic.itAssets.persistence.dao.RequestDao;
import com.anabatic.itAssets.persistence.model.Faq;
import com.anabatic.itAssets.persistence.model.Request;
import com.anabatic.itAssets.services.service.FaqService;

public class FaqServiceImpl implements FaqService {
	
	@Autowired
	private FaqDao faqDao;

	@Override
	public Faq insert(Faq faq) {
		Faq faq2 = faqDao.insert(faq);
		return faq2;
	}

	@Override
	public Faq getById(Faq faq) {
		Faq faq2 = faqDao.getById(faq);
		return faq2;
	}

	@Override
	public Faq update(Faq faq) {
		Faq faq2 = faqDao.update(faq);
		return faq2;
	}

	@Override
	public void delete(Faq faq) {
		faqDao.delete(faq);
	}
	@Override
	public List<Faq> getAll(){
		List<Faq> list=new ArrayList<>();
		list=faqDao.getall();
		return list;
	}

	@Override
	public List<Faq> getByQueTo(Faq faq) {
		List<Faq> list=new ArrayList<>();
		list=faqDao.getByQueTo(faq);
		return list;
	}

	@Override
	public List<Faq> getByUIdAndQueTo(Faq faq) {
		List<Faq> list=new ArrayList<>();
		list=faqDao.getByUIdAndQueTo(faq);
		return list;
	}

}
