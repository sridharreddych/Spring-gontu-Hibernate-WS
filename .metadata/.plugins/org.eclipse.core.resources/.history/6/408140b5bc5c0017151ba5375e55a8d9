package com.gontuseries.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setStudent_name("Gontu1");
		
		//creating configuration object  
		 Configuration cfg=new Configuration();  
		 cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  

		//creating seession factory object  
		SessionFactory factory=cfg.buildSessionFactory();  
		     
		 //creating session object  
		Session session=factory.openSession();  
		  //creating transaction object  
	
		Transaction tx =session.beginTransaction();
		
		// please note I am not saving studentCertification object but still it will
		// be saved in a database that's the magic of Many to Many mapping
		
		student.setStudent_name("Gontu modified before save function");
		session.save(student);
		

		student.setStudent_name("Gontu modified after save function");
		
		session.getTransaction().commit();
		
		session.close();
		factory.close();
		
		student.setStudent_name("Gontu modified after SESSION CLOSED ");
	    
		System.out.println("successfully saved");  
		
 
	

		         

		
	}
}
