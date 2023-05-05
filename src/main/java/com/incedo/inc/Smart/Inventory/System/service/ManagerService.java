package com.incedo.inc.Smart.Inventory.System.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.incedo.inc.Smart.Inventory.System.controller.entity.EmployeeEntity;
import com.incedo.inc.Smart.Inventory.System.controller.entity.ManagerDetails;
import com.incedo.inc.Smart.Inventory.System.repository.EmployeeRepository;


@Service
public class ManagerService {
	
	@Autowired
	com.incedo.inc.Smart.Inventory.System.repository.MangerDetailsRepository MangerDetailsRepository;
	
	public List<ManagerDetails> getAll() {
		return MangerDetailsRepository.findAll();
	}

}
