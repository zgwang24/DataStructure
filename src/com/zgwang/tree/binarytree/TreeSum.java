package com.zgwang.tree.binarytree;

public class TreeSum {
	public static int sum(BinaryTreeNode root){
		if(root == null){
			return 0;
		}else{
			return sum(root.getLeft()) + root.getData() + sum(root.getRight());
		}
	}
}
