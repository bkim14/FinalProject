package com.gof.model.vo;

import java.util.List;

public class Report {
	
	//작업일보번호
	private int reportNo;
	
	//작업일보날짜
	private String reportDate;
	
	//작업일보날씨
	private String reportWeather;
	
	//현재공정률
	private int reportRate;
	
	//금일작업사항
	private String reportTodayContent;
	
	//특이사항
	private String reportIssue;
	
	//작성자
	private String reportWriter;
	
	//자재 별 진행률 list
	private List<Progress> progressList;
	
}
