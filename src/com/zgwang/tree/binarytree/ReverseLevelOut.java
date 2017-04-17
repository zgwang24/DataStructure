package com.zgwang.tree.binarytree;

import java.util.Stack;

import sun.misc.Queue;

public class ReverseLevelOut {
	public static void reverseLevelOut(BinaryTreeNode root) throws Exception{
		if(root == null){
			return ;
		}
		Queue<BinaryTreeNode> q = new Queue<BinaryTreeNode>();
		Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode>();
		q.enqueue(root);
		while(!q.isEmpty()){
			BinaryTreeNode temp = q.dequeue();
			s.push(temp);
			if(temp.getRight() != null){
				q.enqueue(temp.getRight());
			}
			if(temp.getLeft() != null){
				q.enqueue(temp.getLeft());
			}
		}
		while(!s.isEmpty()){
			System.out.print(s.pop().getData() + " ");
		}
	}
}
