package com.zgwang.queue;

import java.util.LinkedList;
import java.util.Queue;
public class Test {
	public static void main(String[] args) throws Exception {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(11);
		q.add(12);
		q.add(13);
		q.add(14);
		q.add(15);
		q.add(16);
		q.add(17);
		q.add(18);
		q.add(19);
		q.add(20);
		q = InterQueue.inter(q);
		while(!q.isEmpty()){
			System.out.print(q.remove() + " ");
		}
		/*Stack<Integer> s = new Stack<Integer>();
		s.push(3);
		s.push(4);
		s.push(7);
		s.push(9);
		s.push(1);
		System.out.println(PairQueue.pair(s));*/
	}
}
