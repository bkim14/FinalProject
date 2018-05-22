package homework;
import java.util.Scanner;

public class Main537 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double x=scan.nextDouble();
		double y=scan.nextDouble();
		
		
		xx(x,y);
		
	}
	public static void xx(double a, double b) {
		double num=0;
		double max=0;
		double min=0;
		if (a>b) {
			max=a;
			min=b;
		}
		else {
			max=b;
			min=a;
		}
		
		num=Math.floor(Math.sqrt(max))-Math.ceil(Math.sqrt(min));
		System.out.println((int)num+1);
	}
}
