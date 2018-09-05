package com;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class QueryDemo {

	public static void main(String[] args) {
		
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory sessionFac=config.buildSessionFactory();
		Session session=sessionFac.openSession();
		Query query=session.createQuery("from Product");	
		
		

	}

}
