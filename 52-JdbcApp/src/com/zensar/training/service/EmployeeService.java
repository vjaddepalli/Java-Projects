package com.zensar.training.service;

import java.util.List;

import com.zensar.training.bean.Employee;

public interface EmployeeService {

	boolean addEmployee(Employee employee) throws Exception;

	boolean updateEmployee(Employee employee) throws Exception;

	boolean deleteEmployee(Employee employee) throws Exception;

	Employee findEmployee(int empId) throws Exception;

	List<Employee> findAllEmployees() throws Exception;

}
