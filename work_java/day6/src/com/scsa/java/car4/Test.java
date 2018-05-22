package com.scsa.java.car4;


public class Test {

	public static void main(String[] args) {
		
		Car[] cars=new Car[5];
		cars[0]=new Car("11��1243", 8000, "����");
		cars[1]=new Bus("23��7899", 13000, "�������", 45);
		cars[2]=new Bus("73��1234", 15000, "Ÿ�����", 60);
		cars[3]=new Car("77��8623", 6500, "�ҳ�Ÿ");
		cars[4]=new Car("71��1234", 9000,"���׽ý�");
		System.out.println("================��ü ���=======");
		for (Car c:cars) {
			System.out.println(c);
		}
		System.out.println("=====��ü ���� �ݾ�======");
		int total=0;
		for (Car c:cars) {
			total+=c.getPrice();
		}
		System.out.println("=====��ü ���� �¼� ��=====");
		int seats=0;
		for (Car c:cars) {
			if (c instanceof Bus) {
				Bus b=(Bus)c;
				seats+=b.getSeat();
			}
		}
		System.out.println("������ �� �¼���:"+seats);
		System.out.println("=====���� ���======");
		for (Car c:cars) {
			if (c instanceof Bus) {
				System.out.println(c);
			}
		}
		System.out.println("===========������ ������ ���======");
		for (Car c:cars) {
			if (!(c instanceof Bus)) {
				System.out.println(c);
			}
		}
	}

}
