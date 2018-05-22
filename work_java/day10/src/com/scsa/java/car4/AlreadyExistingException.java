package com.scsa.java.car4;

public class AlreadyExistingException extends Exception {
	public AlreadyExistingException() {
		super("이미 데이터가 존재합니다");
	}
}
