package com.scsa.java.pms2;

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
		int pricee=0;
		for (int i=0;i<index;i++) {
			pricee=ps[i].getPrice();
			if (ps[i] instanceof EventProduct) {
				EventProduct ep=(EventProduct) ps[i];
				pricee=(int)(pricee*((100-ep.getRate())/(double)100));
			}
			if (pricee<price) {
				System.out.println(ps[i]);
			}
		}
	}
}
