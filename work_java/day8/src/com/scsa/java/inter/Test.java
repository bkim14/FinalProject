package com.scsa.java.inter;

public class Test {

	public static void main(String[] args) {
		//Car c=new Car(); //abstract라서 객체생성 불가
		Car c=new Bus();
		Car c2= new Truck();
		c.start();
		c.stop();
		c2.start();
		c2.stop();
	}

}
