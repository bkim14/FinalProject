package com.scsa.java.cms;

public class Customer {
	private String name;
	private String address;
	private int age;
	
	public void setName(String name) {
		if (name.length()<=30) {
			this.name=name;	
		}
		else {
			System.out.println("이름 오류");
		}
	}
	public String getName() {
		return name;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	public String getAddress() {
		return address;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int setAge() {
		return age;
	}
	public Customer(String name, String address, int age) {
		setName(name);
		setAddress(address);
		setAge(age);
	}
	public Customer(String name, int age) {
		this(name," ", age);
	}
	public Customer() {}
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
