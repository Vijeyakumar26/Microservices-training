package com.htc.restaurantagg.model;

import java.util.List;


public class Restaurant {
	
	private long restaurentId;
	private String name;
	private String address;
	private List<Tables> tables;

	public long getRestaurentId() {
		return restaurentId;
	}

	public void setRestaurentId(long restaurentId) {
		this.restaurentId = restaurentId;
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (restaurentId ^ (restaurentId >>> 32));
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
		Restaurant other = (Restaurant) obj;
		if (restaurentId != other.restaurentId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Restaurent [restaurentId=" + restaurentId + ", name=" + name + ", address=" + address + ", tables="
				+ tables + "]";
	}
	
}
