package com.zgwang.tree.binarytree;

public class AllAncestorsOut {
	public static boolean allAncestors(BinaryTreeNode root, BinaryTreeNode node){
		if(root == null){
			return false;
		}
		if(root.getLeft() == node 
				|| root.getRight() == node 
				|| allAncestors(root.getLeft(), node) 
				|| allAncestors(root.getRight(), node)){
			System.out.println(root.getData());
			return true;
		}
		return false;
	}
}
