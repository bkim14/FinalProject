package com.scsa.java.ems;

public class EmsTest {

	public static void main(String[] args) {
		EmployeeManager em= new EmployeeManager();
		em.addEmployee(new FullTimeEmployee(1, "�躴��", 120000000));
		em.addEmployee(new FullTimeEmployee(2, "������", 100000000));
		em.addEmployee(new PartTimeEmployee(3, "������", 7530));
		em.addEmployee(new PartTimeEmployee(4, "�����", 7600));
		em.addEmployee(new PartTimeEmployee(5, "TOFU", 8500));
		em.addEmployee(new FullTimeEmployee(6,"T.O.P", 15000000));
		
		
		System.out.println("=========���� ��ü ���========");
		em.allList();
		System.out.println("=========�˹� ����Ʈ=========");
		em.partTimeEmpList();
		System.out.println("=========�������� ����Ʈ=========");
		em.fullTimeEmpList();
		System.out.println("==========�� ���� ��=========");
		System.out.println(em.size()+"���� ������ �ִ�");
		System.out.println("==========�� �޿�==========");
		System.out.println(em.getTotalSalary());
		System.out.println("=========='������ȣ 5'==========");
		em.search(5);
		System.out.println("=========='�̸��� �ں���� �����ϴ� ����'==========");
		em.search("�����");

	}

}
