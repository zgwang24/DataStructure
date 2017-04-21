package com.zgwang.tree.binarysearchtree;

import java.util.ArrayList;

public class IsBST {
	private static ArrayList<BinarySearchTreeNode> temp = new ArrayList<BinarySearchTreeNode>();
	// 利用中序遍历的思想
	private static void mid(BinarySearchTreeNode root){
		if(root != null){
			mid(root.getLeft());
			temp.add(root);
			mid(root.getRight());
		}
	}
	public static boolean isBST(BinarySearchTreeNode root){
		mid(root);
		for(int i = 1; i < temp.size(); i++){
			if(temp.get(i).getData() < temp.get(i - 1).getData()){
				return false;
			}
		}
		return true;
	}
}
