package com.htc.clinicservice.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="clinic")
public class Clinic {
	
	@Id
	@GeneratedValue
	private Long appId;
	
	@Column
	private String docId;
	
	@Column
	private String pName;
	
	@Column
	private String docName;
	
	@Column
	private int pAge;
	
	@Column
	private LocalDate date;

	public Clinic() {
		super();
	}

	public Clinic(String docId, String pName, String docName, int pAge, LocalDate date) {
		super();
		this.docId = docId;
		this.pName = pName;
		this.docName = docName;
		this.pAge = pAge;
		this.date = date;
	}

	public Long getAppId() {
		return appId;
	}

	public void setAppId(Long appId) {
		this.appId = appId;
	}

	public String getDocId() {
		return docId;
	}

	public void setDocId(String docId) {
		this.docId = docId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	public int getpAge() {
		return pAge;
	}

	public void setpAge(int pAge) {
		this.pAge = pAge;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((appId == null) ? 0 : appId.hashCode());
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
		Clinic other = (Clinic) obj;
		if (appId == null) {
			if (other.appId != null)
				return false;
		} else if (!appId.equals(other.appId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Clinic [appId=" + appId + ", docId=" + docId + ", pName=" + pName + ", docName=" + docName + ", pAge="
				+ pAge + ", date=" + date + "]";
	}
	
	

}
