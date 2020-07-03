package com.model;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	private int id;
	private int age;
	private String name;
	private String address;
	private String username;
	private String password;
	
	public Employee(int id,int age,String name,String address,String username,String password) {
		this.id = id;
		this.age = age;
		this.name = name;
		this.address = address;
		this.username = username;
		this.password = password;
	}
	


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	
}
