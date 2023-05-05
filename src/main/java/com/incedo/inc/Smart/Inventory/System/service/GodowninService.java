package com.incedo.inc.Smart.Inventory.System.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.incedo.inc.Smart.Inventory.System.controller.entity.GodownInwardsEntity;
import com.incedo.inc.Smart.Inventory.System.repository.GodowninRepository;




@Service
public class GodowninService {
	
	@Autowired
	GodowninRepository employeeRepository;
	
	public List<GodownInwardsEntity> getAll() {
		return employeeRepository.findAll();
	}

}
