package com.cg.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hotels")
public class Hotel {
	
	@Id
	private int hotelId;
	private String hotelName;
	private String hotelRating;
	private Double rate;
	private Integer availableRooms;
	public int getHotelId() {
		return hotelId;
	}
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getHotelRating() {
		return hotelRating;
	}
	public void setHotelRating(String hotelRating) {
		this.hotelRating = hotelRating;
	}
	public Double getRate() {
		return rate;
	}
	public void setRate(Double rate) {
		this.rate = rate;
	}
	public Integer getAvailableRooms() {
		return availableRooms;
	}
	public void setAvailableRooms(Integer availableRooms) {
		this.availableRooms = availableRooms;
	}
	

	
	

}
