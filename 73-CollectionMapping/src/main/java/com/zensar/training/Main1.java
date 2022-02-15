package com.zensar.training;

import java.util.LinkedList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.zensar.training.bean.pack1.Product;
import com.zensar.training.util.HibernateUtil;

public class Main1 {

	private static void insertTesting() {

		Product product = new Product(117, "One8");
		List<Double> plannedOfferPrices = new LinkedList<Double>();
		plannedOfferPrices.add(158.00);
		plannedOfferPrices.add(212.00);
		plannedOfferPrices.add(104.00);

		product.setPlannedOffersPrices(plannedOfferPrices);

		HibernateUtil.init();
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		session.save(product);
		tx.commit();
		session.close();
		HibernateUtil.cleanUp();

		System.out.println("\t\t !>>>>>>>>>>> Product Saved <<<<<<<<<<<<<<!");
	}

	private static void loadTesting() {

		HibernateUtil.init();
		Session session = HibernateUtil.getSession();
		
		Product product=session.load(Product.class, 1);
		System.out.println(product);
		session.close();
		HibernateUtil.cleanUp();

	}

	private static void editTesting() {
		HibernateUtil.init();
		Session session = HibernateUtil.getSession();
		
		Product product=session.load(Product.class, 2);
		product.setProductName(product.getProductName().toUpperCase());
		
		Transaction tx=session.beginTransaction();
		session.update(product);
		tx.commit();

		HibernateUtil.cleanUp();
		System.out.println("Record Updated in DB");

	}

	private static void deleteTesting() {
		HibernateUtil.init();
		Session session = HibernateUtil.getSession();
		Product product=session.load(Product.class, 2);
		Transaction tx=session.beginTransaction();
		session.delete(product);
		tx.commit();

		HibernateUtil.cleanUp();
		System.out.println("Record Deleted in DB");
	}

	private static void loadAllTesting() {

		HibernateUtil.init();
		Session session = HibernateUtil.getSession();
		
		String str = "from Product";

		Query query = session.createQuery(str);
		List<Product> allProducts = query.list();
		System.out.println(allProducts);

		HibernateUtil.cleanUp();

	}

	public static void main(String[] args) {
		//insertTesting();
		//loadTesting();
		loadAllTesting();

	}

}
