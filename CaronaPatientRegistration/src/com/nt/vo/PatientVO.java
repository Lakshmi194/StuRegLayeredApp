package com.nt.vo;
public class PatientVO {
	
	private String pname;
	private String adharNum;
	private String phno;
	private String hosName;
	private String admittedDate;
    private String MedicineCost;
    private String bedCost;
    private String foodCost;
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getAdharNum() {
		return adharNum;
	}
	public void setAdharNum(String adharNum) {
		this.adharNum = adharNum;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public String getHosName() {
		return hosName;
	}
	public void setHosName(String hosName) {
		this.hosName = hosName;
	}
	public String getAdmittedDate() {
		return admittedDate;
	}
	public void setAdmittedDate(String admittedDate) {
		this.admittedDate = admittedDate;
	}
	public String getMedicineCost() {
		return MedicineCost;
	}
	public void setMedicineCost(String medicineCost) {
		MedicineCost = medicineCost;
	}
	public String getBedCost() {
		return bedCost;
	}
	public void setBedCost(String bedCost) {
		this.bedCost = bedCost;
	}
	public String getFoodCost() {
		return foodCost;
	}
	public void setFoodCost(String foodCost) {
		this.foodCost = foodCost;
	}
	@Override
	public String toString() {
		return "PatientVO [pname=" + pname + ", adharNum=" + adharNum + ", phno=" + phno + ", hosName=" + hosName
				+ ", admittedDate=" + admittedDate + ", MedicineCost=" + MedicineCost + ", bedCost=" + bedCost
				+ ", foodCost=" + foodCost + "]";
	}
		
}
