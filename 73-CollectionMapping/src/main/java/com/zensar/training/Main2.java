package com.zensar.training;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.zensar.training.bean.pack1.Product;
import com.zensar.training.bean.pack2.Country;
import com.zensar.training.util.HibernateUtil;

public class Main2 {

	private static void insertTesting() {

		Country country = new Country();
		country.setCountryName("USA");
		Set<String> cityNames = new TreeSet<String>();
		cityNames.add("NewYork");
		cityNames.add("Chicago");
		cityNames.add("State");

		country.setCityNames(cityNames);

		HibernateUtil.init();
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();

		session.save(country);
		tx.commit();
		HibernateUtil.cleanUp();

		System.out.println("\t\t !>>>>>>>>>>> Country Data Saved <<<<<<<<<<<<<<!");
	}

	private static void loadTesting() {

		HibernateUtil.init();
		Session session = HibernateUtil.getSession();
		
		Country country=session.load(Country.class, 1);
		System.out.println(country);
		HibernateUtil.cleanUp();
	}

	private static void editTesting() {
		HibernateUtil.init();
		Session session = HibernateUtil.getSession();

		Country country=session.load(Country.class, 1);
		country.setCountryName(country.getCountryName().toUpperCase());
		Transaction tx=session.beginTransaction();
		session.update(country);
		HibernateUtil.cleanUp();
		System.out.println(">>>>>>>>>>>--Record Updated--<<<<<<<<<<<<<<");

	}

	private static void deleteTesting() {
		HibernateUtil.init();
		Session session = HibernateUtil.getSession();

		Country country=session.load(Country.class, 1);
		Transaction tx=session.beginTransaction();
		session.delete(country);
		HibernateUtil.cleanUp();
		System.out.println(">>>>>>>>>>>--Record Deleted--<<<<<<<<<<<<<<");

	}

	private static void loadAllTesting() {
		HibernateUtil.init();
		Session session = HibernateUtil.getSession();

		String str = "from Country";

		Query query = session.createQuery(str);
		List<Country> allCountries = query.list();
		System.out.println(allCountries);

		HibernateUtil.cleanUp();

	}

	public static void main(String[] args) {
		//insertTesting();
		//loadTesting();
		//loadAllTesting();
		//editTesting();
		deleteTesting();

	}

}
