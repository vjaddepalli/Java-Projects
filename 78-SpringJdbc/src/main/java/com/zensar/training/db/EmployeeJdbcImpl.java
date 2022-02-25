package com.zensar.training.db;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.zensar.training.bean.Employee;
import com.zensar.training.bean.Gender;

public class EmployeeJdbcImpl implements EmployeeDAO {

	public boolean addEmployee(JdbcTemplate jdbcTemplate, Employee employee) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateEmployee(JdbcTemplate jdbcTemplate, Employee employee) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteEmployee(JdbcTemplate jdbcTemplate, Employee employee) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	public Employee findEmployee(JdbcTemplate jdbcTemplate, int empId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Employee> findAllEmployees(JdbcTemplate jdbcTemplate) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	

}
