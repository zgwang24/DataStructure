package com.zgwang.heap;

public class HeapSort {
	
	public static void sort(int[] a, int n){
		Heap h = new Heap(n, 0);
		int old_size, i;
		h.BuildHeap(h, a, n);
		old_size = h.count;
		for(i = n - 1; i > 0; i--){
			h.array[0] = h.array[h.count - 1];
			h.count--;
			h.PercolateDown(i);
		}
		h.count = old_size;
	}
}
