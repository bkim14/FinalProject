package com.scsa.java.base;
/**
 * ��ȭ������ �����Ͽ� ó���� �� �ִ� Ŭ����
 * @author
 * @version 1.0
 * 
 *
 */
public class Movie {
	/**������ �����ϴ� ���� */
	String title;
	String director;
	int grade;
	String genre;
	String summary;
	/**��ȭ ������ �����ִ� �޼��� */
	public String toString() {
		return title+"\t:"+director+"\t:"+grade;
		
	}
}
