package com.incedo.inc.Smart.Inventory.System.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.incedo.inc.Smart.Inventory.System.controller.entity.EmployeeDetails;
import com.incedo.inc.Smart.Inventory.System.repository.EmployeeRepository;


@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public List<EmployeeDetails> getAll() {
		return employeeRepository.findAll();
	}

}
