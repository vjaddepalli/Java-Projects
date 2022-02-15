package com.zensar.training;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.zensar.training.bean.Developer;
import com.zensar.training.util.JPAUtil;

public class Main3 {
	
	static void insertTest() {
		Developer developer=new Developer();
		developer.setName("Vijay");
		developer.setCity("Hyderabad");
		developer.addSkill("JAVA");
		developer.addSkill("Spring Boot");
		developer.addSkill("MYSQL");
		developer.addSkill("Micro Services");
		developer.addSkill("Angular");
		
		EntityManager em=JPAUtil.createEntityManager("PU");
		
		em.getTransaction().begin();
		em.persist(developer);
		em.getTransaction().commit();
		
		JPAUtil.shutDown();
		
		System.out.println("Record stored...");
		
	}
	
	public static void main(String[] args) {
	
		insertTest();
		
	}

}
