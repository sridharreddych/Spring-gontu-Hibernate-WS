package com.gontuseries.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
			
		StudentAddress studentAddress = new StudentAddress();
		studentAddress.setAddress_detail("Hyderabad,India");
		
		Student student1 = new Student();
		student1.setStudent_name("Gontu1");
		student1.setStudentAddress(studentAddress);
		
		Student student2 = new Student();
		student2.setStudent_name("Gontu2");
		student2.setStudentAddress(studentAddress);
		
		
		(studentAddress.getStudents()).add(student1); // here i changed
		(studentAddress.getStudents()).add(student2);// here i changed
		
		
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
		session.save(studentAddress);  // here i changed
		
		
		session.getTransaction().commit();
		
		session.close();
		factory.close();
	    
		System.out.println("successfully saved");  
		
 
	

		         

		
	}
}
