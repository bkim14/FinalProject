package com.scsa.java.ems;

public class FullTimeEmployee extends Employee {
	private int salary;

	public FullTimeEmployee() {
		super();
	}
	public FullTimeEmployee(int snum, String sname, int salary) {
		super(snum, sname);
		setSalary(salary);
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String toString() {
		return super.toString()+"|||ПљБо : "+getSalary();
	}
	public int computeSalary() {
		return getSalary()/12;
	}
}
