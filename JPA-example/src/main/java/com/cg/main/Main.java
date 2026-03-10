package com.cg.main;
import java.time.LocalDate;

import com.cg.entity.Product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;


public class Main {
	public static void main(String[] args) {
   Product p = new Product(102, "Google Pixle 10", 175000, 10, LocalDate.of(2026, 1, 10));
   EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
   EntityManager em = emf.createEntityManager();
	EntityTransaction tx = em.getTransaction();
	tx.begin();
	em.persist(p);
	tx.commit();
	System.out.println("Product Created...");
	}
}