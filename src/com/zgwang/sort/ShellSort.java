package com.zgwang.sort;
/**
 * �ֳ�������������, 
 * �ȡ���ڼ������, ���O(n), ���O(n*logn*logn), 
 * @author zgwang
 *
 */
public class ShellSort {
	public static void sort(int[] a){
		for(int gap = a.length / 2; gap > 0; gap /= 2){
			for(int i = gap; i < a.length; i++){
				for(int j = i; j >= gap && a[j - gap] > a[j]; j -= gap){
					a[j] = a[j] + a[j - gap] - (a[j - gap] = a[j]);
				}
			}
		}
	}
}	
