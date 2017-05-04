package com.zgwang.stack;

public class RemoveAdjacentDuplicates {
	public static int remove(int[] a){
		int ptr = -1;
		int i = 0;
		while(i < a.length){
			if(ptr == -1 || a[ptr] != a[i]){
				ptr++;
				a[ptr] = a[i];
				i++;
			}else{
				while(i < a.length && a[ptr] == a[i]){
					i++;
				}
				ptr--;
			}
		}
		return ptr;
	} 
}
