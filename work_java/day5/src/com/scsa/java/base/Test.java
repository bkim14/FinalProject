package com.scsa.java.base;

public class Test {
	public static void main(String[] args) {
		Movie m1=new Movie();
		m1.title="1987";
		m1.director="이동준";
		m1.grade=19;
		m1.genre="드라마";
		m1.summary="동준이 고대부심";
		System.out.println(m1);
		
		Movie m2=new Movie();
		m2.title="1987";
		m2.director="이동준";
		m2.grade=7;
		m2.genre="애니메이션";
		m2.summary="동준이 고대다니는 얘기";
		System.out.println(m2);
		
	}

}
