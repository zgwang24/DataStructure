package com.zgwang.tree.binarytree;

public class Test {
	public static void main(String[] args) throws Exception {
		BinaryTreeNode n1 = new BinaryTreeNode(1);
		BinaryTreeNode n2 = new BinaryTreeNode(2);
		BinaryTreeNode n3 = new BinaryTreeNode(3);
		BinaryTreeNode n4 = new BinaryTreeNode(4);
		BinaryTreeNode n5 = new BinaryTreeNode(5);
		BinaryTreeNode n6 = new BinaryTreeNode(6);
		BinaryTreeNode n7 = new BinaryTreeNode(7);
		BinaryTreeNode n8 = new BinaryTreeNode(8);
		n1.setLeft(n2);
		n1.setRight(n3);
		n2.setLeft(n4);
		n2.setRight(n5);
		n3.setLeft(n6);
		n3.setRight(n7);
		n7.setRight(n8);
		// System.out.println(FindMax.findMax(n1));
		// System.out.println(FindMax.findMax2(n1));
		// System.out.println(FindTarget.findTarget(n1, 4));
		// System.out.println(FindTarget.findTarget2(n1, 4));
		// System.out.println(CountNode.countNode(n2));
		// System.out.println(CountNode.countNode2(n2));
		// ReverseLevelOut.reverseLevelOut(n1);
		System.out.println(HighOfBT.getHight(n1));
	}
}
