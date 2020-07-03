package com.pages;

import org.apache.tapestry5.annotations.Property;

import com.model.Employee;
import com.services.EmployeeService;

public class ViewEmployee {

	@Property
	private int id;
	
	void onActivate(int id) {
		this.id = id;
	}
	
	@Property
	private Employee employee;
	
	void setupRender() {
		EmployeeService empSer = new EmployeeService();
		this.employee = empSer.findById(this.id);
	}
	
	
}
