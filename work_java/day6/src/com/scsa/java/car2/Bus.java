package com.scsa.java.car2;

public class Bus extends Car{

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
	
	public int getSeat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	
	public String toString() {
		return "Car [num=" + getNum() + ", price=" + getPrice() + ", model="+ getModel()+", Seat=" + getSeat();
	}
	 public void compute() {
		System.out.println("버스의 감가상각");
	}
}