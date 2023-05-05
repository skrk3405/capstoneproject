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


import com.incedo.inc.Smart.Inventory.System.controller.entity.GodownDamageEntity;
import com.incedo.inc.Smart.Inventory.System.repository.GodownDamageRepository;




@RestController



public class GodowndamageController {

//    @GetMapping("/tested") 
// public String getTestString() { 
//     return "Hello World"; }
// }
//     

@Autowired
GodownDamageRepository employeeRepository;

List<GodownDamageEntity> godowndamage = new ArrayList<GodownDamageEntity>();




 @GetMapping(path="/godowndamage")
public List<GodownDamageEntity> getEmployees() {
//return employees;
return employeeRepository.findAll();
}
@PostMapping(path="/godowndamage")
public void addEmployee(@RequestBody GodownDamageEntity e) {
//employees.add(e);
employeeRepository.save(e);
}



@PatchMapping(path="/godowndamage") public void
updateEmployeeSalary(@RequestBody GodownDamageEntity employee) {
Optional<GodownDamageEntity>
employeeFound=employeeRepository.findById(employee.getGodownid());
if(employeeFound.isPresent()) { GodownDamageEntity e = employeeFound.get();
e.setDateofreturn(employee.getDateofreturn());
 e.setDateofdelivery(employee.getDateofdelivery());
e.setReturnedto(employee.getReturnedto());

e.setQuantity(employee.getQuantity());
e.setItemname(employee.getItemname());
e.setInvoiceno(employee.getInvoiceno());
e.setBillvalue(employee.getBillvalue());
e.setBillcheckedby(employee.getBillcheckedby());
e.setReceiptno(employee.getReceiptno());


employeeRepository.save(e); } }

@DeleteMapping(path="/godowndamage/{Godownid}") public void
deleteEmployee(@PathVariable int Godownid) {
 System.out.println("Id:"+Godownid); 
 employeeRepository.deleteById(Godownid);
 


} 
}
