package com.scsa.java.ems;

public class Employee {
	private int snum;
	private String sname;
	public Employee() {};
	public Employee(int snum, String sname) {
		setSnum(snum);
		setSname(sname);
	}
	
	public int getSnum() {
		return snum;
	}
	public void setSnum(int snum) {
		this.snum = snum;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String toString() {
		return "직원번호 : "+getSnum()+"||| 이름 : "+getSname();
	}
	public int computeSalary() {
		return 0;
	}
}
