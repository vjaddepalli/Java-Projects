package com.zensar.training.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import com.zensar.training.bean.Employee;
import com.zensar.training.db.DBConnectionFactory;
import com.zensar.training.db.EmployeeDAO;
import com.zensar.training.db.EmployeeJdbcImpl;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public boolean addEmployee(Employee employee) throws Exception {
		boolean result = false;
		Connection connection = DBConnectionFactory.createConnection();
		connection.setAutoCommit(false);//records are told to not store instantly
		EmployeeDAO dao = new EmployeeJdbcImpl();
		result = dao.addEmployee(connection, employee); //validate emp data cn be written here
		if(result==true) {
			connection.commit();
			return result;
		}else
			connection.rollback();
		return false;
	}

	@Override
	public boolean updateEmployee(Employee employee) throws Exception {
		boolean result = false;
		Connection connection = DBConnectionFactory.createConnection();
		EmployeeDAO dao = new EmployeeJdbcImpl();
		result = dao.updateEmployee(connection, employee);
		return result;
	}

	@Override
	public boolean deleteEmployee(Employee employee) throws Exception {
		boolean result = false;
		Connection connection = DBConnectionFactory.createConnection();
		EmployeeDAO dao = new EmployeeJdbcImpl();
		result = dao.deleteEmployee(connection, employee);
		return result;
	}

	@Override
	public Employee findEmployee(int empId) throws Exception {
		Connection connection = DBConnectionFactory.createConnection();
		EmployeeDAO dao = new EmployeeJdbcImpl();
		Employee employee=dao.findEmployee(connection, empId);
		return  employee;
	}

	@Override
	public List<Employee> findAllEmployees() throws Exception {
		Connection connection = DBConnectionFactory.createConnection();
		EmployeeDAO dao = new EmployeeJdbcImpl();
		return  dao.findAllEmployees(connection);
	}

}
