package com.incedo.inc.Smart.Inventory.System.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.incedo.inc.Smart.Inventory.System.controller.entity.GodownDamageEntity;
import com.incedo.inc.Smart.Inventory.System.repository.GodownDamageRepository;




@Service
public class GodownDamageService {
	
	@Autowired
	GodownDamageRepository employeeRepository;
	
	public List<GodownDamageEntity> getAll() {
		return employeeRepository.findAll();
	}

}
