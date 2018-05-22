package com.scsa.java.car4;

public interface ICarMgr {

	void add(Car c);

	int size();

	Car[] search();

	Car search(String num);

	Boolean update(String num, int price);

	int getTotalPrice();

	int getTotalSeat();

}