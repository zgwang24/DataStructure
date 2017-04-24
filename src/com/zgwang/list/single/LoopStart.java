package com.zgwang.list.single;

public class LoopStart {
	public static ListNode start(ListNode head){
		if(head == null){
			return null;
		}
		ListNode fast = head, slow = head;
		boolean loop = false;
		while(fast.getNext() != null && fast.getNext().getNext() != null){
			fast = fast.getNext().getNext();
			slow = slow.getNext();
			if(slow == fast){
				loop = true;
				break;
			}
		}
		if(loop){
			slow = head;
			while(slow != fast){
				slow = slow.getNext();
				fast = fast.getNext();
			}
			return slow;
		}
		return null;
	}
}
