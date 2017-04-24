package com.zgwang.list.single;

public class FindNNode {
	public static ListNode find(ListNode head, int n){
		ListNode node1 = head, node2 = head;
		for(int i = 0; i < n; i++){
			if(node1.getNext() == null){
				node1 = node1.getNext();
			}
		}
		while(node1 != null){
			node2 = node2.getNext();
			node1 = node1.getNext();
		}
		return node2;
	}
}
