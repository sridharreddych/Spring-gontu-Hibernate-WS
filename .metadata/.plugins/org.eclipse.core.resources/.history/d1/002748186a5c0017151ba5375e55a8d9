package com.gontuseries.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		Student_Info student = new Student_Info();
		student.setName("Gontu3");
		student.setRollNo(3);
		student.setBirthDate(new Date());
		
		
		//creating configuration object  
		 Configuration cfg=new Configuration();  
		 cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  

		//creating seession factory object  
		SessionFactory factory=cfg.buildSessionFactory();  
		     
		 //creating session object  
		Session session=factory.openSession();  
		  //creating transaction object  
		Transaction tx =session.beginTransaction();
		session.save(student);
		
		session.getTransaction().commit();
		session.close();
		factory.close();
	    
		System.out.println("successfully saved");  
		
 
	

		         

		
	}
}
