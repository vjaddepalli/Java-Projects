package com.zensar.training;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.zensar.training.bean.pack3.Department;
import com.zensar.training.bean.pack3.Employee;
import com.zensar.training.bean.pack3.Gender;
import com.zensar.training.util.HibernateUtil;

public class Main3 {

	private static void insertTesting() {

		Department department = new Department(150, "Testing");
		department.addEmployee(new Employee("Rashmi", 'A', Gender.FEMALE));
		department.addEmployee(new Employee("Anitha", 'B', Gender.FEMALE));
		department.addEmployee(new Employee("Udhay", 'A', Gender.MALE));

		HibernateUtil.init();

		Session session = HibernateUtil.getSession();

		Transaction tx = session.beginTransaction();
		session.save(department);
		tx.commit();

		HibernateUtil.cleanUp();

		System.out.println("\t\t !>>>>>>>>>>> Department Saved <<<<<<<<<<<<<<!");
	}

	private static void loadTesting() {

		HibernateUtil.init();
		Session session = HibernateUtil.getSession();

		Department department = session.load(Department.class, 2);

		System.out.println(department);

		HibernateUtil.cleanUp();

	}

	private static void editTesting() {
		HibernateUtil.init();
		Session session = HibernateUtil.getSession();
		Department department = session.load(Department.class, 2);
		department.setDepartmentName(department.getDepartmentName().toUpperCase());
		Transaction tx = session.beginTransaction();
		session.update(department);
		tx.commit();
		HibernateUtil.cleanUp();
		System.out.println("\t Record Updated....");
	}

	private static void deleteTesting() {
		HibernateUtil.init();
		Session session = HibernateUtil.getSession();
		Department department = session.load(Department.class, 2);
		department.setDepartmentName(department.getDepartmentName().toUpperCase());
		Transaction tx = session.beginTransaction();
		session.update(department);
		tx.commit();
		HibernateUtil.cleanUp();
		System.out.println("\t Record Deleted....");
	}

	private static void loadAllTesting() {

		HibernateUtil.init();
		Session session = HibernateUtil.getSession();
		String str = "from Department";
		Query query = session.createQuery(str);
		List<Department> allDepartments = query.list();
		System.out.println(allDepartments);
		HibernateUtil.cleanUp();

	}

	public static void main(String[] args) {
		//insertTesting();
		//loadTesting();
		//loadAllTesting();
		//editTesting();
		deleteTesting();

	}

}
