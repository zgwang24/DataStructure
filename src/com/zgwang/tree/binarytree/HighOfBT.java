package com.zgwang.tree.binarytree;

public class HighOfBT {
	public static int getHight(BinaryTreeNode root){
		if(root == null){
			return 0;
		}else{
			return Math.max(getHight(root.getLeft()), getHight(root.getRight())) + 1;
		}		
	}
}
