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
		
		//m(); //non-static�� ��� �ȵ�
		sk++;   // static�� ��� ����
		//this	// ��ü������ �ȵǾ��� ������ this�� ����.
		System.out.println("ssss");
	}
}
