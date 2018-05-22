package com.scsa.java.util;

public class Test {

	public static void main(String[] args) {
		
		MyDate today=new MyDate();
		today.setYear(2018);
		today.setMonth(1);
		today.setDay(19);
		System.out.println(today);
		MyDate birth=new MyDate(2012,111,1);
		System.out.println(birth);

	}

}
