package com.scsa.java.car;

public class Car {
	private String num;
	private int price;
	
	public Car() {
		super();
	}
	
	public Car(String num, int price) {
		super();
		setNum(num);
		setPrice(price);
	}

	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int hashCode() {
		return num.hashCode()^Integer.valueOf(price).hashCode();
		
		 
		
	}
	
	public boolean equals(Object obj) {			
		if(obj!=null && obj instanceof Car) {
			Car c=(Car)obj;
			if (this.num.equals(c.num) && this.price==c.price) {
				return true;
			}
		}
		return false;
	}
	public String toString() {
		return "Car [num=" + num + ", price=" + price;
	}
}
