package com.scsa.java.excep;

public class Test {

	public static void main(String[] args) throws NegativeException {
		add(10,50);
		add(62,73);
		add(-30,40);
	}
	public static void add(int k, int n) throws NegativeException {
		if(k<0||n<0) {	//error»óÈ²
			throw new NegativeException();
		}
		
		
		
		int sum=k+n;
		System.out.println(sum);
	}
}
