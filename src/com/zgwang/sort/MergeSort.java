package com.zgwang.sort;
/**
 * �O(n*logn), ���O(n*logn), ƽ��O(n*logn); �ռ�O(n)
 * �鲢���������ȶ�����
 * @author zgwang
 *
 */
public class MergeSort {
	public static int[] aux;
	public static void sort(int[] a){
		aux = new int[a.length];
		sort(a, 0, a.length - 1);
	}
	private static void sort(int[] a, int lo, int hi) {		
		if(hi <= lo){
			return ;
		}
		int p = lo + (hi - lo) / 2;
		sort(a, lo, p - 1);
		sort(a, p + 1, hi);
		merge(a, lo, p, hi);
	}
	private static void merge(int[] a, int lo, int p, int hi) {
		int i = lo;
		int j = p + 1;
		for(int k = lo; k <= hi; k++){
			aux[k] = a[k];
		}
		for(int k = lo; k <= hi; k++){
			if(i > p){
				a[k] = aux[j++];
			}else if(j > hi){
				a[k] = aux[i++];
			}else if(aux[i] < aux[j]){
				a[k] = aux[i++];
			}else{
				a[k] = aux[j++];
			}
		}
	}
}
