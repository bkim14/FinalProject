package day1;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		System.out.println("�� ���� �Է��ϼ���");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();//s�޸𸮿� �ִ� �ؽ�Ʈ ��Ʈ��� �޼ҵ带 �����´�.
		int b=s.nextInt();
		
		int result=a+b;
		System.out.println("����:" + result);

		result=a-b;
		System.out.println("�E��:"+result);
		result=a*b;
		System.out.println("����:"+result);
		result=a/b;
		System.out.println("������:"+result);
		result=a%b;
		System.out.println("������:"+result);
		
		double d=a;
		System.out.println(d);
		float f=3.6f;
		System.out.println(f);
		char c='A';
		int k=c;
		System.out.println(k);
	}

}
