package com.zensar.training;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.zensar.training.bean.pack4.TeamMember;
import com.zensar.training.util.HibernateUtil;

public class Main4 {

	private static void insertTesting() {

		TeamMember teamMember = new TeamMember("Vijay");

		Map<String, Integer> skillMap = new TreeMap<>();
		skillMap.put("React", 8);
		skillMap.put("Java", 6);

		teamMember.setSkillDetails(skillMap);

		HibernateUtil.init();
		Session session = HibernateUtil.getSession();

		Transaction tx = session.beginTransaction();
		session.save(teamMember);
		tx.commit();
		HibernateUtil.cleanUp();
		System.out.println("\t Record Saved...");

	}

	private static void loadTesting() {

		HibernateUtil.init();
		Session session = HibernateUtil.getSession();

		TeamMember teamMember = session.load(TeamMember.class, 1);
		System.out.println(teamMember);
		HibernateUtil.cleanUp();

	}

	private static void editTesting() {
		HibernateUtil.init();
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		TeamMember teamMember = session.load(TeamMember.class, 1);
		teamMember.setMemberName(teamMember.getMemberName().toUpperCase());
		session.update(teamMember);
		tx.commit();
		HibernateUtil.cleanUp();
		System.out.println("Record Updated");

	}

	private static void deleteTesting() {
		HibernateUtil.init();
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		TeamMember teamMember = session.load(TeamMember.class, 1);
		session.delete(teamMember);
		tx.commit();
		HibernateUtil.cleanUp();
		System.out.println("Record Deleted");

	}

	private static void loadAllTesting() {

		HibernateUtil.init();
		Session session = HibernateUtil.getSession();
		String str = "from TeamMember";
		Query query = session.createQuery(str);
		List<TeamMember> teamMembers = query.list();
		System.out.println(teamMembers);
		HibernateUtil.cleanUp();
	}

	public static void main(String[] args) {
		insertTesting();

	}

}
