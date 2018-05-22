package com.scsa.java.array;
//10개의 정수값을 키보드로 입력받아 합계를 출력
//최대값, 최소값, 합계, 평균을 출력
//
import java.util.Scanner;

public class ArrayTest5 {
static int[] a=new int[10];		//Member Variable
	public static void main(String[] args) {	//Member Method
		
		Scanner scan=new Scanner(System.in);
		
		for(int i=0;i<a.length;i++) {
			
			a[i]=scan.nextInt();
		}
		max();
		min();
		int re=sum();
		System.out.println("합계:"+re);
		System.out.printf("평균: %.2f",mean());
	}//end main

	public static void max() {
		int result=a[0];
		for (int i=0;i<a.length;i++) {
			if(result<a[i]) {
				result=a[i];
			}
		}
		System.out.println("최대값:"+result);
	}
	public static void min() {
		int result=a[0];
		for (int i=0;i<a.length;i++) {
			if(result>a[i]) {
				result=a[i];
			}
		}
		System.out.println("최소값:"+result);
	}
	public static int sum() {
		int tot=0; 
		for(int i=0;i<a.length;i++) {
			tot=tot+a[i];
		}
		return tot;
	}

	public static double mean() {
		int re=sum();
		return (double)re/a.length;
		
		}

	
}//end class
