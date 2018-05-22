package com.scsa.java.array;
//10개의 정수값을 키보드로 입력받아 합계를 출력
//최대값, 최소값, 합계, 평균을 출력
import java.util.Scanner;

public class ArrayTest4 {

	public static void main(String[] args) {
		int[] a=new int[10];
		int max=0;
		int min=0;
		double mean=0;
		Scanner scan=new Scanner(System.in);
		
		for(int i=0;i<a.length;i++) {
		a[i]=scan.nextInt();
		}
		max(a);
		min(a);
		sum(a);
		mean(a);
		

	}//end main

	public static void max(int[] a) {
		int result=a[0];
		for (int i=0;i<a.length;i++) {
			if(result<a[i]) {
				result=a[i];
			}
		}
		System.out.println("최대값:"+result);
	}
	public static void min(int[] a) {
		int result=a[0];
		for (int i=0;i<a.length;i++) {
			if(result>a[i]) {
				result=a[i];
			}
		}
		System.out.println("최소값:"+result);
	}
	public static void sum(int[] a) {
		int tot=0;
		for(int i=0;i<a.length;i++) {
			tot=tot+a[i];
		}
	System.out.println("합계:"+tot);
	}

	public static void mean(int[] a) {
		int tot=0;
		for(int i=0;i<a.length;i++) {
			tot=tot+a[i];
		}
	System.out.printf("평균: %.2f",((double)tot/a.length));
}
	
	
}//end class
