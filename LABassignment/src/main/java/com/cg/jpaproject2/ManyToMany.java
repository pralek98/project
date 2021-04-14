package com.cg.jpaproject2;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.util.Utility.EntityManagerHelper;

public class ManyToMany {
  public static void main(String[] args) {
	  EntityManager em = EntityManagerHelper.getEntityManager();
      EntityTransaction tx = em.getTransaction();
      tx.begin();
	Author a1= new Author();
	a1.setFname("Pralek");

	Author a2= new Author();
	a2.setFname("Vinay");

	Author a3 = new Author();
	a3.setFname("Vamshi");

	em.persist(a1);
	em.persist(a2);
	em.persist(a3);
	
	List<Author> list1=new ArrayList<Author>();
	list1.add(a1);
	list1.add(a2);
	
	List<Author> list2=new ArrayList<Author>();
	list2.add(a2);
	list2.add(a3);
	
	Book b1 = new Book();
	b1.setIsbn(1234567890);
	b1.setBookname("The Secret");
	b1.setPrice(2022.3);
	b1.setAuthorlist(list1);
	
	Book b2 = new Book();
	b2.setIsbn(12113890);
	b2.setBookname("The Invisible");
	b2.setPrice(2000.3);
	b2.setAuthorlist(list2);
	
	em.persist(b1);
    em.persist(b2);
    tx.commit();
    em.close();
    EntityManagerHelper.closeFactor();
	
	
}
}
