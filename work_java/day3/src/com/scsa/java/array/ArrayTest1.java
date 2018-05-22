package com.scsa.java.array;

public class ArrayTest1 {

	public static void main(String[] args) {
		int[] a=new int[5];
		
		a[0]=11;
		a[1]=22;
		a[2]=33;
		a[3]=44;
		a[4]=55;
		//a[5]=66;
		
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);

	}

}
