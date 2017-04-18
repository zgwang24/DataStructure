package com.zgwang.tree.binarytree;

public class IsMirror {
	public static boolean isMirror(BinaryTreeNode n1, BinaryTreeNode n2){
		if(n1 == null && n2 == null){
			return true;
		}
		if(n1 == null || n2 == null){
			return false;
		}
		if(n1.getData() != n2.getData()){
			return false;
		}else{
			return (isMirror(n1.getLeft(), n2.getRight()) && isMirror(n1.getRight(), n2.getLeft()));
		}
	}
}
