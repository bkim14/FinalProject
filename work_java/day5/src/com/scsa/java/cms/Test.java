package com.scsa.java.cms;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Customer c=new Customer();
			
			/*c.name="������";
			c.address="ȭ��";
			c.age=28;
			c.info();
			String msg=c.toString();
			System.out.println(msg);
			System.out.println(c.toString());
			System.out.println(c);
			
			Customer c2=new Customer();
			c2.name="�̵���";
			c2.address="����";
			c2.age=28;
			c2.info();
			c2.order();*/
			
			c.setName("�̵���");
			c.setAddress("����");
			c.setAge(28);
			System.out.println(c);
			Customer c2=new Customer("������",28);
			System.out.println(c2);
			System.out.println(c.getName().charAt(0));
	}	

}
