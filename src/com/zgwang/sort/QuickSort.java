package com.zgwang.sort;
/**
 * 最坏O(n*n), 最好O(n*logn), 平均O(n*logn)
 * 快速排序属于不稳定排序，采用分治思想
 * @author zgwang
 *
 */
public class QuickSort {
	public static void sort(int[] a){
		sort(a, 0, a.length - 1);
	}

	private static void sort(int[] a, int lo, int hi) {
		if(hi <= lo){
			return ;
		}
		int mid = part(a, lo, hi);
		sort(a, lo, mid - 1);
		sort(a, mid + 1, hi);
	}

	private static int part(int[] a, int lo, int hi) {
		int i = lo;
		int j = hi + 1;
		int v = a[lo];
		while(true){
			while(a[++i] < v){
				if(i == hi){
					break;
				}
			}
			while(a[--j] > v){
				if(j == lo){
					break;
				}
			}
			if(i >= j){
				break;
			}
			a[i] = a[i] + a[j] - (a[j] = a[i]);
		}
		a[j] = a[j] + a[lo] - (a[lo] = a[j]);
		return j;
	}
}
