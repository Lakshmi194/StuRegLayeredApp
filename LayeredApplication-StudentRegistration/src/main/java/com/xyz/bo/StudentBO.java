package com.xyz.bo;

public class StudentBO {
	private int rno;
	private String sname;
	private int tot;
	private float avg;
	private String result;
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public float getAvg() {
		return avg;
	}
	public void setAvg(float avg) {
		this.avg = avg;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "StudentBO [rno=" + rno + ", sname=" + sname + ", tot=" + tot + ", avg=" + avg + ", result=" + result
				+ "]";
	}
	
}
