package com.scsa.java.pms;

public class ProductManager {
	private Product[] ps=new Product[100];
	private int index;
	
	public void add(Product p) {
		ps[index++]=p;
	}
	public void search() {
		for(int i=0;i<index;i++) {
			System.out.println(ps[i]);
		}
	}
	
	public Product search(String code) {
		Product p=null;
		for (int i=0;i<index;i++) {
			if(code.equals(ps[i].getCode())) {
				p=ps[i];
				break;
				
			}
		}
		return p;
	}
	
	public void search(int price) {
		Product p=null;
		for (int i=0;i<index;i++) {
			if (ps[i].getPrice()<price) {
				p=ps[i];
				System.out.println(p);
			}
		}
	}
}
