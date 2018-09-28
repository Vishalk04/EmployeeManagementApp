package com.yash.model;

import java.util.List;

public class Employee {
	
	private Integer empId;
	private String firstName;
	private String lastName;
	private List<String> projects;
		
	public Employee(){
		
	}
	
	public Employee(int empId, String firstName, String lastName, List<String> projects) {
		// TODO Auto-generated constructor stub
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.projects = projects;
	}
	
	public Integer getId() {
		return empId;
	}
	public void setId(Integer id) {
		this.empId = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public List<String> getProjects() {
		return projects;
	}
	public void setProjects(List<String> projects) {
		this.projects = projects;
	}
	

}
