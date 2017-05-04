package com.zgwang.stack;

import com.zgwang.list.single.ListNode;

public class LLStack {
	private ListNode head;
	
	public LLStack(){
		this.head = new ListNode(0);
	}
	
	public void push(int data){
		if(head == null){
			head = new ListNode(data);
		}else if(head.getData() == 0){
			head.setData(data);
		}else{
			ListNode node = new ListNode(data);
			node.setNext(head);
			head = node;
		}
	}
	
	public int top(){
		if(head == null){
			return 0;
		}else{
			return head.getData();
		}
	}
	
	public int pop(){
		if(head == null){
			System.out.println("Stack Overflow");
			return -1;
		}else{
			int data = head.getData();
			head = head.getNext();
			return data;
		}
	}
	
	public boolean isEmpty(){
		if(head == null){
			return false;
		}else{
			return true;
		}
	}
	
	public void clearStack(){
		head = null;
	}
}
