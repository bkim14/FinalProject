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
	
	
	
	public MyDate() {}//�Ʒ���ó�� ���ο� �����ڸ� ����� �⺻ �����ڸ� �������Ѵ�.
	public MyDate(int year, int month, int day) {
		setYear(year);
		setYear(month);
		setYear(day);
	}
	public MyDate(int month, int day) {
		/*this.year=2018;
		this.month=month;
		this.day=day;*/
		this(2018, month, day);//������ ȣ��, ������ �ȿ����� ù��������
	}
	public String toString() {
		return year+"�� "+month+"�� "+day;
		
	}				//������ Ư¡1: Ŭ������ �̸��� ����;������ Ư¡2: new������ ��밡���ϴ�. Ư¡3: ������ ����. Ư¡4:
}
