package com.gontuseries.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		Student student = null;
		//creating configuration object  
		 Configuration cfg=new Configuration();  
		 cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  

		//creating seession factory object  
		SessionFactory factory=cfg.buildSessionFactory();  
		     
		 //creating session object  
		Session session1 =factory.openSession();  
		  //creating transaction object  
	
	session1.beginTransaction();
		
	student = (Student) session1.get(Student.class, 1);
	
	System.out.println("Student object retrieved: name = "+student.getStudent_name());

	student.setStudent_name("modifying student name in the persistent state");

	session1.getTransaction().commit();
	session1.close();
	
	student.setStudent_name("modifying student name in the detached state");
	
	
	Session session2 = factory.openSession();
	session2.beginTransaction();

	session2.update(student);

	session2.getTransaction().commit();
	session2.close();
	
	factory.close();
}
}