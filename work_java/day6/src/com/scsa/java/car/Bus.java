package com.scsa.java.car;

public class Bus {
	private String num;
	private int price;
	private String model;
	private int seat;
	public Bus() {
		super();
	}
	public Bus(  String num, int price, String model, int seat) {
		super();
		setNum(num);
		setPrice(price);
		setModel(model);
		setSeat(seat);
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
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getSeat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	
	public String toString() {
		return "Car [num=" + num + ", price=" + price + ", model="+ model+", Seat=" + seat;
	}
	public void compute() {
		System.out.println("버스의 감가상각");
	}
}