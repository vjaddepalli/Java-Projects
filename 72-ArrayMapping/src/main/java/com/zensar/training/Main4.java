package com.zensar.training;

import java.time.LocalDate;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.zensar.training.bean.Bill;
import com.zensar.training.bean.BillItem;
import com.zensar.training.util.JPAUtil;


public class Main4 {

	public static void main(String[] args) {
		Bill bill = new Bill();
		bill.setCustomerName("Vijay");
		bill.setBillDate(LocalDate.of(2021, 8, 12));

		BillItem billItem = new BillItem();
		billItem.setProductName("Books");
		billItem.setPrice(20.0);
		billItem.setQuantity(2);

		BillItem billItem2 = new BillItem();
		billItem2.setProductName("Pens");
		billItem2.setPrice(30.0);
		billItem2.setQuantity(3);

		BillItem billItem3 = new BillItem();
		billItem3.setProductName("Erasers");
		billItem3.setPrice(50.0);
		billItem3.setQuantity(10);

		bill.addBillItem(billItem);
		bill.addBillItem(billItem2);
		bill.addBillItem(billItem3);

		EntityManager em=JPAUtil.createEntityManager("PU");
		em.getTransaction().begin();
		em.persist(bill);
		em.getTransaction().commit();
		
		JPAUtil.shutDown();

		

	}

}
