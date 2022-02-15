package com.zensar.training;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.zensar.training.bean.Address;
import com.zensar.training.bean.Employee;
import com.zensar.training.util.HibernateUtil;

public class App {
	static void insert() {
		Address address=new Address("2-859", "Dwaraka Nagar", "Rajahmundry");
		Employee employee=new Employee("Siva", 15000, address);
		HibernateUtil.init();
		
		Session session=HibernateUtil.getSession();
		Transaction txn=session.beginTransaction();
		session.save(employee);
		txn.commit();
		HibernateUtil.cleanUp();
		System.out.println("Record Inserted in DB");
	}static void read() {
		
		HibernateUtil.init();

		Session session = HibernateUtil.getSession();

		Employee employee= session.load(Employee.class, 1);
		System.out.println(employee);
		session.close();
		HibernateUtil.cleanUp();
		
	}
	
	static void readAll() {
		
		HibernateUtil.init();

		Session session = HibernateUtil.getSession();

		String str = "from Employee";

		Query query = session.createQuery(str);
		List<Employee> allEmployees = query.list();
		System.out.println(allEmployees);
		HibernateUtil.cleanUp();
		
	}
	
	static void update() {
		HibernateUtil.init();

		Session session = HibernateUtil.getSession();

		Employee employee = session.load(Employee.class, 3);
		employee.setName(employee.getName().toUpperCase());
		employee.setBasicSalary(5000);

		Transaction txn = session.beginTransaction();

		session.update(employee);
		txn.commit();
		HibernateUtil.cleanUp();
		System.out.println("Record Updated in DB");
		
	}
	
	static void delete() {
		
		HibernateUtil.init();

		Session session = HibernateUtil.getSession();
		Employee employee = session.load(Employee.class, 3);

		Transaction txn = session.beginTransaction();
		session.delete(employee);
		txn.commit();
		HibernateUtil.cleanUp();
		System.out.println("Record deleted in DB");
		
	}
	
  public static void main(String[] args) {
    insert();
	  //read();
	 // readAll();
	 // delete();
  }
}
