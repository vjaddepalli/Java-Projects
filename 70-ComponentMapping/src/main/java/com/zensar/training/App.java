package com.zensar.training;

import java.time.LocalDate;

import javax.persistence.EntityManager;

import com.zensar.training.bean.Address;
import com.zensar.training.bean.Employee;
import com.zensar.training.util.JPAUtil;

public class App {
	
	static void insert() {
		EntityManager em=JPAUtil.createEntityManager("PU");
		
		Address address=new Address("F-5","KPHB Colony","Hyderabad");
		
		Employee employee=new Employee("Vijay",'A',20000.0,LocalDate.of(2022, 4, 1),address);
		
		em.getTransaction().begin();
		em.persist(employee);
		em.getTransaction().commit();
		JPAUtil.shutDown();
		System.out.println("Record Saved...");
		
	}
	
	static void read() {
		
		EntityManager em=JPAUtil.createEntityManager("PU");
		
		Employee employee=em.find(Employee.class, 6);
		JPAUtil.shutDown();
		System.out.println(employee);
		
	}
	
  public static void main(String[] args) {
    
	  //insert();
	  read();
  }
}
