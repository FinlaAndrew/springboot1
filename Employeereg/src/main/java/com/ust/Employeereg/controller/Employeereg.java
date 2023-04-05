package com.ust.Employeereg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.Employeereg.model.Employeemodel;
import com.ust.Employeereg.service.Employeeservice;



@RestController
@RequestMapping("registration")
@CrossOrigin("*")
public class Employeereg {
	@Autowired
	public Employeeservice employeeservice;
	
	@PostMapping("/addemps")
	public Employeemodel addemp(@RequestBody Employeemodel employee) {
		return employeeservice.createEmployee(employee);
	}
	@GetMapping("/employees")
	public List<Employeemodel> getALLEmployee(){
		return employeeservice.getEmployee();
	}
//	@GetMapping("/employees/{id}")
//	public Employeemodel getEmployeeById(@PathVariable int id) {
//		return employeeservice.getEmployeeId(id);
//	}
//	@PutMapping("/updateemployee/{id}")
//	public Employeemodel updateEmployee(@RequestBody Employeemodel employee) {
//		return employeeservice.updateEmployee(employee);
//	}
//	@DeleteMapping("/deleteemployee/{id}")
//	public String deleteEmployee(@PathVariable int id) {
//		return employeeservice.deleteEmployeeById(id);
//	}

}
