package com.p;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("database1");
		EntityManager em =emf.createEntityManager();
		em.getTransaction().begin();
		
		Student s=new Student("Name",00000000,"Email@1234");
		Student s1=new Student("1Name",100000000,"1Email@1234");
		Student s2=new Student("2Name",200000000,"2Email@1234");
		Student s3=new Student("3Name",300000000,"3Email@1234");
		Student s4=new Student("4Name",400000000,"4Email@1234");
		Student s5=new Student("5Name",500000000,"5Email@1234");
		
		em.persist(s);
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);
		em.persist(s4);
		em.persist(s5);
		em.getTransaction().commit();
		em.close();

	}

}

