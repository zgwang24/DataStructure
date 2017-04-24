package com.zgwang.list.single;

public class LengthIsJO {
	public static int isJO(ListNode head){
		while(head != null && head.getNext() != null){
			head = head.getNext().getNext();
		}
		if(head == null){
			return 0;
		}
		return 1;
	}
}
