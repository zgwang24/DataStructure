package com.zgwang.list.single;

public class ListClear {
	public static void clear(ListNode root){
		ListNode temp, iter = root; 
		while(iter != null){
			temp = iter.getNext();
			iter = null;
			iter = temp;
		}
	}
}
