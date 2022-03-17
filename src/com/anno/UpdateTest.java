package com.anno;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateTest {
	public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();
        Object o=session.load(Product.class, new Integer(101));
        Product p = (Product)o;
        Transaction tx = session.beginTransaction();
        p.setProductName("sam");
        p.setProductPrice(8080);
        session.save(p);
        tx.commit();
        System.out.println("Sucessfull Updated");
        session.close();
        factory.close();

    }
}
