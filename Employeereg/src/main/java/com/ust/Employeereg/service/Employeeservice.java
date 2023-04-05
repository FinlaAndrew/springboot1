package com.ust.Employeereg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.Employeereg.model.Employeemodel;
import com.ust.Employeereg.repository.EmployeeRepo;
@Service
public class Employeeservice {
     @Autowired
	private EmployeeRepo repo;
	public Employeemodel createEmployee(Employeemodel employee) {
		return repo.save(employee);
	}

	public List<Employeemodel> getEmployee() {
		return repo.findAll();
	}
//
//	public Employeemodel getEmployeeId(int id) {
//		return repo.findById(id).orElse(null);
//	}
//
//	public Employeemodel updateEmployee(Employeemodel employee) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public String deleteEmployeeById(int id) {
//		
//	}

}
