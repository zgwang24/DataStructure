package com.zgwang.list.single;

public class ListDelete {
	public static ListNode delete(ListNode root, int pos){
		int size = ListLength.listLength(root);
		if(pos > size - 1 || pos < 0){
			System.out.println("The position is error.");
			return root;
		}
		if(pos == 0){
			return root.getNext();
		}else{
			ListNode current = root;
			ListNode previous = null;
			for(int i = 1; i <= pos; i++){
				previous = current;
				current = current.getNext();
			}
			previous.setNext(current.getNext());
			current = null;
		}
		return root;
	}
}
