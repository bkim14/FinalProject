package com.scsa.java.car4;


public class Test {

	public static void main(String[] args) {
		CarManager mgr=new CarManager();
		Car c=new Bus("44��8372",6000,"Ÿ�����",45);
		mgr.add(c);
		mgr.add(new Car("11�� 4827", 17000, "���׽ý�"));
		mgr.add(new Bus("44�� 4827", 7000, "��������", 60));
		
		System.out.println("��� : "+ mgr.size());
		mgr.search();
		Car result=mgr.search("11��4827");
		System.out.println("�˻� : "+result);
		mgr.update("11��4827", 7000);
		System.out.println("�˻� : " +mgr.search("11��4827"));
		System.out.println(mgr.getTotalPrice());
		System.out.println(mgr.getTotalSeat());
	}

}