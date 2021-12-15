package com.aasifj.hyber;

import java.security.Provider.Service;

import javax.imageio.spi.ServiceRegistry;
import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.BootstrapServiceRegistryBuilder;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;





public class App 
{
    public static void main( String[] args )
    {
    	alianname na = new alianname();
    	na.setFname("aasif");
    	na.setMname("jaffer");
    	na.setLname("war");
    	aliann aasif = new aliann();
    	aasif.setAid(5);
    	aasif.setAname(na);
    	aasif.setColor("black");
    	//aasif.setLaptop1(null);
    	
    	
		/*
		 * laptop laptop1 = new laptop(); laptop1.setLid(1); laptop1.setLname("hp");
		 * 
		 * laptop l = new laptop();
		 */
       
        Configuration cfg = new Configuration().configure().addAnnotatedClass(aliann.class);
      //  cfg.configure("hibernate.cfg.xml");
        //ServiceRegistry registery = new BootstrapServiceRegistryBuilder().applySettings(Configuration.getProperties()).buildServiceResgiter();
       // ServiceRegistry registery = new BootstrapServiceRegistryBuilder().apply
       // StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
       SessionFactory factory = cfg.buildSessionFactory();
       Session session = factory.openSession();
       //Transaction tx = session.beginTransaction();
      // org.hibernate.Transaction tx = session.beginTransaction();
       //session.beginTransaction();
       //session.getTransaction().commit();
       org.hibernate.Transaction tx = session.beginTransaction();
       
      // org.hibernate.Transaction 
      // Transaction tx = (Transaction) session.beginTransaction();
       session.save(aasif);
     //session.save(laptop1);
       //aasif = session.get(aliann.class , 3);
       tx.commit();
       System.out.println(aasif);
      // System.out.println(laptop1);
       
      
    }
}
