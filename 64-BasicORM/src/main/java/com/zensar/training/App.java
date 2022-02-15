package com.zensar.training;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.boot.jaxb.internal.stax.LocalSchema;

import com.zensar.training.bean.Employee;
import com.zensar.training.bean.Gender;
import com.zensar.training.util.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App {
	
	static void insert() {
		Employee employee=new Employee("Vijay", LocalDate.of(1996, 6, 26), 4000, Gender.MALE);
		HibernateUtil.intit();
		
		Session session=HibernateUtil.getSession();
		Transaction txn=session.beginTransaction();
		session.save(employee);
		txn.commit();
		HibernateUtil.cleanUp();
		System.out.println("Record Inserted in DB");
	}
	
	static void read() {
		
		HibernateUtil.intit();

		Session session = HibernateUtil.getSession();

		Employee employee= session.load(Employee.class, 1);
		System.out.println(employee);
		session.close();
		HibernateUtil.cleanUp();
		
	}
	
	static void readAll() {
		
		HibernateUtil.intit();

		Session session = HibernateUtil.getSession();

		String str = "from Employee";

		Query query = session.createQuery(str);
		List<Employee> allEmployees = query.list();
		System.out.println(allEmployees);
		HibernateUtil.cleanUp();
		
	}
	
	static void update() {
		HibernateUtil.intit();

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
		
		HibernateUtil.intit();

		Session session = HibernateUtil.getSession();
		Employee employee = session.load(Employee.class, 3);

		Transaction txn = session.beginTransaction();
		session.delete(employee);
		txn.commit();
		HibernateUtil.cleanUp();
		System.out.println("Record deleted in DB");
		
	}
	
	public static void main(String[] args) {
		//insert();
		//read();
		//readAll();
		delete();
		
	}

}
