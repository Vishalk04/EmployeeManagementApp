package com.yash.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.yash.model.Employee;

@Service
public class EmployeeServices {
	
	public static List<Employee> employees = new ArrayList<Employee>();
	static{
		employees.addAll(Arrays.asList(new Employee(1, "mike","john",new ArrayList<>(Arrays.asList("Software Engineer","sr Software Engineer"))),
				new Employee(2, "johnson","john",new ArrayList<>(Arrays.asList("Software Engineer"))),
				new Employee(3, "joye","tribiyanee",new ArrayList<>(Arrays.asList("sr Software Engineer"))),
				new Employee(4, "ross","geller",new ArrayList<>(Arrays.asList("manager"))),
				new Employee(5, "chandler","bing",new ArrayList<>(Arrays.asList("sr manager")))
				));
	}

	public Employee getById(Integer empId){
		//return employees.stream().filter(predicate);
	}
	
}
