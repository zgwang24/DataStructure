package com.zgwang.list.single;

public class FindMiddle {
	public static ListNode find(ListNode head){
		ListNode slow = head, fast = head;
		int i = 0;
		while(fast.getNext() != null){
			if(i == 0){
				fast = fast.getNext();
				i = 1;
			}else if(i == 1){
				slow = slow.getNext();
				fast = fast.getNext();
				i = 0;
			}
		}
		return slow;
	}
}
