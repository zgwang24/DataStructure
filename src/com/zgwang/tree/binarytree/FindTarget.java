package com.zgwang.tree.binarytree;

import sun.misc.Queue;

public class FindTarget {
	public static boolean findTarget(BinaryTreeNode root, int target){
		if(root == null){
			return false;
		}else{
			if(root.getData() == target){
				return true;
			}else{
				if(findTarget(root.getLeft(), target)){
					return true;
				}else{
					return findTarget(root.getRight(), target);
				}
			}
		}
	}
	public static boolean findTarget2(BinaryTreeNode root, int target) throws Exception{
		if(root == null){
			return false;
		}
		Queue<BinaryTreeNode> q = new Queue<BinaryTreeNode>();
		q.enqueue(root);
		while(!q.isEmpty()){
			BinaryTreeNode temp = q.dequeue();
			if(temp.getData() == target){
				return true;
			}
			if(temp.getLeft() != null){
				q.enqueue(temp.getLeft());
			}
			if(temp.getRight() != null){
				q.enqueue(temp.getRight());
			}
		}
		return false;
	}
}
