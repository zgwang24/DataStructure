package com.zgwang.list.single;

public class ListMerge {
	public static ListNode merge(ListNode n1, ListNode n2){
		ListNode result = null;
		if(n1 == null){
			return n2;
		}
		if(n2 == null){
			return n1;
		}
		if(n1.getData() < n2.getData()){
			result = n1;
			result.setNext(merge(n1.getNext(), n2));
		}else{
			result = n2;
			result.setNext(merge(n1, n2.getNext()));
		}
		return result;
	}
}
