package com.zgwang.tree.binarytree;

public class MirrorOfBT {
	public static BinaryTreeNode mirror(BinaryTreeNode root){
		if(root == null){
			return null;
		}else{
			mirror(root.getLeft());
			mirror(root.getRight());
			BinaryTreeNode temp = root.getLeft();
			root.setLeft(root.getRight());
			root.setRight(temp);
			return root;
		}
	}
}
