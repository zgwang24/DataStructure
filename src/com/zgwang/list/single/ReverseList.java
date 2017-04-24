package com.zgwang.list.single;

public class ReverseList {
	public static ListNode reverse(ListNode head){
		if(head == null){
			return null;
		}
		ListNode next = null, temp = null;
		while(head != null){
			next = head.getNext();
			head.setNext(temp);
			temp = head;
			head = next;
		}
		return temp;
	}
	public static void reverse2(ListNode head){
		if(head == null){
			return ;
		}
		reverse2(head.getNext());
		System.out.print(head.getData() + " ");
	}
}
