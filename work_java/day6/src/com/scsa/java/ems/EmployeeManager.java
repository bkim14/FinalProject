package com.scsa.java.ems;

public class EmployeeManager {
	Employee[] employees=new Employee[100];
	int index;
	public void addEmployee(Employee e) {
		employees[index++]=e;
	}
	public void allList() {
		for (int i=0;i<index;i++) {
			System.out.println(employees[i].toString());
		}
	}
	public void partTimeEmpList(){
		for (int i=0;i<index;i++) {
			if(employees[i] instanceof PartTimeEmployee) {
				System.out.println(employees[i].toString());
			}
		}
		
	}
	public void fullTimeEmpList(){
		for (int i=0;i<index;i++) {
			if(employees[i] instanceof FullTimeEmployee) {
				System.out.println(employees[i].toString());
			}
		}
	}
	public int size() {
		return index;
	}
	
	public int getTotalSalary() {
		int total=0;
		for (int i=0;i<index;i++) {
			total=total+employees[i].computeSalary();
		}
		return total;
	}
	public void search(int num) {
		for (int i=0;i<index;i++) {
			if(employees[i].getSnum()==num) {
				System.out.println(employees[i]);
			}
		}
	}
	
	public void search(String name) {
		for (int i=0;i<index;i++) {
			if (employees[i].getSname().contains(name)) {
				System.out.println(employees[i]);
			}
		}
	}
	
	
}
