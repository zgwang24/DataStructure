package com.zgwang.list.single;

public class ListInsert {
	public static ListNode insert(ListNode root, ListNode n, int pos){
		if(root == null){
			return n;
		}
		int size = ListLength.listLength(root);
		if(pos > size || pos < 0){
			System.out.println("The position is error.");
			return root;
		}
		if(pos == 0){
			n.setNext(root);
			return n;
		}else{
			ListNode posNode = root;
			for(int i = 1; i < pos; i++){
				posNode = posNode.getNext();
			}
			ListNode temp = posNode.getNext();
			posNode.setNext(n);
			n.setNext(temp);
		}
		return root;
	} 
}
