package com.nt.dto;

import java.io.Serializable;
import java.sql.Date;

public class PatientDTO implements Serializable{
    private String pname;
	private long adharNum;
	private long phno;
	private String hosName;
	private Date admittedDate;
	private double MedicineCost;
    private double bedCost;
    private double foodCost;
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
	public double getMedicineCost() {
		return MedicineCost;
	}
	public void setMedicineCost(double medicineCost) {
		MedicineCost = medicineCost;
	}
	public double getBedCost() {
		return bedCost;
	}
	public void setBedCost(double bedCost) {
		this.bedCost = bedCost;
	}
	public double getFoodCost() {
		return foodCost;
	}
	public void setFoodCost(double foodCost) {
		this.foodCost = foodCost;
	}
	@Override
	public String toString() {
		return "PatientDTO [pname=" + pname + ", adharNum=" + adharNum + ", phno=" + phno + ", hosName=" + hosName
				+ ", admittedDate=" + admittedDate + ", MedicineCost=" + MedicineCost + ", bedCost=" + bedCost
				+ ", foodCost=" + foodCost + "]";
	}
	
	}
