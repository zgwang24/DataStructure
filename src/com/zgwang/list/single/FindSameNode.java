package com.zgwang.list.single;

public class FindSameNode {
	public static ListNode find(ListNode n1, ListNode n2){
		int l1 = 0, l2 = 0, diff = 0;
		ListNode head1 = n1, head2 = n2;
		while(head1 != null){
			l1++;
			head1 = head1.getNext();
		}
		while(head2 != null){
			l2++;
			head2 = head2.getNext();
		}
		if(l1 > l2){
			head1 = n1;
			head2= n2;
			diff = l1 - l2;
		}else{
			head1 = n2;
			head2 = n1;
			diff = l2 - l1;
		}
		for(int i = 0; i < diff; i++){
			head1 = head1.getNext();
		}
		while(head1 != null && head2 != null){
			if(head1 == head2){
				return head1;
			}
			head1 = head1.getNext();
			head2 = head2.getNext();
		}
		return null;
	}
}
