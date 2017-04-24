package com.zgwang.list.doubles;

public class Test {
	public static void main(String[] args) {
		DLLNode n1 = new DLLNode(1);
		DLLNode n2 = new DLLNode(2);
		DLLNode n3 = new DLLNode(3);
		DLLNode n4 = new DLLNode(4);
		DLLNode n5 = new DLLNode(5);
		DLLNode n6 = new DLLNode(6);
		
		n1.setNext(n2);
		n1.setPrevious(null);
		n2.setNext(n3);
		n2.setPrevious(n1);
		n3.setNext(n4);
		n3.setPrevious(n2);
		n4.setNext(n5);
		n4.setPrevious(n3);
		n5.setNext(null);
		n5.setPrevious(n4);
		
		DLLNode node = DLLInsert.insert(n1, n6, 5);
		while(node != null){
			System.out.print(node.getData() + " ");
			node = node.getNext();
		}
	}
}
