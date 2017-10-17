package com.wdcode.financeiro.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {
	
	private static EntityManagerFactory factory;
	
	static {
		factory = Persistence.createEntityManagerFactory("financeiro");
	}
	
	public static EntityManager getEntityManager() {
		return factory.createEntityManager();
	}
}
