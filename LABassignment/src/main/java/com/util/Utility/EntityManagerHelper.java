package com.util.Utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerHelper {
    private static EntityManagerFactory factory=null;
    private EntityManager em=null;
    
    static
    {
    	factory=Persistence.createEntityManagerFactory("JPALab"); 
    }
    
    public static EntityManager getEntityManager()
    {
    	
    	EntityManager em = factory.createEntityManager();
		return em;
    }
    public static void closeFactor()
    {
    	factory.close();
    }
}
