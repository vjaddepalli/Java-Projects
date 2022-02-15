package com.zensar.training;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.zensar.training.bean.pack4.ContactInfo;
import com.zensar.training.bean.pack4.Person;
import com.zensar.training.util.HibernateUtil;

public class Main4 {
	static void test1() {
		Person person=new Person(103, "John", LocalDate.of(1998, 2, 20), 'M', null);
		
		ContactInfo contactInfo=new ContactInfo("John@gmail.com", "9764736738");
		person.setContactInfo(contactInfo);
	
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
		session.save(person);
		tx.commit();
		
		HibernateUtil.cleanUp();
		System.out.println("\t Record Saved...");
		
	}
	
	static void test2() {
		ContactInfo contactInfo=new ContactInfo("Jeya2001@gmail.com", "8765819103");
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		
		Transaction tx=session.beginTransaction();
		session.save(contactInfo);
		tx.commit();
		HibernateUtil.cleanUp();
		System.out.println("Record Saved");
		
		
	}
	
	static void test3() {
		Person person=new Person(104,"Jeya", LocalDate.of(2002, 2, 12), 'F', null);
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		ContactInfo contactInfo=session.load(ContactInfo.class, 5);
		person.setContactInfo(contactInfo);
		Transaction tx=session.beginTransaction();
		session.save(person);
		tx.commit();
		HibernateUtil.cleanUp();
		System.out.println("Record Saved");
			
	}
	
	

	static void test4() {
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		
		ContactInfo contactInfo=session.load(ContactInfo.class, 5);
		System.out.println(contactInfo);
		HibernateUtil.cleanUp();
		
		
		
	}
	
	static void test5() {
		
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		
		Person person=session.load(Person.class, 103);
		System.out.println(person);
		System.out.println(person.getContactInfo());
		HibernateUtil.cleanUp();
		
		
	}
	
	
	static void test6() {
		
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		
		Person person=session.load(Person.class, 103);
		Transaction tx=session.beginTransaction();
		session.delete(person);
		tx.commit();
		HibernateUtil.cleanUp();
		System.out.println("Record Deleted");
		
	}
	

	public static void main(String[] args) {
		test6();

	}

}
