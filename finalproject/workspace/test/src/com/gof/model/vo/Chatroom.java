package com.gof.model.vo;

import java.util.List;

public class Chatroom {
	
	//채팅방 번호
	private int chatroomNo;

	//도면 번호
	private int drawingNo;

	//채팅방 날짜
	private String chatroomDate;

	//채팅방 개설자
	private String chatroomOpener;
	
	//좌표x
	private int chatroomPosX;
	
	//좌표y
	private int chatroomPosY;
	
	//메세지 리스트
	private List<TextMsg> textMsgList;
	
	//동영상 리스트
	private List<VideoMsg> videoMsgList;
	
	//사진 리스트
	private List<ImageMsg> imageMsgList;
	
	//녹음 리스트
	private List<VoiceMsg> voiceMsgList;
	
}
