package com.zgwang.sort;
/**
 * 
 */
import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int[] a = {2, 5, 3, 1, 8, 6, 9, 4, 7};
		// BubbleSort.sortUpdate(a);
		// System.out.println(Arrays.toString(a));
		// SelectionSort.sort(a);
		// System.out.println(Arrays.toString(a));
		// InsertionSort.sort(a);
		// System.out.println(Arrays.toString(a));
		// ShellSort.sort(a);
		// System.out.println(Arrays.toString(a));
		// MergeSort.sort(a);
		// System.out.println(Arrays.toString(a));
		QuickSort.sort(a);
		System.out.println(Arrays.toString(a));
	}
}
