package com.scsa.java.car;

public class Test {

	public static void main(String[] args) {
		Bus b=new Bus();
		b.num="11³ª2456";
		b.price=7000;
		b.seat=45;
		System.out.println(b.num);
		b.open(true);
		b.start();
	}

}
