package com.zgwang.tree.binarytree;

public class FindMax {
	public static int findMax(BinaryTreeNode root){
		int max = Integer.MIN_VALUE;
		if(root != null){
			int rootVal = root.getData();
			int leftVal = findMax(root.getLeft());
			int rightVal = findMax(root.getRight());
			max = Math.max(Math.max(leftVal, rightVal), rootVal);
		}
		return max;
	}
}
