package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.dao.IHotelRepository;

import com.cg.entity.Customer;
import com.cg.entity.Hotel;

@Service
@Transactional
public class HotelServiceImpl implements IHotelService{

	@Autowired
	private IHotelRepository hotelRepository;
	
	@Override
	public List<Hotel> loadAll() {
		
		return hotelRepository.loadAll();
	}

	@Override
	public Customer save(Customer customer) {
		
		return hotelRepository.save(customer);
	}

	@Override
	public List<Customer> loadAl() {
		
		return hotelRepository.loadAl();
	}

}
