package com.scsa.java.account;

public class Test {

	public static void main(String[] args) {
		Account a=new Account("11-11", 1111, 500000);
		a.deposit(30000);
		a.withdraw(1111, 10000000);
		a.withdraw(1111,5000);
		System.out.println(a);
		
		Account b=new MinusAccount("11-12", 1234, 500000,500000);
		b.deposit(50000);
		b.withdraw(1234, 10000000);
		b.withdraw(1234, 600000);
		System.out.println(b);
	}
	
		

}
