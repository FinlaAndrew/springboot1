package com.ust.EmployeesecurityJwt.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ust.EmployeesecurityJwt.entity.AuthRequest;
import com.ust.EmployeesecurityJwt.service.UserService;
@RestController
public class UserController {
	@Autowired
	private UserService service;
	
	@GetMapping("/welcome")
	public String welcome() {
		return "HI WELCOME TO UST";
	}
	
	@PostMapping("/authenticate")
	public String generateToken(@RequestBody AuthRequest authrequest) {
		return null;
	}
}
