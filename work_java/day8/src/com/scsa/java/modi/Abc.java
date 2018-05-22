package com.scsa.java.modi;

public class Abc {
	static int sk=100;
	int k=50;
	static {
		System.out.println("AAAAAAA");
	}
	
	public void m(int param) {
		int local=10;
		System.out.println("mmmm");
	}
	public static void sm() {
		
		//m(); //non-static은 사용 안됨
		sk++;   // static만 사용 가능
		//this	// 객체생성이 안되었기 떄문에 this가 없다.
		System.out.println("ssss");
	}
}
