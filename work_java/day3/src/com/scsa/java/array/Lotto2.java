package com.scsa.java.array;
import java.util.Random;

public class Lotto2 {
static int[] lotto=new int[6];
	public static void main(String[] args) {
		
		
		

		for (int i=0;i<lotto.length;i++) {
		
			lotto[i]=uniqueValue(i);
			System.out.println(lotto[i]);
		}
	}
	/**
	 * 중복되지 않은 값을 구해서 리턴
	 * @param index 현재 값을 구할 위치
	 * @return 중복되지 않는 임의의 값
	 */
	public static int uniqueValue(int index) {
		Random r=new Random();
		int temp=0;
		boolean dup=false;
		do {
			dup=false;
			temp=r.nextInt(45)+1;
			for (int i=0;i<index;i++) {
				if(temp==lotto[i]) {
					dup=true;
					break;
				}
			}
			
		}while(dup);  
		return temp;
	}
}
