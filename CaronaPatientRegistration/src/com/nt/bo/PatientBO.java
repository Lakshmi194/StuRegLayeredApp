package com.nt.bo;

import java.sql.Date;

public class PatientBO {

	private String pname;
	private long adharNum;
	private long phno;
	private String hosName;
	private Date admittedDate;
	private double billAmt ;
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public long getAdharNum() {
		return adharNum;
	}
	public void setAdharNum(long adharNum) {
		this.adharNum = adharNum;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public String getHosName() {
		return hosName;
	}
	public void setHosName(String hosName) {
		this.hosName = hosName;
	}
	public Date getAdmittedDate() {
		return admittedDate;
	}
	public void setAdmittedDate(Date admittedDate) {
		this.admittedDate = admittedDate;
	}
	public double getBillAmt() {
		return billAmt;
	}
	public void setBillAmt(double billAmt) {
		this.billAmt = billAmt;
	}
	@Override
	public String toString() {
		return "PatientBO [pname=" + pname + ", adharNum=" + adharNum + ", phno=" + phno + ", hosName=" + hosName
				+ ", admittedDate=" + admittedDate + ", billAmt=" + billAmt + "]";
	}
		
	}
