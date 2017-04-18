package com.zgwang.tree.binarysearchtree;

public class FindTraget {
	public static boolean find(BinarySearchTreeNode root, BinarySearchTreeNode target){
		if(root == null){
			return false;
		}
		if(root.getData() < target.getData()){
			return find(root.getRight(), target);
		}else if(root.getData() > target.getData()){
			return find(root.getLeft(), target);		
		}else if(root.getData() == target.getData()){
			return true;
		}
		return false;
	}
	public static boolean find2(BinarySearchTreeNode root, BinarySearchTreeNode target){
		if(root == null){
			return false;
		}
		while(root!= null){
			if(root.getData() == target.getData()){
				return true;
			}else if(root.getData() > target.getData()){
				root = root.getLeft();
			}else{
				root = root.getRight();
			}
		}
		return false;
	}
}
