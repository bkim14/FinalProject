package com.scsa.java.array2;

public class Array2Test {

	public static void main(String[] args) {
		int[][] a=new int[3][4];
		 a[0][0]=30;
		 a[1][2]=50;
		 for (int row=0;row<a.length;row++) {
			 for (int col=0;col<a[row].length;col++) {
				 System.out.print(a[row][col]+" ");
			 }
			 System.out.println();
		 }
		 System.out.println("===========");
		 for (int[] aa:a) {
			 for (int su:aa) {
				 System.out.print(su+" ");
			 }
			 System.out.println();
		 }
	}

}
