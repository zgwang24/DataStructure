package com.zgwang.search;

public class LinearSearch {
	public static boolean unsorted(int[] a, int v){
		for(int i = 0; i < a.length; i++){
			if(a[i] == v){
				return true;
			}
		}
		return false;
	}
	public static boolean sorted(int[] a, int v){
		for(int i = 0; i < a.length; i++){
			if(a[i] == v){
				return true;
			}else if(a[i] > v){
				return false;
			}
		}
		return false;
	}
	public static boolean binary(int[] a, int v){
		int mid, lo = 0, hi = a.length - 1;
		while(lo <= hi){
			mid = lo + (hi - lo) / 2;
			if(a[mid] == v){
				return true;
			}else if(a[mid] < v){
				lo = mid + 1;
			}else{
				hi = mid - 1;
			}
		}
		return false;
	}
	public static boolean binary2(int[] a, int lo, int hi, int v){
		if(lo <= hi){
			int mid = lo + (hi - lo) / 2;
			if(a[mid] == v){
				return true;
			}else if(a[mid] < v){
				return binary2(a, mid + 1, hi, v);
			}else{
				return binary2(a, lo, mid - 1, v);
			}
		}else{
			return false;
		}
		
	}
}
