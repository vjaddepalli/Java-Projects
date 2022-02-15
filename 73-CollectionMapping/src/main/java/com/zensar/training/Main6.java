package com.zensar.training;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.zensar.training.bean.pack6.Customer;
import com.zensar.training.bean.pack6.CustomerRating;
import com.zensar.training.util.HibernateUtil;



public class Main6 {

	private static void insertTesting() {
		
		CustomerRating customerRating=new CustomerRating("Ram");
		
		
		Map<String, Customer> customerMap=new HashMap<>();
		customerMap.put("BEST", new Customer("Apollo Pharmacy", "Mumbai", 3000.00));
		customerMap.put("GOOD", new Customer("XYZ Medicals", "Chennai", 2000.00));
		customerMap.put("OK", new Customer("Health & Glow", "Bangalore", 4000.00));
		
		customerRating.setCustomerRating(customerMap);
		
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		
		Transaction tx=session.beginTransaction();
		session.save(customerRating);
		tx.commit();
		HibernateUtil.cleanUp();
		System.out.println("Recocrd Saved....");
		
	}

	private static void loadTesting() {
		
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		
		CustomerRating cr=session.load(CustomerRating.class, 1);
		System.out.println(cr);
		HibernateUtil.cleanUp();


	}

	private static void editTesting() {
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
		CustomerRating cr=session.load(CustomerRating.class, 1);
		cr.setRatedBy(cr.getRatedBy().toUpperCase());
		session.update(cr);
		tx.commit();
		HibernateUtil.cleanUp();
		System.out.println("Record Updated");

	}

	private static void deleteTesting() {
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
		CustomerRating cr=session.load(CustomerRating.class, 1);
		session.delete(cr);
		tx.commit();
		HibernateUtil.cleanUp();
		System.out.println("Record Deleted");

	}

	private static void loadAllTesting() {

		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		String str="from CustomerRating";
		Query query=session.createQuery(str);
		List<CustomerRating> customerRatings=query.list();
		System.out.println(customerRatings);
		HibernateUtil.cleanUp();
		
	}

	public static void main(String[] args) {
		insertTesting();

	}

}
