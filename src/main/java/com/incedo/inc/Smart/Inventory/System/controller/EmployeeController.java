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

import com.incedo.inc.Smart.Inventory.System.controller.entity.EmployeeDetails;
import com.incedo.inc.Smart.Inventory.System.controller.entity.EmployeeEntity;
import com.incedo.inc.Smart.Inventory.System.repository.EmployeeRepository;

@RestController

public class EmployeeController {
	
//	@GetMapping("/tested") 
// public String getTestString() { 
//	 return "Hello World"; }
// }
//	 
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	List<EmployeeDetails> employeesdata = new ArrayList<>();

	
	@GetMapping(path="/employeesdata")
	public List<EmployeeDetails> getEmployees() {
		//return employees;
		return employeeRepository.findAll();
	}
	@PostMapping(path="/employeesdata")
	public void addEmployee(@RequestBody EmployeeDetails e) {
		//employees.add(e);
		employeeRepository.save(e);
	}
	@PatchMapping(path="/employeesdata")
	public void updateEmployeeSalary(@RequestBody EmployeeDetails employee) {
		Optional<EmployeeDetails> employeeFound=employeeRepository.findById(employee.getId());
		if(employeeFound.isPresent()) {
			EmployeeDetails e = employeeFound.get();
			e.setDepartment(employee.getDepartment());
			e.setDesignation(employee.getDesignation());
			e.setEmployeename(employee.getEmployeename());
			e.setEmployeeid(employee.getEmployeeid());
			e.setLocation(employee.getLocation());
			
			employeeRepository.save(e);
}
	}
		@DeleteMapping(path="/employeesdata/{Employeeid}")
		public void deleteEmployee(@PathVariable int Employeeid) {
			System.out.println("Id:"+Employeeid);
			employeeRepository.deleteById(Employeeid);
}
}