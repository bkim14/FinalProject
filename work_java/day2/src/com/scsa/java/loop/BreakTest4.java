package com.scsa.java.loop;
//조건이 만족할 떄 여러개의 룹 빠져나가기2
public class BreakTest4 {

	public static void main(String[] args) {
		 int k=5;
		ABC:
		 while(k<8) {
			 for(int i=1;i<k;i++) {
				System.out.println("before:"+i);
				if(i>3) {
				
					break ABC;
				}
				System.out.println("after"+i);
			 }

			 k++;
		 }

	}

}
