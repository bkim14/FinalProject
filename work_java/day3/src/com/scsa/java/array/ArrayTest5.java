package com.scsa.java.array;
//10���� �������� Ű����� �Է¹޾� �հ踦 ���
//�ִ밪, �ּҰ�, �հ�, ����� ���
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
		System.out.println("�հ�:"+re);
		System.out.printf("���: %.2f",mean());
	}//end main

	public static void max() {
		int result=a[0];
		for (int i=0;i<a.length;i++) {
			if(result<a[i]) {
				result=a[i];
			}
		}
		System.out.println("�ִ밪:"+result);
	}
	public static void min() {
		int result=a[0];
		for (int i=0;i<a.length;i++) {
			if(result>a[i]) {
				result=a[i];
			}
		}
		System.out.println("�ּҰ�:"+result);
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
