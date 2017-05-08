package com.zgwang.search;

import java.util.HashMap;
import java.util.HashSet;

import com.zgwang.sort.BubbleSort;
import com.zgwang.sort.QuickSort;

public class Duplicates {
	public static boolean duplicates(int[] a){
		for(int i = 0; i < a.length; i++){
			for(int j = i + 1; j < a.length; j++){
				if(a[i] == a[j]){
					return true;
				}
			}
		}
		return false;
	}
	public static boolean duplicates2(int[] a){
		QuickSort.sort(a);
		for(int i = 1; i < a.length; i++){
			if(a[i] == a[i - 1]){
				return true;
			}
		}
		return false;
	}
	public static boolean duplicates3(int[] a){
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i = 0; i < a.length; i++){
			if(!set.add(a[i])){
				return true; 
			}
		}
		return false;
	}
	public static boolean duplicates4(int[] a){
		for(int i = 0; i < a.length; i++){
			if(a[a[i]] >= 0){
				a[a[i]] = -a[a[i]];
			}else{
				return true;
			}			
		}
		return false;
	}
}
