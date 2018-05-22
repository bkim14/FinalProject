package com.scsa.java.car;

public class Test {
	public static void main(String[] args) {
		Car c1=new Car("11소2434", 5000);
		Car c2=new Car("11소2434", 5000);
		System.out.println(c1);
		System.out.println(c1==c2);	//주소값을 물어보는 질문! 내용은 같아도 저장된 곳이 달라 false출력
		System.out.println(c1.equals(c2));
		System.out.println(c1.hashCode()==c2.hashCode());
	}
}
