package com.example.JpaManytoManyrepo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.JpaManytoManyentity.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {

	List<Student> findByNameContaining(String name);

}
