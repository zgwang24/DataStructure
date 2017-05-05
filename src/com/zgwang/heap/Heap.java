package com.zgwang.heap;
/**
 * 堆的性质：所有节点的值必须都大于或等于（小于或等于）其孩子节点的值；堆应该是一颗完全二叉树。
 * @author zgwang
 *
 */
public class Heap {
	public int[] array;
	public int count;
	public int capacity;
	public int heap_type;
	
	public Heap(int capacity, int heap_type){
		this.heap_type = heap_type;
		this.count = 0;
		this.capacity = capacity;
		this.array = new int[capacity];
	}
	public int Parent(int i){
		if(i <= 0 || i >= this.count){
			return -1;
		}
		return (i - 1) / 2;
	}
	
	public int LeftChild(int i){
		int left = 2 * i + 1;
		if(left > this.count){
			return -1;
		}
		return left;
	}
	
	public int RightChild(int i){
		int right = 2 * i + 1;
		if(right > this.count){
			return -1;
		}
		return right;
	}
	public int GetMaximum(int i){
		if(this.count == 0){
			return -1;
		}
		return this.array[0];
	}
	public void PercolateDown(int i){
		int l, r, max;
		l = LeftChild(i);
		r = RightChild(i);
		if(l != -1 && this.array[l] > this.array[i]){
			max = l;
		}else{
			max = i;
		}
		if(r != -1 && this.array[r] > this.array[i]){
			max = r;
		}
		if(max != i){
			this.array[i] = this.array[i] + this.array[max] - (this.array[max] = this.array[i]);
		}
		PercolateDown(max);
	}
	public int DeleteMax(){
		if(this.count == 0){
			return -1;
		}
		int data = this.array[0];
		this.array[0] = this.array[this.count - 1];
		this.count--;
		PercolateDown(0);
		return data;
	}
	public void Insert(int data){
		int i;
		this.count++;
		i = this.count - 1;
		while(i >= 0 && data > this.array[(i - 1) / 2]){
			this.array[i] = this.array[(i - 1) / 2];
			i = (i - 1) / 2;
		}
		this.array[i] = data;
	}
	public void DestroyHeap(){
		this.count = 0;
		this.array = null;
	}
	public void BuildHeap(Heap h, int[] a, int n){
		if(h == null){
			return ;
		}
		for(int i = 0; i < n; i++){
			h.array[i] = a[i];
		}
		this.count = n;
		for(int i = (n - 1)/2; i >= 0; i--){
			h.PercolateDown(i);
		}
	}
}
