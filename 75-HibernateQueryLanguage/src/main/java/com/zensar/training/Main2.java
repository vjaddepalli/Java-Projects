package com.zensar.training;

import java.util.Arrays;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.zensar.training.bean.Doctor;
import com.zensar.training.util.HibernateUtil;


public class Main2 {

	static void read1() {
		String str = "select d from Doctor d"; 
		
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		
		Query<Doctor> query=session.createQuery(str, Doctor.class);
		List<Doctor> doctors=query.getResultList();
		System.out.println(doctors);
		
		HibernateUtil.cleanUp();
	
	}
	
	static void read2() {
		
		String str="select d.name from Doctor d";
		
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		
		Query query=session.createQuery(str);
		List<String> names=query.getResultList();
		System.out.println(names);
		HibernateUtil.cleanUp();
		
	}
	
	static void read3() {
		
		String str="select d.name, d.fees from Doctor d";
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		Query query=session.createQuery(str);
		List<Object[]> details=query.getResultList();
		
		for(Object[] rowData:details) {
			System.out.println(rowData[0]+" , "+rowData[1]);
		}
		HibernateUtil.cleanUp();
	}
	
	
	
	static void read4() {
		
		String str="select d from Doctor d";
		
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		
		TypedQuery<Doctor> query;
		query=session.createQuery(str,Doctor.class);
		List<Doctor> doctors=query.getResultList();
		System.out.println(doctors);
		HibernateUtil.cleanUp();
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		read4();
	}

}
