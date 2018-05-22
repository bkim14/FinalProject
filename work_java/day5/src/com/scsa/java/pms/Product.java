package com.scsa.java.pms;

public class Product {
	String code;
	String title;
	int price;  
	int quantity;
	/**
	 * ����
	 * @param quant ���ŷ�
	 * @return ���
	 */
	public Product() {}
	public Product(String code, String title, int price, int quantity) {
		this.code=code;
		this.title=title;
		this.price=price;
		this.quantity=quantity;
	}
	public Product(String code, String title, int quantity) {
		this(code,title,0,quantity);
	}
	public Product(String code, int quantity) {
		this(code," ",quantity);
	}
	
	public int buy(int quant) {
		quantity=quantity+quant;
		return quantity;
	}
	public int sell(int quant) {
		if (quantity>=quant) {
			quantity=quantity-quant;
		}
		else {
		System.out.println("������");	
		}
		
		return quantity;
	}
	public String toString() {
		return code+":"+title+":"+price+":"+quantity;
		
	}
	
}
