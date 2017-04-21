package com.zgwang.tree.binarysearchtree;

public class Test {
	public static void main(String[] args) {
		BinarySearchTreeNode n1 = new BinarySearchTreeNode(1);
		BinarySearchTreeNode n2 = new BinarySearchTreeNode(2);
		BinarySearchTreeNode n3 = new BinarySearchTreeNode(3);
		BinarySearchTreeNode n4 = new BinarySearchTreeNode(4);
		BinarySearchTreeNode n5 = new BinarySearchTreeNode(5);
		BinarySearchTreeNode n6 = new BinarySearchTreeNode(6);
		BinarySearchTreeNode n7 = new BinarySearchTreeNode(7);
		BinarySearchTreeNode node = new BinarySearchTreeNode(8);
		n4.setLeft(n2);
		n4.setRight(n6);
		n2.setLeft(n1);
		n2.setRight(n3);
		n6.setLeft(n5);
		n6.setRight(n7);
		// n1.setLeft(node);
		// System.out.println(FindTraget.find(n4, n7));
		// System.out.println(FindTraget.find2(n4, n7));
		// System.out.println(FindMax.findMax(n4));
		// System.out.println(FindMax.findMax2(n4));
		// System.out.println(FindMin.findMin(n4));
		// System.out.println(FindMin.findMin2(n4));
		// System.out.println(FindLCA.find(n4, n1, n7).getData());
		// System.out.println(IsBST.isBST(n4));
		// MidTraverse.getMid(n4);
		System.out.println(FindKMin.findK(n4, 7));
	}
	
}
