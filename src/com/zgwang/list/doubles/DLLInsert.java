package com.zgwang.list.doubles;

public class DLLInsert {
	public static DLLNode insert(DLLNode root, DLLNode n, int pos){
		if(root == null){
			return n;
		}
		int size = DLLSize.getSize(root);
		if(pos < 0 || pos > size){
			System.out.println("The position is error.");
			return root;
		}
		if(pos == 0){
			n.setNext(root);
			n.setPrevious(null);
			root.setPrevious(n);
			return n;
		}else{
			DLLNode previous = root;
			for(int i = 1; i < pos; i++){
				previous = previous.getNext();
			}
			DLLNode temp = previous.getNext();
			if(temp == null){
				previous.setNext(n);				
				n.setPrevious(previous);
				n.setNext(null);
			}else{
				previous = temp.getPrevious();
				previous.setNext(n);
				n.setPrevious(previous);
				n.setNext(temp);
				temp.setPrevious(n);
			}
			return root;
		}
	}
}
