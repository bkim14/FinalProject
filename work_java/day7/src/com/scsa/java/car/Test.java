package com.scsa.java.car;

public class Test {
	public static void main(String[] args) {
		Car c1=new Car("11��2434", 5000);
		Car c2=new Car("11��2434", 5000);
		System.out.println(c1);
		System.out.println(c1==c2);	//�ּҰ��� ����� ����! ������ ���Ƶ� ����� ���� �޶� false���
		System.out.println(c1.equals(c2));
		System.out.println(c1.hashCode()==c2.hashCode());
	}
}
