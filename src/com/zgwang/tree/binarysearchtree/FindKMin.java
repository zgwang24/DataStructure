package com.zgwang.tree.binarysearchtree;

import java.util.ArrayList;

public class FindKMin {
	private static ArrayList<Integer> list = new ArrayList<Integer>();
	private static void mid(BinarySearchTreeNode root){
		if(root != null){
			mid(root.getLeft());
			list.add(root.getData());
			mid(root.getRight());
		}		
	}
	public static int findK(BinarySearchTreeNode root, int k){
		mid(root);
		if(k > 0 && k <= list.size()){
			return list.get(k - 1);
		}else{
			return -1;
		}	
	} 
}
