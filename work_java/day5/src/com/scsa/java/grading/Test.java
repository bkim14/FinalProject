package com.scsa.java.grading;

public class Test {

	public static void main(String[] args) {
		Student[] student=new Student[5];
		student[0]=new Student(0,"JAMES",0,0,0);
		student[1]=new Student(1,"DONG",10,20,50);
		student[2]=new Student(2,"JUN",100,5,12);
		student[3]=new Student(3,"LEE",50,70,60);
		student[4]=new Student(4,"KOREA",18,45,70);
		System.out.println("----------�ֵ� ����-----------");
		for (int i=0;i<student.length;i++) {
		System.out.println(student[i]);
		}
		System.out.println("----------�л����� ������ ���------------");
		for (int i=0;i<student.length;i++) {
			System.out.println(student[i].getName()+"�� ������"+student[i].sum());

			System.out.printf(student[i].getName()+"�� ����� %.2f",student[i].average());
			System.out.println();
		}
		System.out.println("------------1��� �����ڵ�-----------");
		int max=student[0].sum();
		int pos=0;
		for (int i=1;i<student.length;i++) {
			if(max<student[i].sum()) {
				max=student[i].sum();
				pos=i;
			}
		}
		System.out.println(student[pos].getName()+"�л���"+ max+"������ 1��!");
		for (int i=0;i<student.length;i++) {
			if(student[i].average()<70){
				System.out.println(student[i]+"�༮�� ����");
			}
		}
		
	}

}
