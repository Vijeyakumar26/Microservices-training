package com.htc.clinicagg.model;

import java.util.List;

public class ClinicAggregate {
	

	private int appointmentId;
	private String mobile;
	private String fName;
	private String lName;
	private List<Appointment> appoinment;
	private List<Patient> patient;
	public ClinicAggregate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ClinicAggregate(int appointmentId, String mobile, String fName, String lName, List<Appointment> appoinment,
			List<Patient> patient) {
		super();
		this.appointmentId = appointmentId;
		this.mobile = mobile;
		this.fName = fName;
		this.lName = lName;
		this.appoinment = appoinment;
		this.patient = patient;
	}
	public int getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
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
	public List<Appointment> getAppoinment() {
		return appoinment;
	}
	public void setAppoinment(List<Appointment> appoinment) {
		this.appoinment = appoinment;
	}
	public List<Patient> getPatient() {
		return patient;
	}
	public void setPatient(List<Patient> patient) {
		this.patient = patient;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((appoinment == null) ? 0 : appoinment.hashCode());
		result = prime * result + appointmentId;
		result = prime * result + ((fName == null) ? 0 : fName.hashCode());
		result = prime * result + ((lName == null) ? 0 : lName.hashCode());
		result = prime * result + ((mobile == null) ? 0 : mobile.hashCode());
		result = prime * result + ((patient == null) ? 0 : patient.hashCode());
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
		ClinicAggregate other = (ClinicAggregate) obj;
		if (appoinment == null) {
			if (other.appoinment != null)
				return false;
		} else if (!appoinment.equals(other.appoinment))
			return false;
		if (appointmentId != other.appointmentId)
			return false;
		if (fName == null) {
			if (other.fName != null)
				return false;
		} else if (!fName.equals(other.fName))
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
		if (patient == null) {
			if (other.patient != null)
				return false;
		} else if (!patient.equals(other.patient))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ClinicAggregate [appointmentId=" + appointmentId + ", mobile=" + mobile + ", fName=" + fName
				+ ", lName=" + lName + ", appoinment=" + appoinment + ", patient=" + patient + "]";
	}
	
	
	
}
