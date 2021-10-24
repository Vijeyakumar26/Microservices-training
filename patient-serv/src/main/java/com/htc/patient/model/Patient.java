package com.htc.patient.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patient")
public class Patient {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long patientId;
	
	@Column
	private String mobileNum;
	
	@Column
	private String fName;
	
	@Column
	private String lName;
	
	@Column
	private int age;
	
	@Column
	private String healthRecords;

	public Patient() {
		super();
	}

	public Patient(String mobileNum, String fName, String lName, int age, String healthRecords) {
		super();
		this.mobileNum = mobileNum;
		this.fName = fName;
		this.lName = lName;
		this.age = age;
		this.healthRecords = healthRecords;
	}

	public Long getPatientId() {
		return patientId;
	}

	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}

	public String getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((patientId == null) ? 0 : patientId.hashCode());
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
		if (patientId == null) {
			if (other.patientId != null)
				return false;
		} else if (!patientId.equals(other.patientId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", mobileNum=" + mobileNum + ", fName=" + fName + ", lName=" + lName
				+ ", age=" + age + ", healthRecords=" + healthRecords + "]";
	}
	
}
