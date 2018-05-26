package com.gof.model.vo;

import java.util.List;

public class Team {
	
	//팀 아이디
	private String teamId;

	//구역 아이디
	private String sectionId;
	
	//공종 아이디
	private String divisionId;

	//대분류
	private String teamVenti;
	
	//중분류
	private String teamGrande;
	
	//소분류
	private String teamTall;
	
	//반장 아이디
	private String leaderRfid;
	
	//팀원 리스트
	private List<Employee> employeeList;
	
	//도면 리스트
	private List<Drawing> drawingList;
	
}
