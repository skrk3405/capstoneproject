package com.incedo.inc.Smart.Inventory.System.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.incedo.inc.Smart.Inventory.System.controller.entity.Godowns;
import com.incedo.inc.Smart.Inventory.System.repository.GodownRepository;


@RestController

public class GodownController {
	
//	@GetMapping("/tested") 
// public String getTestString() { 
//	 return "Hello World"; }
// }
//	 
	
	@Autowired
	GodownRepository employeeRepository;
	
	List<Godowns> godown = new ArrayList<Godowns>();

	
	@GetMapping(path="/godown")
	public List<Godowns> getEmployees() {
		//return employees;
		return employeeRepository.findAll();
	}
	@PostMapping(path="/godown")
	public void addEmployee(@RequestBody Godowns e) {
		//employees.add(e);
		employeeRepository.save(e);
	}
	@PatchMapping(path="/godown")
	public void updateEmployeeSalary(@RequestBody Godowns employee) {
		Optional<Godowns> employeeFound=employeeRepository.findById(employee.getGodownid());
		if(employeeFound.isPresent()) {
			Godowns e = employeeFound.get();
			e.setGodownlocation(employee.getGodownlocation());
			e.setGodownmanager(employee.getGodownmanager());
			e.setGodownid(employee.getGodownid());
			e.setGodownItemsCount(employee.getGodownItemsCount());
			e.setImage(employee.getImage());
			e.setName(employee.getName());
			
			
			
			
			employeeRepository.save(e);
}
	}
		@DeleteMapping(path="/godown/{Godownid}")
		public void deleteEmployee(@PathVariable int Godownid) {
			System.out.println("Id:"+Godownid);
			employeeRepository.deleteById(Godownid);
}
}