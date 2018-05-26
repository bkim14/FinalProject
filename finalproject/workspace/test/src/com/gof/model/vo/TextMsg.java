package com.gof.model.vo;

public class TextMsg {
	
	//메세지 번호
	private int textNo;
	
	//채팅방 번호
	private int chatroomNo;

	//메시지 발신자
	private String textSender;

	//메시지 수신자
	private String textReceiver;

	//메시지 내용
	private String textContent;

	//메시지 날짜
	private String textDate;

	//메시지 읽음 여부(0:안읽음/1:읽음)
	private int textRead;
	
}
