package com.zgwang.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PairQueue {
	public static boolean pair(Stack<Integer> s){
		Queue<Integer> q = new LinkedList<Integer>();
		while(!s.isEmpty()){
			q.add(s.pop());
		}
		while(!q.isEmpty()){
			s.push(q.poll());
		}
		while(!s.isEmpty()){
			int n = s.pop();
			if(!s.isEmpty()){
				int m = s.pop();
				if(Math.abs(m - n) != 1){
					return false;
				}
			}
		}
		return true;
	}
}
