package com.scsa.java.util;

public class MyDate {
	private int year;
	private int month;
	private int day;
	
	public void setDay(int day) {
		if (day>=1&&day<=31) {
			this.day=day;
		}
	}
	public void setMonth(int month) {
		if (month>=1&&month<=12) {
			this.month=month;
		}
	}
	public void setYear(int year) {
		if (year>=2000) {
			this.year=year;
		}
	}
	
	
	
	public MyDate() {}//아래것처럼 새로운 생성자를 만들면 기본 생성자를 만들어야한다.
	public MyDate(int year, int month, int day) {
		setYear(year);
		setYear(month);
		setYear(day);
	}
	public MyDate(int month, int day) {
		/*this.year=2018;
		this.month=month;
		this.day=day;*/
		this(2018, month, day);//생성자 호출, 생성자 안에서만 첫문장으로
	}
	public String toString() {
		return year+"년 "+month+"월 "+day;
		
	}				//생성자 특징1: 클래스랑 이름이 같다;생성자 특징2: new에서만 사용가능하다. 특징3: 리턴이 없다. 특징4:
}
