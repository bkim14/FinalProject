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
		return code+":"+title+":"+quantity;
		
	}
	
}
