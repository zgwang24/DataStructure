package com.zgwang.list.single;

public class LoopLength {
	public static int length(ListNode head){
		if(head == null){
			return -1;
		}
		ListNode fast = head, slow = head;
		boolean loop = false;
		int count = 1;
		while(fast.getNext() != null && fast.getNext().getNext() != null){
			fast = fast.getNext().getNext();
			slow = slow.getNext();
			if(slow == fast){
				loop = true;
				break;
			}
		}
		if(loop){
			fast = fast.getNext();
			while(slow != fast){
				fast = fast.getNext();
				count++;
			}
			return count;
		}
		return -1;
	}
}
