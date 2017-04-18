package com.zgwang.tree.binarytree;

public class Traverse {
	public static void pre(BinaryTreeNode root){
		if(root != null){
			System.out.print(root.getData() + " ");
			pre(root.getLeft());
			pre(root.getRight());
		}
	}
}
