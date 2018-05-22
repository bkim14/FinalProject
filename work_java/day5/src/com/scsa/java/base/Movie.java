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
	public Movie() {}
	
	public Movie(String title, String director, int grade, String genre, String summary) {
		this(title,director,grade);
		this.genre=genre;
		this.summary=summary;
	}
	
	public Movie(String title, String director, int grade) {
		this.title=title;
		this.director=director;
		this.grade=grade;
	}
	/**��ȭ ������ �����ִ� �޼��� */
	public String toString() {
		return title+"\t:"+director+"\t:"+grade;
		
	}
}
