package com.zgwang.tree.binarytree;

public class LCA {
	public static BinaryTreeNode lca(BinaryTreeNode root, 
			BinaryTreeNode n1, BinaryTreeNode n2){
		if(root == null){
			return null;
		}
		if(root == n1 || root == n2){
			return root;
		}
		BinaryTreeNode left = lca(root.getLeft(), n1, n2);
		BinaryTreeNode right = lca(root.getRight(), n1, n2);
		if(left != null && right != null){
			return root;
		}else{
			return (left != null)? left : right;
		}
	}
}
