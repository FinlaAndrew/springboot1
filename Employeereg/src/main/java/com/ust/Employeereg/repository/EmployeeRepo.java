package com.ust.Employeereg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ust.Employeereg.model.Employeemodel;


@Repository
public interface EmployeeRepo extends JpaRepository<Employeemodel,Integer> {

}
