package com.zensar.training;

import java.util.Date;

import javax.persistence.EntityManager;

import com.zensar.training.bean.pack3.CarLoan;
import com.zensar.training.bean.pack3.HomeLoan;
import com.zensar.training.bean.pack3.Loan;
import com.zensar.training.util.JPAUtil;

public class Main3 {
	
	static void insert() {
		Loan loan=new Loan();
		//loan.setLoanId(103);
		loan.setCustomerName("Alien");
		loan.setLoanAmt(10000.0);
		loan.setLoanDate(new Date());
		
		
		CarLoan carLoan=new CarLoan();
		//carLoan.setLoanId(104);
		carLoan.setCustomerName("Brad");
		carLoan.setLoanAmt(25000.0);
		carLoan.setLoanDate(new Date());
		carLoan.setCarDetails("AP-31-EW9999");
		carLoan.setRegisteredState("Andhra Pradesh");
		
		HomeLoan homeLoan=new HomeLoan();
		//homeLoan.setLoanId(105);
		homeLoan.setCustomerName("David");
		homeLoan.setLoanAmt(50000.0);
		homeLoan.setLoanDate(new Date());
		homeLoan.setHomeAddress("F5,KPHB,Hyderabad");
		homeLoan.setOwnedBy("David");
		
		EntityManager em=JPAUtil.createEntityManager("PU");
		em.getTransaction().begin();
		em.persist(loan);
		em.persist(carLoan);
		em.persist(homeLoan);
		em.getTransaction().commit();
		JPAUtil.shutDown();
		
		System.out.println("Record stored...");
	}

	public static void main(String[] args) {
		
		insert();
	}

}
