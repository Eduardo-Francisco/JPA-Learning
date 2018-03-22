package br.com.eduardo.jpalearning.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Dao {
	
	private EntityManagerFactory factory;
	private EntityManager entityManager;
	private EntityTransaction transaction;
	
	public Dao() {
		this.factory = Persistence.createEntityManagerFactory("JPA-Learning");
		this.entityManager = factory.createEntityManager();
		this.transaction = entityManager.getTransaction();
	}
	
	public void insere(Object object) {
		this.transaction.begin();
		this.entityManager.persist(object);
		this.transaction.commit();
	}
	
	public void fecha() {
		this.entityManager.close();
		this.factory.close();
	}
	
}
