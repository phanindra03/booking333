package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.entity.Customer;
import com.cg.entity.Hotel;

@Repository
public class HotelRepositoryImpl implements IHotelRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public List<Hotel> loadAll() {
		
		TypedQuery<Hotel> query = entityManager.createQuery("SELECT h FROM Hotel h ", Hotel.class);
		return query.getResultList();
	}


	@Override
	public Customer save(Customer customer) {
		entityManager.persist(customer);
		entityManager.flush();
		return customer;
	}


	@Override
	public List<Customer> loadAl() {
		TypedQuery<Customer>query=entityManager.createQuery("SELECT e FROM Customer e",Customer.class);
		return query.getResultList();
	}

}
