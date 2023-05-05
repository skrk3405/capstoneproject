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


import com.incedo.inc.Smart.Inventory.System.controller.entity.GodownInwardsEntity;
import com.incedo.inc.Smart.Inventory.System.repository.GodowninRepository;


@RestController

public class GodownInController {
	
//	@GetMapping("/tested") 
// public String getTestString() { 
//	 return "Hello World"; }
// }
//	 
	
	@Autowired
	GodowninRepository employeeRepository;
	
	List<GodownInwardsEntity> godownin = new ArrayList<GodownInwardsEntity>();

	
	@GetMapping(path="/godownin")
	public List<GodownInwardsEntity> getEmployees() {
		//return employees;
		return employeeRepository.findAll();
	}
	@PostMapping(path="/godownin")
	public void addEmployee(@RequestBody GodownInwardsEntity e) {
		//employees.add(e);
		employeeRepository.save(e);
	}
	@PatchMapping(path="/godownin")
	public void updateEmployeeSalary(@RequestBody GodownInwardsEntity employee) {
		Optional<GodownInwardsEntity> employeeFound=employeeRepository.findById(employee.getId());
		if(employeeFound.isPresent()) {
			GodownInwardsEntity e = employeeFound.get();
			e.setDateofdelivery(employee.getDateofdelivery());
			e.setDateofsupply(employee.getDateofsupply());
			e.setGodownid(employee.getGodownid());
			e.setId(employee.getId());
			e.setInvoiceno(employee.getInvoiceno());
			e.setItemname(employee.getItemname());
			e.setQuantity(employee.getQuantity());
			e.setSuplier(employee.getSuplier());
			
			
			
			
			
			
			employeeRepository.save(e);
}
	}
		@DeleteMapping(path="/godownin/{Godownid}")
		public void deleteEmployee(@PathVariable int Godownid) {
			System.out.println("Id:"+Godownid);
			employeeRepository.deleteById(Godownid);
}
}