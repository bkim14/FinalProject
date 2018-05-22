package com.scsa.java.pms;

public class Test {

	public static void main(String[] args) {
		
		Product p=new Product();
		p.code="A1001";
		p.title="smart TV";
		p.price=150;
		p.quantity=5;
		System.out.println(p);
		p.buy(2);
		p.sell(13);
		System.out.println(p);
	}

}
