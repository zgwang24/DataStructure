package com.zgwang.tree.binarysearchtree;

import java.util.ArrayList;

public class MidTraverse {
	private static ArrayList<Integer> res = new ArrayList<Integer>();
	public static void mid(BinarySearchTreeNode root){
		if(root != null){
			mid(root.getLeft());
			// System.out.println(root.getData());
			res.add(root.getData());
			mid(root.getRight());
		}
	}
	public static void getMid(BinarySearchTreeNode root){
		mid(root);
		for(Integer item : res){
			System.out.print(item + " ");
		}
	}
}
