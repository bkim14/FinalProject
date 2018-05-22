package com.scsa.java.pms;

public class Product {
	String code;
	String title;
	int price;  
	int quantity;
	/**
	 * 구매
	 * @param quant 구매량
	 * @return 재고량
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
		System.out.println("재고부족");	
		}
		
		return quantity;
	}
	public String toString() {
		return code+":"+title+":"+quantity;
		
	}
	
}
