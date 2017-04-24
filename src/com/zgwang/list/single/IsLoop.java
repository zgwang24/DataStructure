package com.zgwang.list.single;

public class IsLoop {
	public static boolean isLoop(ListNode head){
		if(head == null){
			return false;
		}
		ListNode fast = head, slow = head;
		while(fast.getNext() != null && fast.getNext().getNext() != null){
			fast = fast.getNext().getNext();
			slow = slow.getNext();
			if(fast == slow){
				return true;
			}
		}
		return false;
	}
}
