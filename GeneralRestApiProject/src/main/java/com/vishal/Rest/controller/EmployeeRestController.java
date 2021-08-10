package com.vishal.Rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vishal.Rest.Entities.Employee;
import com.vishal.Rest.Repositories.EmployeeRepository;

@RestController
@RequestMapping("/employee")
public class EmployeeRestController {

	@Autowired
	EmployeeRepository employeeRepo;
	
	@GetMapping("/{empId}")
	public Employee getEmployee(@PathVariable int empId)
	{
		Employee getEmployeejson=employeeRepo.getById(empId);
		
		System.out.println("getEmployeejson :: "+getEmployeejson);
		
		return getEmployeejson;
	}
}
