package com.scsa.java.car;

public class Bus {
	String num;
	int price;
	int seat;
	boolean door=false; //¥›»˚
	public void start() {
		if(door) {
			open(false);
		}
		System.out.println("√‚πﬂ~");
	}
	
	public void open(boolean d) {
		if(d) {
			System.out.println("ø±¥œ¥Ÿ");
			
		}
		else {
			System.out.println("¥›Ω¿¥œ¥Ÿ");
			
		}
		door=d;
	}
	
	public void stop() {
		System.out.println("∏ÿ√„");
	}
}
