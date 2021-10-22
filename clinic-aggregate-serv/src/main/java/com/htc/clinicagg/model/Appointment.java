package com.htc.clinicagg.model;

import java.time.LocalDate;
import java.time.LocalTime;



public class Appointment {
	
	private int appoitmentId;
	private int patientId;
	private String patientName;
	private int doctorId;
	private String doctorName;
//	@Column
//	private LocalDate date; log.info("Preloading " + repository.save(new Booking("1", LocalDate.now(), LocalTime.now(), "1","1", "kh")));
	private String  appoinmentTime;
	
	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Appointment(int appoitmentId, int patientId, String patientName, int doctorId, String doctorName,
			String appoinmentTime) {
		super();
		this.appoitmentId = appoitmentId;
		this.patientId = patientId;
		this.patientName = patientName;
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.appoinmentTime = appoinmentTime;
	}

	public int getAppoitmentId() {
		return appoitmentId;
	}

	public void setAppoitmentId(int appoitmentId) {
		this.appoitmentId = appoitmentId;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getAppoinmentTime() {
		return appoinmentTime;
	}

	public void setAppoinmentTime(String appoinmentTime) {
		this.appoinmentTime = appoinmentTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((appoinmentTime == null) ? 0 : appoinmentTime.hashCode());
		result = prime * result + appoitmentId;
		result = prime * result + doctorId;
		result = prime * result + ((doctorName == null) ? 0 : doctorName.hashCode());
		result = prime * result + patientId;
		result = prime * result + ((patientName == null) ? 0 : patientName.hashCode());
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
		Appointment other = (Appointment) obj;
		if (appoinmentTime == null) {
			if (other.appoinmentTime != null)
				return false;
		} else if (!appoinmentTime.equals(other.appoinmentTime))
			return false;
		if (appoitmentId != other.appoitmentId)
			return false;
		if (doctorId != other.doctorId)
			return false;
		if (doctorName == null) {
			if (other.doctorName != null)
				return false;
		} else if (!doctorName.equals(other.doctorName))
			return false;
		if (patientId != other.patientId)
			return false;
		if (patientName == null) {
			if (other.patientName != null)
				return false;
		} else if (!patientName.equals(other.patientName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Appoinment [appoitmentId=" + appoitmentId + ", patientId=" + patientId + ", patientName=" + patientName
				+ ", doctorId=" + doctorId + ", doctorName=" + doctorName + ", appoinmentTime=" + appoinmentTime + "]";
	}

	

	
	
	
}	