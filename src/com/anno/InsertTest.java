package com.anno;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class InsertTest {

		public static void main(String[] args) {
	        Configuration configuration = new Configuration();
	        configuration.configure("hibernate.cfg.xml");
	        SessionFactory factory = configuration.buildSessionFactory();
	        Session session = factory.openSession();
	        Product p = new Product();
	        p.setProductId(102);
	        p.setProductName("Ramu");
	        p.setProductPrice(9089);
	        Transaction tx = session.beginTransaction();

	        session.save(p);
	        System.out.println("Sucessfull created");
	        tx.commit();
	        session.close();
	        factory.close();

	    }
	}


