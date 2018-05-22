package com.scsa.java.car4;


public class Test {

	public static void main(String[] args) throws AlreadyExistingException {
		ICarMgr mgr=new CarManager2();
		Car c=new Bus("44��8372",6000,"Ÿ�����",45);
		try {
			mgr.add(c);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mgr.add(new Car("11��4827", 17000, "���׽ý�"));
		mgr.add(new Bus("44��4827", 7000, "��������", 60));
		
		System.out.println("��� : "+ mgr.size());
		Car[] cc=mgr.search();
		for (Car c1:cc) {
			System.out.println(c1);
		}
		Car result;
		try {
			result = mgr.search("11��4827");
			System.out.println("�˻� : "+result);
		} catch (NotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			mgr.update("11��4827", 7000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("�˻� : " +mgr.search("11��4827"));
		System.out.println(mgr.getTotalPrice());
		System.out.println(mgr.getTotalSeat());
	}

}
