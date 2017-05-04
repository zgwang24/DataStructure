package com.zgwang.queue;

import java.util.Queue;
import java.util.Stack;

public class InterQueue {
	public static Queue<Integer> inter(Queue<Integer> q){
		if(q.size() % 2 != 0){
			return null;
		}
		Stack<Integer> s = new Stack<Integer>();
		int half = q.size() / 2;
		for(int i = 0; i < half; i++){
			s.push(q.remove());
		}
		while(!s.isEmpty()){
			q.add(s.pop());
		}
		for(int i = 0; i < half; i++){
			q.add(q.remove());
		}
		for(int i = 0; i < half; i++){
			s.push(q.remove());
		}
		while(!s.isEmpty()){
			q.add(s.pop());
			q.add(q.remove());
		}
		return q;
	}
}
