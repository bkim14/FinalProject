package com.scsa.java.pms2;

public class EventProduct extends Product{
	private int rate;

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public EventProduct() {
		super();
	}

	public EventProduct(String code, String title, int price, int quantity, int rate) {
		super(code, title, price, quantity);
		setRate(rate);
	}
	public String toString() {
		StringBuilder builder=new StringBuilder();
		builder.append("Event Product[");
		builder.append(super.toString());
		builder.append(":");
		builder.append(rate);
		return builder.toString();
	}
	
}
