package com.cg.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
//@Table(name="customer")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	
	private String customerName;
	
	private Integer hotelId;
	
	private String toDate;
	
	private String fromDate;
	
	private Integer noOfRooms;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Integer getHotelId() {
		return hotelId;
	}
	public void setHotelId(Integer hotelId) {
		this.hotelId = hotelId;
	}
	public String getToDate() {
		return toDate;
	}
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	public String getFromDate() {
		return fromDate;
	}
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	public Integer getNoOfRooms() {
		return noOfRooms;
	}
	public void setNoOfRooms(Integer noOfRooms) {
		this.noOfRooms = noOfRooms;
	}
	/*public Customer(Integer id, String customerName, Integer hotelId, String toDate, String fromDate, Integer noOfRooms) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.hotelId = hotelId;
		this.toDate = toDate;
		this.fromDate = fromDate;
		this.noOfRooms = noOfRooms;
	}*/
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
}
