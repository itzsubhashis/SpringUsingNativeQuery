package com.example.practice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.practice.entity.Customer;
import com.example.practice.entity.Order;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@RestController
public class Controller {
	@PersistenceContext
	EntityManager em;

	@GetMapping("/get-customers")
	public List<Customer> getAllCustomer() {
		Query query = em.createNativeQuery("SELECT * from customers", Customer.class);
		List<Customer> customerList = query.getResultList();
		return customerList;
	}
	
	@GetMapping("/get-order-by-customer-id")
	public List<Order> getCustomerWithAddress(@RequestParam int customerId, @RequestParam int productId) {
		String jpql = "SELECT o FROM Order o JOIN o.customer c JOIN o.product p WHERE"
				+ " c.id = :customerId AND p.id = :productId";
		Query query = em.createQuery(jpql, Order.class);
		query.setParameter("customerId", customerId);
		query.setParameter("productId", productId);
		return query.getResultList();
	}
	

}
