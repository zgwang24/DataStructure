package com.zgwang.queue;

import java.util.Queue;
import java.util.Stack;

public class ReverseK {
	public static Queue<Integer> reverseK(Queue<Integer> q, int k){
		if(q == null || k > q.size() || k < 0){
			return null;
		}else{
			Stack<Integer> s = new Stack<Integer>();
			for(int i = 0; i < k; i++){
				s.push(q.remove());
			}
			while(!s.isEmpty()){
				q.add(s.pop());
			}
			for(int i = 0; i < q.size() - k; i++){
				q.add(q.remove());
			}
			return q;
		}
	}
}
