package com.scsa.java.cms;

public class Customer {
	String name;
	String address;
	int age;
	
	public void order() {
		System.out.println(name+"주문~");
	}
	public void cancel() {
		System.out.println(name+"취송~~!~!");
	}
	public void info() {
		System.out.println(name+":"+address+":"+age);
	}
	public String toString() {
		return name+":"+address+":"+age;
	}

}
