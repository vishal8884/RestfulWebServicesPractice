package com.vishal.Rest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vishal.Rest.Entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
