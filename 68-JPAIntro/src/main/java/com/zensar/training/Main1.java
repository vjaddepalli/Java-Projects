package com.zensar.training;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.zensar.training.bean.Contact;
import com.zensar.training.util.JPAUtil;

public class Main1 {

	static void insert() {
		EntityManager em = JPAUtil.createEntityManager("JPAIntro");

		Contact contact = new Contact();
		contact.setName("Ram");
		contact.setEmail("ram@email.com");

		em.getTransaction().begin();
		em.persist(contact);
		em.getTransaction().commit();

		JPAUtil.shutDown();

		System.out.println("Record Stored...");
	}

	static void load() {
		EntityManager em = JPAUtil.createEntityManager("JPAIntro");
		Contact contact = em.find(Contact.class, 2);
		JPAUtil.shutDown();
		System.out.println(contact);
	}

	static void update() {

		EntityManager em = JPAUtil.createEntityManager("JPAIntro");
		Contact contact = em.find(Contact.class, 2);
		contact.setName(contact.getName().toUpperCase());
		em.getTransaction().begin();
		em.merge(contact);
		em.getTransaction().commit();
		JPAUtil.shutDown();
		System.out.println("Record Updated...");

	}

	static void delete() {

		EntityManager em = JPAUtil.createEntityManager("JPAIntro");
		Contact contact = em.find(Contact.class, 1);
		// contact.setName(contact.getName().toUpperCase());
		em.getTransaction().begin();
		em.remove(contact);
		em.getTransaction().commit();
		JPAUtil.shutDown();
		System.out.println("Record Deleted...");

	}

	public static void main(String[] args) {

		// insert();
		// load();
		// update();

		delete();
	}

}
