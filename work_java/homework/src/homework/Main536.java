package homework;
import java.util.Scanner;

public class Main536 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		int y=scan.nextInt();
		
		
		xx(x, y);
		
	}
	public static void xx(int a, int b) {
		int res1=0;
		int res2=0;
		
		res1=(a-b)*(a-b);
		res2=(a+b)*(a+b)*(a+b);
		System.out.println("("+a+" - "+b+") ^ 2 = "+res1);
		System.out.println("("+a+" + "+b+") ^ 3 = "+res2);

		
		}

}
