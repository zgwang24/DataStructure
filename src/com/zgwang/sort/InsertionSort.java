package com.zgwang.sort;
/**
 * 最坏O(n*n), 最好O(n*n), 平均O(n*n)
 * 属于稳定排序
 * 可用于归并和快排等分治排序算法的递归基础情形
 * @author zgwang
 *
 */
public class InsertionSort {
	public static void sort(int[] a){
		for(int i = 1; i < a.length; i++){
			for(int j = i; j > 0 && a[j - 1] > a[j]; j--){
				a[j] = a[j] + a[j - 1] - (a[j - 1] = a[j]);
			}
		}
	}
}
