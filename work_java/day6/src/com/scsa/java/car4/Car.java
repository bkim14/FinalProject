package com.scsa.java.car4;

public class Car {

	private String num;
	private int price;
	private String model;
	
	public Car() {
	
	}

	public Car(String num, int price, String model) {
		
		setNum(num);
		setPrice(price);
		setModel(model);
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		if(num.length()==7) {
		this.num = num;
		
		}
		else {
			System.out.println("������ȣ ����");
		}
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public String toString() {
		return "Car [num=" + num + ", price=" + price + ", model="+ model+"]";
	}
	public void compute() {
		System.out.println("������!");
	}

}
