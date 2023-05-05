package com.incedo.inc.Smart.Inventory.System.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.incedo.inc.Smart.Inventory.System.controller.entity.Godowns;
import com.incedo.inc.Smart.Inventory.System.repository.GodownRepository;



@Service
public class GodownService {
	
	@Autowired
	GodownRepository employeeRepository;
	
	public List<Godowns> getAll() {
		return employeeRepository.findAll();
	}

}
