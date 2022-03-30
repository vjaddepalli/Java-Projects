package com.zensar.training.service;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.zensar.training.bean.Employee;

public interface EmployeeService {

	boolean addEmployee(JdbcTemplate jdbcTemplate, Employee employee) throws Exception;

	boolean updateEmployee(JdbcTemplate jdbcTemplate, Employee employee) throws Exception;

	boolean deleteEmployee(JdbcTemplate jdbcTemplate, Employee employee) throws Exception;

	Employee findEmployee(JdbcTemplate jdbcTemplate, int empId) throws Exception;

	List<Employee> findAllEmployees(JdbcTemplate jdbcTemplate) throws Exception;

}
