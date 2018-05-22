package com.scsa.java.pms2;

public class Product {
	private String code;
	private String title;
	private int price;  
	private int quantity;
	/**
	 * 구매
	 * @param quant 구매량
	 * @return 재고량
	 */
	
	public Product() {}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Product(String code, String title, int price, int quantity) {
		setCode(code);
		setTitle(title);
		setPrice(price);
		setQuantity(quantity);
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
		System.out.println("재고부족");	
		}
		
		return quantity;
	}
	public String toString() {
		StringBuilder builder=new StringBuilder();
		builder.append(code);
		builder.append(":");
		builder.append(title);
		builder.append(":");
		builder.append(price);
		builder.append(":");
		builder.append(quantity);

		
		return builder.toString();
		
	}
	
}
