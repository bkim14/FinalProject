package com.scsa.java.pms2;

public class Test {

	public static void main(String[] args) {
		ProductManager pm=new ProductManager();
		pm.add(new Product("1111", "��ǻ��", 1000000,10));
		pm.add(new Product("1212", "�縻", 5000, 500));
		pm.add(new EventProduct("5015", "������", 5000, 500,10));
		pm.add(new Product("1234", "�ڵ���", 5000 , 20));
		pm.add(new EventProduct("5001", "Smart ������", 8000, 12,20));
		System.out.println("======��ü ��ǰ ���=======");
		pm.search();
		System.out.println("========��ǰ�ڵ�1111=======");
		System.out.println(pm.search("1111"));
		System.out.println("=======51���� ������ ����======");
		pm.search(8000);
	}

}
