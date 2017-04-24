package com.zgwang.list.single;

public class InsertInSortedList {
	public static ListNode intsert(ListNode head, ListNode node){
		if(head == null){
			return node;
		}
		ListNode current = head, temp = null;
		while(current != null && current.getData() < node.getData()){
			temp = current;
			current = current.getNext();
		}
		if(temp == null){
			node.setNext(head);
			head = node;
		}else{
			temp.setNext(node);
			node.setNext(current);
		}		
		return head;
	}
}
