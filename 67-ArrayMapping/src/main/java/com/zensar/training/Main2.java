package com.zensar.training;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.zensar.training.bean.Product;
import com.zensar.training.bean.Student;
import com.zensar.training.util.HibernateUtil;

public class Main2 {
	
	public static void main(String[] args) {

		insertTesting();
		// loadTesting(2);

		// loadAllTesting();

		// updateTesting(1);
		// deleteTesting(2);

	}
	private static void insertTesting() {
		Product product=new Product();
		product.setId(105);
		product.setName("airpods");
		product.setDiscount(0, 50);
		product.setDiscount(1, 25);
		product.setDiscount(2, 10);
		product.setDiscount(3, 5);

		HibernateUtil.init();
		Session session = HibernateUtil.getSession();
		Transaction transaction = session.beginTransaction();

		Integer genId = (Integer) session.save(product);

		transaction.commit();

		System.out.println("Product Object Saved with ID " );
	}

}
