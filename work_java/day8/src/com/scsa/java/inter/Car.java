package com.scsa.java.inter;

public interface Car {
	int k=5;	//public static final int k=5; 
	
	public abstract void start();
	void stop();		//컴파일러가 자동으로 public abstract를 붙임.
	
	
}
