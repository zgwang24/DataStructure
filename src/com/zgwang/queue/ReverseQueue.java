package com.zgwang.queue;

import java.util.Stack;

import sun.misc.Queue;

public class ReverseQueue {
	public static Queue<Integer> reverse(Queue<Integer> q) throws Exception{
		Stack<Integer> s = new Stack<Integer>();
		while(!q.isEmpty()){
			s.push(q.dequeue());
		}
		while(!s.isEmpty()){
			q.enqueue(s.pop());
		} 
		return q;
	}
}
