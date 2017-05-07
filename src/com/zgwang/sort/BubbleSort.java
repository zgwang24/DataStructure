package com.zgwang.sort;
/**
 * �O(n*n), ���O(n), ƽ��O(n*n)
 * ������������Ƿ��Ѿ�����
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
