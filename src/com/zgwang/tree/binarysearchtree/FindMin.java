package com.zgwang.tree.binarysearchtree;

public class FindMin {
	public static int findMin(BinarySearchTreeNode root){
		if(root == null){
			return 0;
		}else{
			if(root.getLeft() != null){
				return findMin(root.getLeft());
			}else{
				return root.getData();
			}
		}				
	}
	public static int findMin2(BinarySearchTreeNode root){
		if(root == null){
			return 0;
		}
		while(root.getLeft() != null){
			root = root.getLeft();
		}
		return root.getData();
	}
}
