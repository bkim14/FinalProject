package homework;
import java.util.Scanner;

public class Main335 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] array=new int[10];
		
		for (int i=0;i<array.length;i++) {
			array[i]=scan.nextInt();
			}
		xx(array);
		
	}
	public static void xx(int[] list) {
		int temp=0;
		for (int i=list.length-1;i>=1;i--) {
			for (int j=0;j<i;j++) {
				if (list[j+1]>list[j]) {
					temp=list[j+1];
					list[j+1]=list[j];
					list[j]=temp;
				}
			}
			for (int j=0;j<list.length;j++) {
				System.out.print(list[j]+" ");
				
				
			}
			System.out.println();
			}
	}
}
