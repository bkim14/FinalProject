package com.scsa.java.array;

public class CopyTest {

	public static void main(String[] args) {
		int[] a= {22,33,44,55,56};
		int [] b= new int[10];
		System.arraycopy(a, 0, b, 0, a.length);
		for (int su:b) {
			System.out.println(su);
		}
	}

}
