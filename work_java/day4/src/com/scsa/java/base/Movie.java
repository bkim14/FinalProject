package com.scsa.java.base;
/**
 * 영화정보를 저장하여 처리할 수 있는 클래스
 * @author
 * @version 1.0
 * 
 *
 */
public class Movie {
	/**제목을 저장하는 변수 */
	String title;
	String director;
	int grade;
	String genre;
	String summary;
	/**영화 정보를 보여주는 메서드 */
	public String toString() {
		return title+"\t:"+director+"\t:"+grade;
		
	}
}
