package com.scsa.java.car;

public class Bus {
	String num;
	int price;
	int seat;
	boolean door=false; //����
	public void start() {
		if(door) {
			open(false);
		}
		System.out.println("���~");
	}
	
	public void open(boolean d) {
		if(d) {
			System.out.println("���ϴ�");
			
		}
		else {
			System.out.println("�ݽ��ϴ�");
			
		}
		door=d;
	}
	
	public void stop() {
		System.out.println("����");
	}
}
