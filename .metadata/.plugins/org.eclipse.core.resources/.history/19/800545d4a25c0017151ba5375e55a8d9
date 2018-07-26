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
		
	
		StudentDetail studentDetail = new StudentDetail();
		studentDetail.setStudent_mobile_number("99xxx4455");
		
		//this is an important step
		studentDetail.setStudent(student);
		
		
		//creating configuration object  
		 Configuration cfg=new Configuration();  
		 cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  

		//creating seession factory object  
		SessionFactory factory=cfg.buildSessionFactory();  
		     
		 //creating session object  
		Session session=factory.openSession();  
		  //creating transaction object  
	
		Transaction tx =session.beginTransaction();
		
		//Please note I am not saving student object but still it will be saved in database
		//thats the magic of one to one mapping
		session.save(studentDetail);
	
		
		session.getTransaction().commit();
		
		session.close();
		factory.close();
	    
		System.out.println("successfully saved");  
		
 
	

		         

		
	}
}
