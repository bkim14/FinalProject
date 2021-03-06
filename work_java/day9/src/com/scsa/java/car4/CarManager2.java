package com.scsa.java.car4;

import java.util.ArrayList;
import java.util.List;

public class CarManager2 implements ICarMgr {

	List<Car> cars=new ArrayList<>(100);
	
	@Override
	public void add(Car c) {
		cars.add(c);
	}

	@Override
	public int size() {
		return cars.size();
	}

	@Override
	public Car[] search() {
		int len=cars.size();
		Car[] result=new Car[len];
		for (int i=0;i<len;i++) {
			result[i]=cars.get(i);
		}
		return result;
	}

	@Override
	public Car search(String num) {
		Car c=null;
		for (Car cc:cars) {
			if(cc.getNum().equals(num)) {
				c=cc;
				break;
			}
		}
		
		return c;
	}

	@Override
	public Boolean update(String num, int price) {
		boolean result=false;
		Car c=search(num);
		if (c!=null){
			c.setPrice(price);
			result=true;
		}
		else {
			System.out.println("차량번호가 존재하지 않음");
		}
		return result;
	}

	@Override
	public int getTotalPrice() {
		int total=0;
		for (Car c:cars) {
			total+=c.getPrice();
		}
		return total;
	}

	@Override
	public int getTotalSeat() {
		int seats=0;
		for (Car c:cars) {
			if (c instanceof Bus) {
				Bus b=(Bus) c;
				seats=b.getSeat();
			}
		}
		
		return seats;
	}

}
