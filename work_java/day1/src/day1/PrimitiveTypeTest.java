package day1;

public class PrimitiveTypeTest {

	public static void main(String[] args) {
		int a=123;
		long b=a;//�ڵ� ����ȯ
		long c=123L;
		long d=a+30L; //32��Ʈ+64��Ʈ->64��Ʈ�� ��ȯ long��� int�� ������ ����
		int d1=(int) (a+30L);//����� ����ȯ
		int e=(int) (30+3.4*2);// 30+6.8=36.8->36
		double f=30/4;// ���� ������ ������ 7�� �����. f�� ���������� 7.0���� �����.
		double f2=30/4+2.7;// 7+2.7=9.7
		
		char ch='A';
		System.out.println(ch);
		System.out.println(ch+1);
		System.out.println(++ch);
	}

}
