package com.anno;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteTest {
	public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();
        Product s1 =new Product();
        s1.setProductId(102);
        Transaction tx = session.beginTransaction();
        session.delete(s1);
        tx.commit();
        System.out.println("Sucessfull deleted");
        session.close();
        factory.close();

    }

}
