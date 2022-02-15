package com.zensar.training;

import java.time.LocalDate;

import javax.persistence.EntityManager;

import com.zensar.training.bean.Employee;
import com.zensar.training.util.JPAUtil;

public class Main {

	static void insert() {

		EntityManager em = JPAUtil.createEntityManager("Employee");

		Employee emp = new Employee();
		emp.setName("Bhim");
		emp.setGrade('C');
		emp.setBasicSalary(3000.0);
		emp.setDateOfJoining(LocalDate.of(2020, 4, 1));

		em.getTransaction().begin();
		em.persist(emp);
		em.getTransaction().commit();

		JPAUtil.shutDown();
		System.out.println("Record Stored");
	}

	static void load() {

		EntityManager em = JPAUtil.createEntityManager("Employee");
		Employee emp = em.find(Employee.class, 5);
		JPAUtil.shutDown();
		System.out.println(emp);
	}

	static void updtae() {
		EntityManager em = JPAUtil.createEntityManager("Employee");
		Employee emp = em.find(Employee.class, 5);
		emp.setGrade('G');
		em.getTransaction().begin();
		em.merge(emp);
		em.getTransaction().commit();
		JPAUtil.shutDown();
		System.out.println("Record Updated");

	}

	static void delete() {

		EntityManager em = JPAUtil.createEntityManager("Employee");
		Employee emp = em.find(Employee.class, 5);
		em.getTransaction().begin();
		em.remove(emp);
		em.getTransaction().commit();
		JPAUtil.shutDown();
		System.out.println("Record Deleted");

	}

	public static void main(String[] args) {
		// insert();
		// load();
		updtae();
	}

}
