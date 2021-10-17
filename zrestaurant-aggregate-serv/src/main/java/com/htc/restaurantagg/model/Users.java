package com.htc.restaurantagg.model;

public class Users {
	
	private Long userId;
	private String name;
	private String adrress;
	private String city;
	private Long phoneNo;

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Users(Long userId, String name, String adrress, String city, Long phoneNo) {
		super();
		this.userId = userId;
		this.name = name;
		this.adrress = adrress;
		this.city = city;
		this.phoneNo = phoneNo;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdrress() {
		return adrress;
	}

	public void setAdrress(String adrress) {
		this.adrress = adrress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
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
		Users other = (Users) obj;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", name=" + name + ", adrress=" + adrress + ", city=" + city + ", phoneNo="
				+ phoneNo + "]";
	}

}
