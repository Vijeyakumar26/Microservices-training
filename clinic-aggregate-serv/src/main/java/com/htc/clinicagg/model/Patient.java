package com.htc.clinicagg.model;


public class Patient {
	
	private int patientId;
	private String mobile;
	private String fName;
	private String lName;
	private int age;
	private String healthRecords;
	private String address;
	
	

	public Patient() {
		super();
	}



	public Patient(int patientId, String mobile, String fName, String lName, int age, String healthRecords,
			String address) {
		super();
		this.patientId = patientId;
		this.mobile = mobile;
		this.fName = fName;
		this.lName = lName;
		this.age = age;
		this.healthRecords = healthRecords;
		this.address = address;
	}



	public int getPatientId() {
		return patientId;
	}



	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}



	public String getMobile() {
		return mobile;
	}



	public void setMobile(String mobile) {
		this.mobile = mobile;
	}



	public String getfName() {
		return fName;
	}



	public void setfName(String fName) {
		this.fName = fName;
	}



	public String getlName() {
		return lName;
	}



	public void setlName(String lName) {
		this.lName = lName;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getHealthRecords() {
		return healthRecords;
	}



	public void setHealthRecords(String healthRecords) {
		this.healthRecords = healthRecords;
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
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + age;
		result = prime * result + ((fName == null) ? 0 : fName.hashCode());
		result = prime * result + ((healthRecords == null) ? 0 : healthRecords.hashCode());
		result = prime * result + ((lName == null) ? 0 : lName.hashCode());
		result = prime * result + ((mobile == null) ? 0 : mobile.hashCode());
		result = prime * result + patientId;
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
		Patient other = (Patient) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (age != other.age)
			return false;
		if (fName == null) {
			if (other.fName != null)
				return false;
		} else if (!fName.equals(other.fName))
			return false;
		if (healthRecords == null) {
			if (other.healthRecords != null)
				return false;
		} else if (!healthRecords.equals(other.healthRecords))
			return false;
		if (lName == null) {
			if (other.lName != null)
				return false;
		} else if (!lName.equals(other.lName))
			return false;
		if (mobile == null) {
			if (other.mobile != null)
				return false;
		} else if (!mobile.equals(other.mobile))
			return false;
		if (patientId != other.patientId)
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", mobile=" + mobile + ", fName=" + fName + ", lName=" + lName
				+ ", age=" + age + ", healthRecords=" + healthRecords + ", address=" + address + "]";
	}


}