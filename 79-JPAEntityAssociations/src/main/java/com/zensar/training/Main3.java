package com.zensar.training;

import java.time.LocalDate;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.zensar.training.bean.pack3.ContactInfo;
import com.zensar.training.bean.pack3.Person;

import com.zensar.training.util.JPAUtil;

public class Main3 {
	static void test1() {
		Person person=new Person(102, "Ram", LocalDate.of(1998, 2, 20), 'M', null);
		
		ContactInfo contactInfo=new ContactInfo("ram@gmail.com", "9764737538", null);
		person.setContactInfo(contactInfo);
		contactInfo.setPerson(person);
		
		EntityManager em=JPAUtil.createEntityManager("PU");
		em.getTransaction().begin();
		em.persist(person);
		em.getTransaction().commit();
		JPAUtil.shutDown();
		System.out.println("Record Saved..");
		
	}
	
	static void test2() {
		Person person=new Person(103,"Jeya", LocalDate.of(2002, 2, 12), 'F', null);
		
		EntityManager em=JPAUtil.createEntityManager("PU");
		em.getTransaction().begin();
		em.persist(person);
		em.getTransaction().commit();
		JPAUtil.shutDown();
		
	}
	
	static void test3() {
		ContactInfo contactInfo=new ContactInfo("Jeya2001@gmail.com", "8765819103", null);
		
		EntityManager em=JPAUtil.createEntityManager("PU");
		Person person=em.find(Person.class, 103);
		person.setContactInfo(contactInfo);
		contactInfo.setPerson(person);
		em.getTransaction().begin();
		em.persist(contactInfo);
		em.getTransaction().commit();
		JPAUtil.shutDown();
		System.out.println("Success...");
		
	}
	

	static void test4() {
		
		EntityManager em=JPAUtil.createEntityManager("PU");
		ContactInfo contactInfo=em.find(ContactInfo.class, 102);
		System.out.println(contactInfo);
		System.out.println(contactInfo.getPerson());
		JPAUtil.shutDown();
	
		
	}
	
	static void test5() {
		EntityManager em=JPAUtil.createEntityManager("PU");
		Person person=em.find(Person.class, 102);
		System.out.println(person);
		System.out.println(person.getContactInfo());
		JPAUtil.shutDown();
		
		
	}
	
	
	static void test6() {
		
		
		EntityManager em=JPAUtil.createEntityManager("PU");
		Person person=em.find(Person.class, 103);
		
		
		em.getTransaction().begin();
		em.remove(person);
		em.getTransaction().commit();
		
		System.out.println("removed ...");
		
		
		
	}
	
	


	public static void main(String[] args) {
		test6();

	}

}
