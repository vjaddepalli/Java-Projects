package com.zensar.training;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.zensar.training.bean.pack5.IPLTeam;
import com.zensar.training.bean.pack5.Player;
import com.zensar.training.util.HibernateUtil;

public class Main5 {

	private static void insertTesting() {

		IPLTeam iplTeam = new IPLTeam("Mumbai Indians ", "Mumbai", null);
		Player player1 = new Player("Rohit Sharma", "Captain", 34);
		Player player2 = new Player("Hardik Pandya", "All rounder", 26);
		Set<Player> players = new HashSet<>();
		players.add(player1);
		players.add(player2);
		iplTeam.setPlayers(players);

		HibernateUtil.init();
		Session session = HibernateUtil.getSession();

		Transaction tx = session.beginTransaction();
		session.save(iplTeam);
		tx.commit();
		HibernateUtil.cleanUp();
		System.out.println("\t Record Saved...");

	}

	private static void loadTesting() {

		HibernateUtil.init();
		Session session = HibernateUtil.getSession();

		IPLTeam iplTeam = session.load(IPLTeam.class, 2);
		System.out.println(iplTeam);
		HibernateUtil.cleanUp();

	}

	private static void editTesting() {
		HibernateUtil.init();
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		IPLTeam iplTeam = session.load(IPLTeam.class, 2);
		iplTeam.setName(iplTeam.getName().toUpperCase());
		session.update(iplTeam);
		tx.commit();
		HibernateUtil.cleanUp();
		System.out.println("\t Record Updated");

	}

	private static void deleteTesting() {
		HibernateUtil.init();
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		IPLTeam iplTeam = session.load(IPLTeam.class, 2);
		session.delete(iplTeam);
		tx.commit();
		HibernateUtil.cleanUp();
		System.out.println("\t Record Deleted");

	}

	private static void loadAllTesting() {

		HibernateUtil.init();
		Session session = HibernateUtil.getSession();
		String str = "from IPLTeam";
		Query query = session.createQuery(str);
		List<IPLTeam> iplTeams = query.list();
		System.out.println(iplTeams);
		HibernateUtil.cleanUp();
	}

	public static void main(String[] args) {
		insertTesting();

	}

}
