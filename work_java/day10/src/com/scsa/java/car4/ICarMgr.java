package com.scsa.java.car4;

public interface ICarMgr {

	void add(Car c) throws Exception;

	int size();

	Car[] search();

	Car search(String num) throws NotFoundException;

	Boolean update(String num, int price) throws Exception;

	int getTotalPrice();

	int getTotalSeat();

}