package day1;
import java.util.Scanner;

public class Main539 {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		int x=1;
		int sum=0;
		int count=0;
		double mean=0;

		while(x<100) {
			x=scan.nextInt();
			count++;
			sum=x+sum;
			mean=(double) sum/count;

		}
		
		System.out.println(sum);
		
		System.out.printf("%.1f", mean);
		
	}

}