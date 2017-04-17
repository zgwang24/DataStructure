package com.zgwang.tree.binarytree;
import sun.misc.Queue;

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
	public static int findMax2(BinaryTreeNode root) throws Exception{
		int max = Integer.MIN_VALUE;	
		Queue<BinaryTreeNode> q = new Queue<BinaryTreeNode>();
		q.enqueue(root);
		while(!q.isEmpty()){
			BinaryTreeNode temp = q.dequeue();
			if(temp.getData() > max){
				max = temp.getData();
			}
			if(temp.getLeft() != null){
				q.enqueue(temp.getLeft());
			}
			if(temp.getRight() != null){
				q.enqueue(temp.getRight());
			}
		}
		return max;
	}
}
