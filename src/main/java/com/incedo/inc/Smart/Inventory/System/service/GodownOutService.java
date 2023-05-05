package com.incedo.inc.Smart.Inventory.System.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.incedo.inc.Smart.Inventory.System.controller.entity.GodownOutEntity;
import com.incedo.inc.Smart.Inventory.System.repository.GodownOutRepository;





@Service
public class GodownOutService {
	
	@Autowired
	GodownOutRepository employeeRepository;
	
	public List<GodownOutEntity> getAll() {
		return employeeRepository.findAll();
	}

}
