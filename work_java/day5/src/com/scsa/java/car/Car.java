package com.scsa.java.car;

public class Car {
	String num;
	int price;
	int speed=30;
	public Car() {}
	public Car(String num,int price, int speed) {
		this(num, price);
		this.speed=speed;
	}
	public Car(String num,int price) {
		this.num=num;
		this.price=price;
	}
	
	//overloading ���
	public int start() {
		System.out.println("���~"+speed);
		return speed;
		
	}
	public int start(int speed) {
		this.speed=this.speed+speed;
		System.out.println("���"+this.speed);
		return this.speed;
	}
	public void stop() {
		System.out.println("����!");
		
	}
	public void openDoor() {
		stop(); 
		System.out.println("���� ���ϴ�");
		
	}
	public static void blueTooth() {
		System.out.println("����~");
	}
}
