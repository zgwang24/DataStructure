package com.zgwang.tree.binarytree;

import sun.misc.Queue;

public class CountNode {
	public static int countNode(BinaryTreeNode root){
		if(root == null){
			return 0;
		}else{
			return countNode(root.getLeft()) + countNode(root.getRight()) + 1;
		}
	}
	public static int countNode2(BinaryTreeNode root) throws Exception{
		if(root == null){
			return 0;
		}
		int count = 0;
		Queue<BinaryTreeNode> q = new Queue<BinaryTreeNode>();
		q.enqueue(root);
		while(!q.isEmpty()){
			BinaryTreeNode temp = q.dequeue();
			count++;
			if(temp.getLeft() != null){
				q.enqueue(temp.getLeft());
			}
			if(temp.getRight() != null){
				q.enqueue(temp.getRight());
			}
		}
		return count;
	}
}
