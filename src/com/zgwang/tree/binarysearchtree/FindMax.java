package com.zgwang.tree.binarysearchtree;

public class FindMax {
	public static int findMax(BinarySearchTreeNode root){
		if(root == null){
			return 0;
		}else{
			if(root.getRight() == null){
				return root.getData();
			}else{
				return findMax(root.getRight());
			}			
		}
	}
	public static int findMax2(BinarySearchTreeNode root){
		if(root == null){
			return 0;
		}
		while(root.getRight() != null){
			root = root.getRight();
		}
		return root.getData();
	}
}
