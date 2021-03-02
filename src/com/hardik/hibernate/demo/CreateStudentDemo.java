package com.hardik.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hardik.hibernate.demo.entity.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {
		//create session factory
		
		SessionFactory factory = new Configuration()
								.configure()
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		//create session
		Session session = factory.getCurrentSession();
		
		try {
			//create a student object
			Student s2 = new  Student("pravin", "variya","prAVIN@gmail.com");
			
			
			//start a transaction
			session.beginTransaction();
			
			//save the student object
			session.save(s2);
			
			//commit transaction
			session.getTransaction().commit();
			
		}
		finally {
			factory.close();
		}
	}

}
