package com.zgwang.list.single;

public class Test {
	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		ListNode n6 = new ListNode(6);
		// ListNode n7 = new ListNode(7);
		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		n4.setNext(n5);
		// n5.setNext(n6);
		// n7.setNext(n3);
		// n6.setNext(n3);
		// System.out.println(ListLength.listLength(n1));
		// ListNode node = ListInsert.insert(n1, n6, 15);
		// ListNode node = ListDelete.delete(n1, 4);
		// ListClear.clear(n1);
		// System.out.println(n1.getData());
		// System.out.println(FindNNode.find(n1, 6).getData());
		// System.out.println(IsLoop.isLoop(null));
		// System.out.println(LoopStart.start(n1).getData());
		// System.out.println(LoopLength.length(n1));
		// TraverseList.traverse(n1);
		// ListNode node = InsertInSortedList.intsert(n1, n4);
		// TraverseList.traverse(node);
		// TraverseList.traverse(ReverseList.reverse(n1));
		// System.out.println(FindSameNode.find(n1, n7).getData());
		// System.out.println(FindMiddle.find(n1).getData());
		// ReverseList.reverse2(n1);
		System.out.println(LengthIsJO.isJO(n1));
	}
}	
