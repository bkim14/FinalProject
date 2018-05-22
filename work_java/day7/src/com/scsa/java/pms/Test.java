package com.scsa.java.pms;

public class Test {

	public static void main(String[] args) {
		ProductManager pm=new ProductManager();
		pm.add(new Product("1111", "컴퓨터", 1000000,10));
		pm.add(new Product("1212", "양말", 5000, 500));
		pm.add(new Product("5015", "쓰레빠", 5000, 500));
		pm.add(new Product("1234", "핸드폰", 500000, 20));
		System.out.println("======전체 상품 목록=======");
		pm.search();
		System.out.println("========상품코드1111=======");
		System.out.println(pm.search("1111"));
		System.out.println("=======51만원 이하의 물건======");
		pm.search(510000);
	}

}
