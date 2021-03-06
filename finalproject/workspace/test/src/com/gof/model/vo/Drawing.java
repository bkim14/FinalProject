package com.gof.model.vo;

import java.util.List;

public class Drawing {
	
	//도면 번호
	private int drawingNo;

	//도면 이름
	private String drawingName;

	//도면 경로
	private String drawingPath;

	//도면 버전
	private String drawingRevision;

	//도면 날짜
	private String drawingDate;
	
	//도면 상태
	private int drawingStatus;
	
	//팀 아이디
	private String teamId;

	//담당자 아이디
	private String inchargeRfid;	
	
	//채팅방 리스트
	private List<Chatroom> chatroomList;
}
