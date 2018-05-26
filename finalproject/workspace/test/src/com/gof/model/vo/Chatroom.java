package com.gof.model.vo;

import java.util.List;

public class Chatroom {
	
	//ä�ù� ��ȣ
	private int chatroomNo;

	//���� ��ȣ
	private int drawingNo;

	//ä�ù� ��¥
	private String chatroomDate;

	//ä�ù� ������
	private String chatroomOpener;
	
	//��ǥx
	private int chatroomPosX;
	
	//��ǥy
	private int chatroomPosY;
	
	//�޼��� ����Ʈ
	private List<TextMsg> textMsgList;
	
	//������ ����Ʈ
	private List<VideoMsg> videoMsgList;
	
	//���� ����Ʈ
	private List<ImageMsg> imageMsgList;
	
	//���� ����Ʈ
	private List<VoiceMsg> voiceMsgList;
	
}
