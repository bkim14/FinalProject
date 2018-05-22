package com.scsa.java.car4;

public class NotFoundException extends Exception {
	public NotFoundException() {
		super("그런차 없다");
	}
}
