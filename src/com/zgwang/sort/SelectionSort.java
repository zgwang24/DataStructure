package com.zgwang.sort;
/**
 * 最坏O(n*n), 最好O(n), 平均O(n*n)
 * 原地排序算法
 * @author zgwang
 *
 */
public class SelectionSort {
	public static void sort(int[] a){
		int min;
		for(int i = 0; i < a.length - 1; i++){
			min = i;
			for(int j = i + 1; j < a.length; j++){
				if(a[min] > a[j]){
					min = j;
				}
			}
			a[min] = a[min] + a[i] - (a[i] = a[min]);
		}
	}
}
