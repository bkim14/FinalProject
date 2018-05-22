package homework;

import java.util.Scanner;

public class Main1274 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int b=scan.nextInt();
		int n=(int)Math.log10(b);
		int dab=0;
		int c=1;
		int[]x=new int[8];
		int[]y=new int[8];
		for (int i=0;i<8;i++) {
			x[i]=b/((int)Math.pow(10, 7-i));
			b=b-x[i]*(int)Math.pow(10, 7-i);
			
		}
		
		int sign=1;
			

		if (x[0]==1) {
			sign=-1;
			for (int i=1;i<8;i++) {
				y[i]=1-x[i];
				
			}
			for (int i=7;i>=0;i--) {
				if(y[i]==c) {
					x[i]=0;
					if(y[i]==1&&c==1) {
						c=1;
					}
					else {
						c=0;
					}
					
				}
				else {
					x[i]=1;
					c=0;
				}
				
				
			}
			
		}
		
		
		for (int i=0;i<8;i++) {
			System.out.print(x[i]);
		}
		System.out.println();
		
		for (int i=1;i<x.length;i++) {
			dab=dab+x[i]*(int)Math.pow(2,7-i);
		
		
		}
		System.out.println(sign* dab);
	}
}
