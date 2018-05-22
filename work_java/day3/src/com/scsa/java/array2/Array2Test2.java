package com.scsa.java.array2;

public class Array2Test2 {
static int N=5;
	public static void main(String[] args) {
		int[][] a=new int[N][N];
		 a[0][0]=30;
		 a[1][2]=50;
		 //==================
		 int posr=-1;
		 int posc=-1;
		 boolean flag=false;
		 
		 for (int r=0;r<N;r++) {
			 for (int c=0;c<N;c++) {
				 if(a[r][c]==50) {
					 
					 posr=r;
					 posc=c;
					 flag=true;
					 break;
				 }
			 }
			 if(flag) break;
		 }
		 System.out.println(posr+ ","+posc);
		 
	}//end main

}//end class
