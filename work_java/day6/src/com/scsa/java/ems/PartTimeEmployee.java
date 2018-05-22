package com.scsa.java.ems;

public class PartTimeEmployee extends Employee {
	private int wage;

	public PartTimeEmployee() {
		super();
	}
	public PartTimeEmployee(int snum, String sname, int wage) {
		super(snum, sname);
		setWage(wage);
	}
	public int getWage() {
		return wage;
	}
	public void setWage(int wage) {
		this.wage = wage;
	}
	public String toString() {
		return super.toString()+"|||ПљБо : "+getWage();
	}
	
	public int computeSalary() {
		return getWage()*160;
	}
}
