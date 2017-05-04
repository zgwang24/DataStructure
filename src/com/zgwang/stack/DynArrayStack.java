package com.zgwang.stack;

public class DynArrayStack {
	private int top;
	private int capacity;
	private int[] array;
	
	public DynArrayStack(){
		capacity = 1;
		array = new int[capacity];
		top = -1;
	}
	
	public boolean isEmpty(){
		return (top == -1);
	}
	
	public boolean isStackFull(){
		return (top == capacity - 1);
	} 
	
	public void push(int data){
		if(isStackFull()){
			doubleStack();
		}
		array[++top] = data;
	}

	private void doubleStack() {
		
	}
	
	public int pop(){
		if(isEmpty()){
			System.out.println("Stack is Empty");
			return 0;
		}else{
			return array[top--];
		}
	}
	
	public void clearStack(){
		top = -1;
	}
}
