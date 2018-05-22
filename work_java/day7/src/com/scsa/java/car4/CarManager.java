package com.scsa.java.car4;

public class CarManager {
		
		private Car[] cars=new Car[100];
		private int index=0;
		
		public void add(Car c) {
			cars[index++]=c;
		}
		public int size() {
			return index;
		}
		public void search() {
			for (int i=0;i<index;i++) {
				System.out.println(cars[i]);
			}
		}
		public Car search(String num) {
			for (int i=0;i<index;i++) {
				if (num.equals(cars[i].getNum())) {
					return cars[i];
				}
			}
			return null;
		}
		public void update(String num, int price) {
			for (int i=0;i<index;i++) {
				if(num.equals(cars[i].getNum())) {
					cars[i].setPrice(price);
					break;
				}
			}
		}
		
		public int getTotalPrice() {
			int total=0;
			for (int i=0;i<index;i++) {
				total=total+cars[i].getPrice();
			}
			return total;
		}
		public int getTotalSeat() {
			int total=0;
			for (int i=0;i<index;i++) {
				if(cars[i] instanceof Bus) {
					Bus b=(Bus)cars[i];
					total=total+b.getSeat();
				}
				
			}
			return total;
		} 
		
}
