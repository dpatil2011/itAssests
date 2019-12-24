package com.anabatic.itAssets.services.service;

import java.util.List;

import com.anabatic.itAssets.persistence.model.Faq;

public interface FaqService {

	public Faq insert(Faq faq);

	public Faq getById(Faq faq);

	public Faq update(Faq faq);

	public void delete(Faq faq);

	public List<Faq> getAll();

	public List<Faq> getByQueTo(Faq faq);

	public List<Faq> getByUIdAndQueTo(Faq faq);

}
