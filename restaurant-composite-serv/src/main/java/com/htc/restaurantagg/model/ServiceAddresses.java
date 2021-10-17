package com.htc.restaurantagg.model;

public class ServiceAddresses {
	private String cmp;//consumer
	private String pro;//producer
	private String rev;
	private String rec;
	public ServiceAddresses() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ServiceAddresses(String cmp, String pro, String rev, String rec) {
		super();
		this.cmp = cmp;
		this.pro = pro;
		this.rev = rev;
		this.rec = rec;
	}
	public String getCmp() {
		return cmp;
	}
	public void setCmp(String cmp) {
		this.cmp = cmp;
	}
	public String getPro() {
		return pro;
	}
	public void setPro(String pro) {
		this.pro = pro;
	}
	public String getRev() {
		return rev;
	}
	public void setRev(String rev) {
		this.rev = rev;
	}
	public String getRec() {
		return rec;
	}
	public void setRec(String rec) {
		this.rec = rec;
	}
	@Override
	public String toString() {
		return "ServiceAddresses [cmp=" + cmp + ", pro=" + pro + ", rev=" + rev + ", rec=" + rec + "]";
	}
	
	
	
	

}
