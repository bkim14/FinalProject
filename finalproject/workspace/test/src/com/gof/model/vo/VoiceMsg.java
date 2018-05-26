package com.gof.model.vo;

public class VoiceMsg {
	
	//음성 번호
	private int voiceNo;

	//채팅방 번호
	private int chatroomNo;

	//음성 발신자
	private String voiceSender;
	
	//음성 수신자
	private String voiceReceiver;
	
	//음성 파일(STT)
	private String voiceContent;
	
	//음성 파일 경로
	private String voicePath;
	
	//음성 날짜
	private String voiceDate;

	//음성 읽음 여부(0:안읽음/1:읽음)
	private int voiceRead;
	
}
