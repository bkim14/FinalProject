package com.scsa.java.car4;


public class Test {

	public static void main(String[] args) {
		CarManager mgr=new CarManager();
		Car c=new Bus("44오8372",6000,"타요버스",45);
		mgr.add(c);
		mgr.add(new Car("11소 4827", 17000, "제네시스"));
		mgr.add(new Bus("44소 4827", 7000, "이층버스", 60));
		
		System.out.println("대수 : "+ mgr.size());
		mgr.search();
		Car result=mgr.search("11소4827");
		System.out.println("검색 : "+result);
		mgr.update("11소4827", 7000);
		System.out.println("검색 : " +mgr.search("11소4827"));
		System.out.println(mgr.getTotalPrice());
		System.out.println(mgr.getTotalSeat());
	}

}
