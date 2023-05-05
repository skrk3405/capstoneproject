package com.incedo.inc.Smart.Inventory.System.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.incedo.inc.Smart.Inventory.System.controller.entity.EmployeeDetails;
import com.incedo.inc.Smart.Inventory.System.controller.entity.EmployeeEntity;
import com.incedo.inc.Smart.Inventory.System.controller.entity.UserDetails;
import com.incedo.inc.Smart.Inventory.System.repository.EmployeeRepository;
import com.incedo.inc.Smart.Inventory.System.repository.UserDetailsRepository;

@RestController

public class UserDetailsController {
	
//	@GetMapping("/tested") 
// public String getTestString() { 
//	 return "Hello World"; }
// }
//	 
	
	@Autowired
	UserDetailsRepository employeeRepository;
	
	List<UserDetails> UserDetails = new ArrayList<UserDetails>();

	
	@GetMapping(path="/UserDetails")
	public List<UserDetails> getEmployees(@RequestHeader("Authorization")String Token) {
		//return employees;
		return employeeRepository.findAll();
	}
	@PostMapping(path="/UserDetails")
	public void addEmployee(@RequestBody UserDetails e) {
		//employees.add(e);
		employeeRepository.save(e);
	}
	@PatchMapping(path="/UserDetails")
	public void updateEmployeeSalary(@RequestBody UserDetails employee) {
		Optional<UserDetails> employeeFound=employeeRepository.findById(employee.getUserid());
		if(employeeFound.isPresent()) {
			UserDetails e = employeeFound.get();
			e.setEmail(employee.getEmail());
			e.setPassword(employee.getPassword());
			e.setUserid(employee.getUserid());
			e.setUsername(employee.getUsername());
			
			
			employeeRepository.save(e);
}
	}
		@DeleteMapping(path="/UserDetails/{Userid}")
		public void deleteEmployee(@PathVariable int Userid) {
			System.out.println("Id:"+Userid);
			employeeRepository.deleteById(Userid);
}
}