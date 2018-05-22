package com.scsa.java.car4;


public class Test {

	public static void main(String[] args) {
		ICarMgr mgr=new CarManager2();
		Car c=new Bus("44��8372",6000,"Ÿ�����",45);
		mgr.add(c);
		mgr.add(new Car("11��4827", 17000, "���׽ý�"));
		mgr.add(new Bus("44��4827", 7000, "��������", 60));
		
		System.out.println("��� : "+ mgr.size());
		Car[] cc=mgr.search();
		for (Car c1:cc) {
			System.out.println(c1);
		}
		Car result=mgr.search("11��4827");
		System.out.println("�˻� : "+result);
		System.out.println(mgr.update("11��4827", 7000));
		System.out.println("�˻� : " +mgr.search("11��4827"));
		System.out.println(mgr.getTotalPrice());
		System.out.println(mgr.getTotalSeat());
	}

}