package com.cts.swbdd.service;

import java.util.List;

import com.cts.swbdd.entity.Employee;


public interface EmployeeService {
	Employee add(Employee emp);
	Employee update(Employee emp);
	void delete(long EmpId);
	Employee getEmployee(long EmpId);
	List<Employee> getAll();

}
