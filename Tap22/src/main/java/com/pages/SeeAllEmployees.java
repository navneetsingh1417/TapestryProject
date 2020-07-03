package com.pages;

import java.util.List;

import org.apache.tapestry5.annotations.Property;

import com.model.Employee;
import com.model.EmployeeHold;
import com.services.EmployeeService;

public class SeeAllEmployees {

	@Property
	private List<Employee> employees;
	
	@Property
	private Employee employee;
	
	
	void setupRender() {
		EmployeeHold empHold = new EmployeeHold();
		this.employees = empHold.getAllEmp();
	}
	
	
	
}
