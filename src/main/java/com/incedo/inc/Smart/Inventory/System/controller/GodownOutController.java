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

import com.incedo.inc.Smart.Inventory.System.controller.entity.GodownOutEntity;
import com.incedo.inc.Smart.Inventory.System.repository.GodownOutRepository;


@RestController

public class GodownOutController {
	
//	@GetMapping("/tested") 
// public String getTestString() { 
//	 return "Hello World"; }
// }
//	 
	
	@Autowired
	GodownOutRepository employeeRepository;
	
	List<GodownOutEntity> godownout = new ArrayList<GodownOutEntity>();

	
	@GetMapping(path="/godownout")
	public List<GodownOutEntity> getEmployees() {
		//return employees;
		return employeeRepository.findAll();
	}
	@PostMapping(path="/godownout")
	public void addEmployee(@RequestBody GodownOutEntity e) {
		//employees.add(e);
		employeeRepository.save(e);
	}
	@PatchMapping(path="/godownout")
	public void updateEmployeeSalary(@RequestBody GodownOutEntity employee) {
		Optional<GodownOutEntity> employeeFound=employeeRepository.findById(employee.getGodownid());
		if(employeeFound.isPresent()) {
			GodownOutEntity e = employeeFound.get();
			e.setDateofsupply(employee.getDateofsupply());
			e.setDateofdelivery(employee.getDateofdelivery());
			e.setDeliveredto(employee.getDeliveredto());
			e.setPurpose(employee.getPurpose());
			e.setQuantity(employee.getQuantity());
			e.setItemname(employee.getItemname());
			e.setInvoiceno(employee.getInvoiceno());
			e.setBillvalue(employee.getBillvalue());
			e.setBillcheckedby(employee.getBillcheckedby());
			e.setReceiptno(employee.getReceiptno());
			
			
			
			employeeRepository.save(e);
}
	}
		@DeleteMapping(path="/godownout/{Godownid}")
		public void deleteEmployee(@PathVariable int Godownid) {
			System.out.println("Id:"+Godownid);
			employeeRepository.deleteById(Godownid);
}
}