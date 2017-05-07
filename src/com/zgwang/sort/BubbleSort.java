package com.zgwang.sort;
/**
 * 最坏O(n*n), 最好O(n), 平均O(n*n)
 * 检查输入序列是否已经排序
 * @author zgwang
 *
 */
public class BubbleSort {
	public static void sort(int[] a){
		for(int i = a.length - 1; i >= 0; i--){
			for(int j = 0; j <= i - 1; j++){
				if(a[j] > a[j + 1]){
					a[j] = (a[j + 1] + a[j])- (a[j + 1] = a[j]);
				}
			}
		}
	}
	
	public static void sortUpdate(int[] a){
		boolean tag = true;
		for(int i = a.length - 1; i >= 0 && tag; i--){
			tag = false;
			for(int j = 0; j <= i - 1; j++){
				if(a[j] > a[j + 1]){
					a[j] = a[j + 1] + a[j] - (a[j + 1] = a[j]);
					tag = true;
				}
			}
		}
	}
}
