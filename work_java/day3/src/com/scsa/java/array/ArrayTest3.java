package com.scsa.java.array;
//10���� �������� Ű����� �Է¹޾� �հ踦 ���
import java.util.Scanner;

public class ArrayTest3 {

	public static void main(String[] args) {
		int[] a=new int[10];
		Scanner scan=new Scanner(System.in);
		
		for(int i=0;i<a.length;i++) {
		a[i]=scan.nextInt();
		}
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);

	}

}
