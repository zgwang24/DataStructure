package com.zgwang.search;

import java.util.HashMap;

import com.zgwang.sort.QuickSort;

public class Lost {
	public static int lost(int[] a, int n){
		int found;
		for(int i = 1; i <= n; i++){
			found = 0;
			for(int j = 0; j < a.length; j++){
				if(i == a[j]){
					found = 1;
				}
			}
			if(found != 1){
				return i;
			}
		}
		return -1;
	}
	public static int lost2(int[] a){
		QuickSort.sort(a);
		for(int i = 0; i < a.length; i++){
			if(a[i] != (i + 1)){
				return i + 1;
			}
		}
		return -1;
	}
	/*public static int lost3(int[] a, int n){
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(int i = 0; i < a.length; i++){
			
		}
	}*/
	public static int lost4(int[] a, int n){
		int sum = 0;
		for(int i = 0; i < a.length; i++){
			sum += a[i]; 
		}
		return (1 + n) * n /2 - sum;
	}
}
