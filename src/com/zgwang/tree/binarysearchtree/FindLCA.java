package com.zgwang.tree.binarysearchtree;

public class FindLCA {
	public static BinarySearchTreeNode find(BinarySearchTreeNode root, 
			BinarySearchTreeNode n1, BinarySearchTreeNode n2){
		if(root == null){
			return null;
		}
		while(true){
			if(n1.getData() < root.getData() && n2.getData() > root.getData()
					|| n1.getData() > root.getData() && n2.getData() < root.getData()){
				return root;
			}
			if(n1.getData() < root.getData()){
				root = root.getLeft();
			}else{
				root = root.getRight();
			}
		}	
	}
}
