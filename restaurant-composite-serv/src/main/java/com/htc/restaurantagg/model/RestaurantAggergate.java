package com.htc.restaurantagg.model;

import java.util.List;

public class RestaurantAggergate {
    
	private  long restaurantId;
	private int tableno;
	private String name;
	private Long id;
	private String address;
	private List<Booking> bookings;//A product can have  more than one recommendation is highly possible
	private List<User> users;  //A product can have more than one review is highly possible
	private ServiceAddresses serviceAddresses;//Will keep information about service port and resource location
	public RestaurantAggergate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RestaurantAggergate(long restaurantId, int tableno, String name, Long id, String address,
			List<Booking> bookings, List<User> users, ServiceAddresses serviceAddresses) {
		super();
		this.restaurantId = restaurantId;
		this.tableno = tableno;
		this.name = name;
		this.id = id;
		this.address = address;
		this.bookings = bookings;
		this.users = users;
		this.serviceAddresses = serviceAddresses;
	}
	public long getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(long restaurantId) {
		this.restaurantId = restaurantId;
	}
	public int getTableno() {
		return tableno;
	}
	public void setTableno(int tableno) {
		this.tableno = tableno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Booking> getBookings() {
		return bookings;
	}
	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	public ServiceAddresses getServiceAddresses() {
		return serviceAddresses;
	}
	public void setServiceAddresses(ServiceAddresses serviceAddresses) {
		this.serviceAddresses = serviceAddresses;
	}
	@Override
	public String toString() {
		return "RestaurantAggergate [restaurantId=" + restaurantId + ", tableno=" + tableno + ", name=" + name + ", id="
				+ id + ", address=" + address + ", bookings=" + bookings + ", users=" + users + ", serviceAddresses="
				+ serviceAddresses + "]";
	}
	
	
	
}
