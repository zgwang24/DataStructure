package com.zgwang.list.single;

public class TraverseList {
	public static void traverse(ListNode head){
		while(head != null){
			System.out.print(head.getData() + " ");
			head = head.getNext();
		}
	}
}
