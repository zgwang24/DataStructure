package com.zgwang.list.single;

public class ReversePair {
	public static ListNode reverse(ListNode head){	
		ListNode temp;
		if(head == null || head.getNext() == null){
			return head;
		}else{
			temp = head.getNext();
			head.setNext(temp.getNext());
			temp.setNext(head);
			head = temp;
			head.getNext().setNext(reverse(head.getNext().getNext()));
			return head;
		}
		
	}
}
