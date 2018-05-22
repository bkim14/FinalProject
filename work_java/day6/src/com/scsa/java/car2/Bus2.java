package com.scsa.java.car2;

public class Bus2 extends Car{

	private int seat;
	public Bus2() {
		super();
	}
	public Bus2(  String num, int price, String model, int seat) {
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
		return super.toString()+", Seat=" + getSeat();
	}
	 public void compute() {
		System.out.println("버스의 감가상각");
	}
}