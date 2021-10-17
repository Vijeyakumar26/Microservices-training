package com.htc.restaurantagg.model;



public class Restaurant {

	private int tableno;
	private String name;
	private Long id;
	private String address;

	public Restaurant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Restaurant(int tableno, String name,String address) {
		super();
	
		this.tableno = tableno;
		this.name = name;
		this.address = address;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Restaurant [tableno=" + tableno + ", name=" + name + ", id=" + id + ", address=" + address + "]";
	}

	
}
