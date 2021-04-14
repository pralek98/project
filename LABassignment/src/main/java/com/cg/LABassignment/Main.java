package com.cg.LABassignment;



import com.util.Utility.*;
import com.util.Utility.EntityManagerHelper;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;


public class Main {
	
	public static void createUsingJPA()
	{
		EntityManager em=EntityManagerHelper.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Author1 a =new  Author1(1,"pralek","mudhiraj","nagarapu",1234568912);
		em.persist(a); //Managed state
		tx.commit();
		em.close();
	}
	public static void retriveUsingJPA()
	{
		EntityManager em = EntityManagerHelper.getEntityManager();
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		Author1 a = em.find(Author1.class, 1);
		System.out.println("FirstName= "+a.getFirstName());
		System.out.println("MiddleName= "+a.getMiddleName());
		System.out.println("LastName= "+a.getLastName());
		System.out.println("Phonenumber= "+a.getPhoneno());
		
	}
	public static void updateUsingJPA() {
		  EntityManager em=EntityManagerHelper.getEntityManager();
		  EntityTransaction tx = em.getTransaction();
		  tx.begin();
	      Author1 a = em.find(Author1.class,1); //managed or persistent state
          a.setPhoneno(987654321);
	      em.merge(a);
          tx.commit();
          em.close();
	}
	public static void deleteUsingJPA() {
		EntityManager em=EntityManagerHelper.getEntityManager();
	  EntityTransaction tx = em.getTransaction();
	  tx.begin();
      Author1 u2= em.find(Author1.class, 1);
      em.remove(u2); //Removed state
      tx.commit();
      em.close();
	}
	
	
	public static void main(String[] args) {
		createUsingJPA();
		updateUsingJPA();
		retriveUsingJPA();
		
		EntityManagerHelper.closeFactor();

	}

}