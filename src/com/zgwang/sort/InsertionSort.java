package com.zgwang.sort;
/**
 * �O(n*n), ���O(n*n), ƽ��O(n*n)
 * �����ȶ�����
 * �����ڹ鲢�Ϳ��ŵȷ��������㷨�ĵݹ��������
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
