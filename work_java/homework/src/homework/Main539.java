package homework;
import java.util.Scanner;

public class Main539 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		
		
		
		xx(x);
		
	}
	public static void xx(int x) {
		int result=2;
		for (int i=1;i<x;i++) {
			result=result*2;
		}
		System.out.println(result);
	}
}
