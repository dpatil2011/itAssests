package com.anabatic.itAssets.persistence.dao;

import java.util.List;

import org.springframework.boot.CommandLineRunner;

import com.anabatic.itAssets.persistence.model.Login;

public interface LoginDao {

	CommandLineRunner insert();

	List<Login> getAll();

}
