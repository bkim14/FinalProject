package com.scsa.java.car4;

import java.util.ArrayList;
import java.util.List;

public class CarManager2 implements ICarMgr {

	List<Car> cars=new ArrayList<>(100);
	
	@Override
	public void add(Car c) throws Exception {
		try{
			search(c.getNum());
			throw new AlreadyExistingException();
		}catch (NotFoundException e) {
			cars.add(c);
		}
		
		
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
	public Car search(String num) throws NotFoundException {
		
		for (Car cc:cars) {
			if(cc.getNum().equals(num)) {
				return cc;
			}
		}
		
		throw new NotFoundException();
	}

	@Override
	public Boolean update(String num, int price) throws Exception{
		boolean result=false;
		try{
			Car c=search(num);
		}catch(Exception e){
			throw new NotFoundException();
		}
		search(num).setPrice(price);
		result=true;
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
