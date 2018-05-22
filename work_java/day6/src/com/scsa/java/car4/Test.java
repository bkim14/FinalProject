package com.scsa.java.car4;


public class Test {

	public static void main(String[] args) {
		
		Car[] cars=new Car[5];
		cars[0]=new Car("11소1243", 8000, "에쿠스");
		cars[1]=new Bus("23도7899", 13000, "지상버스", 45);
		cars[2]=new Bus("73새1234", 15000, "타요버스", 60);
		cars[3]=new Car("77나8623", 6500, "소나타");
		cars[4]=new Car("71하1234", 9000,"제네시스");
		System.out.println("================전체 목록=======");
		for (Car c:cars) {
			System.out.println(c);
		}
		System.out.println("=====전체 차량 금액======");
		int total=0;
		for (Car c:cars) {
			total+=c.getPrice();
		}
		System.out.println("=====전체 버스 좌석 수=====");
		int seats=0;
		for (Car c:cars) {
			if (c instanceof Bus) {
				Bus b=(Bus)c;
				seats+=b.getSeat();
			}
		}
		System.out.println("버스의 총 좌석수:"+seats);
		System.out.println("=====버스 목록======");
		for (Car c:cars) {
			if (c instanceof Bus) {
				System.out.println(c);
			}
		}
		System.out.println("===========버스를 제외한 목록======");
		for (Car c:cars) {
			if (!(c instanceof Bus)) {
				System.out.println(c);
			}
		}
	}

}
