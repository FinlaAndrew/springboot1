package com.ust.EmployeesecurityJwt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user_tbl")
public class User {
	@Id
	private int id;
	private String name;
	private String password;
	private String email;
	private String phnumber;
	public User() {
		
	}
	public User(int id, String name, String password, String email, String phnumber) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.phnumber = phnumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhnumber() {
		return phnumber;
	}
	public void setPhnumber(String phnumber) {
		this.phnumber = phnumber;
	}

}