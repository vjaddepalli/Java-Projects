package com.zensar.training;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.zensar.training.bean.Developer;
import com.zensar.training.util.HibernateUtil;

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
		
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		
		Transaction txn=session.beginTransaction();
		session.save(developer);
		txn.commit();
		
		HibernateUtil.cleanUp();
	}
	
	public static void main(String[] args) {
	
		insertTest();
		
	}

}
