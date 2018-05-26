package com.gof.model.vo;

public class Notification {
	
	//알림 번호
	private int notificationNo;

	//도면 번호
	private int drawingNo;

	//알림 구분(0:승인 완료/1:수정중, 논의중)
	private int notificationType;

	//읽음 여부(0:안읽음/1:읽음)
	private int notificationRead;
	
}
