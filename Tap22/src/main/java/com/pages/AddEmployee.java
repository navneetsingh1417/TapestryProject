package com.pages;

import org.apache.tapestry5.annotations.InjectComponent;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.corelib.components.Form;

import com.model.Employee;
import com.services.EmployeeService;

public class AddEmployee {

	@Property
	private Integer id;
	
	@Property
	private Integer age;
	
	@Property
	private String name;
	
	@Property
	private String address;
	
	@Property
	private String username;
	
	@Property
	private String password;
	
	@InjectComponent("add")
	private Form form;
	
	
	
	Object onSuccess() {
		EmployeeService empSer = new EmployeeService();
		Employee e = new Employee(id,age,name,address,username,password);
		empSer.addEmployee(e);
		return Dashboard.class;
	}
}
