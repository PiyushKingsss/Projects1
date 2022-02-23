package com.reddy.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.reddy.bean.Student;

public class MainClass {

	
	public static void main(String[] args) throws Exception {
		Student s1 = new Student();
		s1.setName("Rahul");
		s1.setRollNumber(3);
		s1.setPercentage(80);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(s1);
		
		session.getTransaction().commit();
		session.close();
		
		
	}
}
