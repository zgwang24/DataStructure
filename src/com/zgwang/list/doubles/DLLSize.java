package com.zgwang.list.doubles;

public class DLLSize {
	public static int getSize(DLLNode root){
		int count = 0;
		while(root != null){
			count++;
			root = root.getNext();
		}
		return count;
	}
}
