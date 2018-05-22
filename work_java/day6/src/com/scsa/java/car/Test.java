package com.scsa.java.car;

public class Test {

	public static void main(String[] args) {
		
		Car c1=new Car("11소1243", 8000, "에쿠스");
		Car c2=new Car("77나8623", 6500, "소나타");
		Car c3=new Car("71하1234", 9000,"제네시스");
		Car[] cars=new Car[4];
		cars[0]=c1;
		cars[1]=c2;
		cars[2]=c3;
		cars[3]=new Car("66토8765", 4000,"모닝");
		for (Car c:cars) {
			System.out.println(c);
		}
		
		Bus[] bs=new Bus[3];
		bs[0]=new Bus("23도7899", 13000, "지상버스", 45);
		bs[1]=new Bus("73새1234", 15000, "타요버스", 60);
		bs[2]=new Bus("86도7777", 20000, "이층버스", 30);
		int seats=0;
		for (Bus b:bs) {
			seats=seats+b.getSeat();
		}
		System.out.println("총 좌석수는 :"+seats);
	}

}
