package com.zensar.training;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

import com.zensar.training.bean.Contact;
import com.zensar.training.util.HibernateUtil;

public class Main1 {

	static void insert() {

		Contact contact = new Contact("john", 23, "9876543210");

		HibernateUtil.intit();

		Session session = HibernateUtil.getSession();
		Transaction txn = session.beginTransaction();
		session.save(contact); // object store into table
		txn.commit();
		HibernateUtil.cleanUp();
		System.out.println("Customer saved to DB");
	}

	static void read() {
		HibernateUtil.intit();

		Session session = HibernateUtil.getSession();

		Contact contact = session.load(Contact.class, 1);
		System.out.println(contact);
		session.close();
		HibernateUtil.cleanUp();

	}

	static void readAll() {
		HibernateUtil.intit();

		Session session = HibernateUtil.getSession();

		String str = "from Contact";

		Query query = session.createQuery(str);
		List<Contact> allContacts = query.list();
		System.out.println(allContacts);
		HibernateUtil.cleanUp();

	}

	static void update() {
		HibernateUtil.intit();

		Session session = HibernateUtil.getSession();

		Contact contact = session.load(Contact.class, 3);
		contact.setName(contact.getName().toUpperCase());
		contact.setAge(50);

		Transaction txn = session.beginTransaction();

		session.update(contact);
		txn.commit();
		HibernateUtil.cleanUp();
		System.out.println("Record Updated in DB");

	}

	static void delete() {
		HibernateUtil.intit();

		Session session = HibernateUtil.getSession();

		Contact contact = session.load(Contact.class, 3);

		Transaction txn = session.beginTransaction();
		session.delete(contact);
		txn.commit();
		HibernateUtil.cleanUp();
		System.out.println("Record deleted in DB");

	}

	public static void main(String[] args) {

		// insert();
		// read();
		// readAll();
		// update();
		delete();

	}

}
