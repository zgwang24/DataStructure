package com.zgwang.list.single;

public class ListLength {
	public static int listLength(ListNode root){
		int length = 0;
		ListNode current = root;
		while(current != null){
			length++;
			current = current.getNext();
		}
		return length;
	}
}
