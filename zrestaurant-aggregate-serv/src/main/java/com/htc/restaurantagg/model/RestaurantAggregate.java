package com.htc.restaurantagg.model;

import java.util.List;

public class RestaurantAggregate {
	
	private Long restaurantId;
	private String name;
	private String address;
	private List<Tables> tables;
	private List<Bookings> bookings;
	private List<Users> users;
	
	public RestaurantAggregate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RestaurantAggregate(Long restaurantId, String name, String address, List<Tables> tables,
			List<Bookings> bookings, List<Users> users) {
		super();
		this.restaurantId = restaurantId;
		this.name = name;
		this.address = address;
		this.tables = tables;
		this.bookings = bookings;
		this.users = users;
	}

	public Long getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(Long restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Tables> getTables() {
		return tables;
	}

	public void setTables(List<Tables> tables) {
		this.tables = tables;
	}

	public List<Bookings> getBookings() {
		return bookings;
	}

	public void setBookings(List<Bookings> bookings) {
		this.bookings = bookings;
	}

	public List<Users> getUsers() {
		return users;
	}

	public void setUsers(List<Users> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "RestaurantAggregate [restaurantId=" + restaurantId + ", name=" + name + ", address=" + address
				+ ", tables=" + tables + ", bookings=" + bookings + ", users=" + users + "]";
	}
	
}
