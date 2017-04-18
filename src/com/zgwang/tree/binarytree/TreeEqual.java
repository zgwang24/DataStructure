package com.zgwang.tree.binarytree;

public class TreeEqual {
	public static boolean equal(BinaryTreeNode n1, BinaryTreeNode n2){
		if(n1 == null && n2 == null){
			return true;
		}
		if(n1 == null || n2 == null){
			return false;
		}
		return (n1.getData() == n2.getData() && equal(n1.getLeft(), n2.getLeft()) 
				&& equal(n1.getRight(), n2.getRight())); 
	}
}
