package com.techjs;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.EmployeeEntity;

public class DemoHibernate 
{

	public static void main(String[] args) 
	{
		
		EmployeeEntity employee = new EmployeeEntity();
		employee.setEid(1002);
		employee.setEname("Sandy");
		employee.setEdept("CS");
		
		Configuration config = new Configuration().configure();
		config.addAnnotatedClass(EmployeeEntity.class);
		
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction ts = session.beginTransaction();
		session.save(employee);
		ts.commit();
		
        session.close();
        sf.close();
        
        System.out.println("Data Saved Successfully!");

	}

}
