package com.gof.model.vo;

import java.util.List;

public class Drawing {
	
	//���� ��ȣ
	private int drawingNo;

	//���� �̸�
	private String drawingName;

	//���� ���
	private String drawingPath;

	//���� ����
	private String drawingRevision;

	//���� ��¥
	private String drawingDate;
	
	//���� ����
	private int drawingStatus;
	
	//�� ���̵�
	private String teamId;

	//����� ���̵�
	private String inchargeRfid;	
	
	//ä�ù� ����Ʈ
	private List<Chatroom> chatroomList;
}