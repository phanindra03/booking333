package com.cg.dao;

import java.util.List;

import com.cg.entity.Customer;
import com.cg.entity.Hotel;

public interface IHotelRepository {

	public abstract List<Hotel> loadAll();
	public abstract Customer save(Customer customer);
	public abstract List<Customer> loadAl();
}
