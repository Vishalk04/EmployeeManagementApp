package com.yash.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.yash.model.Employee;
import com.yash.services.EmployeeServices;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeServices employeeServices;

	
	@GetMapping("/employees/{empId}")
	public Employee getEmployee(@PathVariable Integer empId) {
	
		return employeeServices.getById(empId);

	}


}
