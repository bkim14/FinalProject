package com.scsa.java.ems;

public class EmsTest {

	public static void main(String[] args) {
		EmployeeManager em= new EmployeeManager();
		em.addEmployee(new FullTimeEmployee(1, "김병옥", 120000000));
		em.addEmployee(new FullTimeEmployee(2, "이지성", 100000000));
		em.addEmployee(new PartTimeEmployee(3, "이은진", 7530));
		em.addEmployee(new PartTimeEmployee(4, "엠비션", 7600));
		em.addEmployee(new PartTimeEmployee(5, "TOFU", 8500));
		em.addEmployee(new FullTimeEmployee(6,"T.O.P", 15000000));
		
		
		System.out.println("=========직원 전체 목록========");
		em.allList();
		System.out.println("=========알바 리스트=========");
		em.partTimeEmpList();
		System.out.println("=========정규직원 리스트=========");
		em.fullTimeEmpList();
		System.out.println("==========총 직원 수=========");
		System.out.println(em.size()+"명의 직원이 있다");
		System.out.println("==========총 급여==========");
		System.out.println(em.getTotalSalary());
		System.out.println("=========='직원번호 5'==========");
		em.search(5);
		System.out.println("=========='이름에 앰비션을 포함하는 직원'==========");
		em.search("엠비션");

	}

}
