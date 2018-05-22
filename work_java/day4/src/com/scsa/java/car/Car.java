package com.scsa.java.car;

public class Car {
	String num;
	int price;
	int speed=30;
	
	
	//overloading 기법
	public int start() {
		System.out.println("출발~"+speed);
		return speed;
		
	}
	public int start(int speed) {
		this.speed=this.speed+speed;
		System.out.println("출발"+this.speed);
		return this.speed;
	}
	public void stop() {
		System.out.println("멈춤!");
		
	}
	public void openDoor() {
		stop(); 
		System.out.println("문을 엽니다");
		
	}
	public static void blueTooth() {
		System.out.println("연결~");
	}
}
