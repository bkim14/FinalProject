package com.scsa.java.loop;
//������ ������ �� �������� �� ����������
public class BreakTest2 {

	public static void main(String[] args) {
		 int k=5;
		 boolean exit=false;
		 while(k<8) {
			 for(int i=1;i<k;i++) {
				System.out.println("before:"+i);
				if(i>3) {
					exit=true;
					break;
				}
				System.out.println("after"+i);
			 }
			 if(exit)break;
			 k++;
		 }

	}

}
