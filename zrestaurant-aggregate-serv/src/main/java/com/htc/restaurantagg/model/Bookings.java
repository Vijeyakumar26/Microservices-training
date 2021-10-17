package com.htc.restaurantagg.model;

import java.time.LocalDate;

public class Bookings {
	
	private int restaurantId;
	private Long userId;
	private LocalDate date;
	private double time;
	private int tableId;
	private Long bookingId;
	private String name;
	
	public Bookings() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Bookings(int restaurantId, Long userId, LocalDate date, double time, int tableId, Long bookingId,
			String name) {
		super();
		this.restaurantId = restaurantId;
		this.userId = userId;
		this.date = date;
		this.time = time;
		this.tableId = tableId;
		this.bookingId = bookingId;
		this.name = name;
	}

	public int getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}

	public int getTableId() {
		return tableId;
	}

	public void setTableId(int tableId) {
		this.tableId = tableId;
	}

	public Long getBookingId() {
		return bookingId;
	}

	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookingId == null) ? 0 : bookingId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bookings other = (Bookings) obj;
		if (bookingId == null) {
			if (other.bookingId != null)
				return false;
		} else if (!bookingId.equals(other.bookingId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Bookings [restaurantId=" + restaurantId + ", userId=" + userId + ", date=" + date + ", time=" + time
				+ ", tableId=" + tableId + ", bookingId=" + bookingId + ", name=" + name + "]";
	}
}