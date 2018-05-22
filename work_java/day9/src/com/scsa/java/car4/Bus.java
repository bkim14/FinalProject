package com.scsa.java.car4;

public class Bus extends Car {
	
	private int seat;
	public Bus() {
		super();
	}
	public Bus(  String num, int price, String model, int seat) {
		super(num, price, model);
		setSeat(seat);
	}
	
	public int getSeat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	
	public String toString() {
		return super.toString()+", Seat=" + seat;
	}
	public void compute() {
		System.out.println("버스의 감가상각");
	}
}