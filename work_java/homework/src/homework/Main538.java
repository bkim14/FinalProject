package homework;
import java.util.Scanner;

public class Main538 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] list=new int[5];
		for (int i=0;i<list.length;i++) {
			list[i]=scan.nextInt();
			
		}
		
		
		xx(list);
		
	}
	public static void xx(int[] l) {
		int count=0;
		for (int i=0;i<l.length;i++) {
			count=count+Math.abs(l[i]);
		}
		System.out.println(count);
	}
}
