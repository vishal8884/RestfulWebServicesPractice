package com.vishal.Rest.controller;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vishal.Rest.Entities.Employee;
import com.vishal.Rest.Repositories.EmployeeRepository;

@RestController
@RequestMapping("/employee") 
public class EmployeeRestController {

	//https://spring.io/guides/tutorials/rest/     refer this page to do further
	
	@Autowired
	EmployeeRepository employeeRepo;
	
	@GetMapping(path="/{empId}")
	public Employee getEmployee(@PathVariable int empId) throws Exception
	{
		
		Employee emp= employeeRepo.findById(empId).orElse(new Employee());
		
		return emp;
	}
	

}










//@GetMapping(path="/{empId}")
//public Employee getEmployee(@PathVariable int empId) throws Exception
//{
//	
//	return employeeRepo.findById(empId)
//		      .orElseThrow(() -> new Exception("no employee foind"));
//}