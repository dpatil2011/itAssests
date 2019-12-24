package com.anabatic.itAssets.persistence.dao;

import java.util.List;

import com.anabatic.itAssets.persistence.model.Faq;

public interface FaqDao {

	public Faq insert(Faq faq);

	public Faq getById(Faq faq);

	public Faq update(Faq faq);

	public void delete(Faq faq);

	public List<Faq> getall();

	public List<Faq> getByQueTo(Faq faq);

	public List<Faq> getByUIdAndQueTo(Faq faq);

}
