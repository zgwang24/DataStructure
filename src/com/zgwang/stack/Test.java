package com.zgwang.stack;

public class Test {
	public static void main(String[] args) {
		// String s = "abccba";
		// System.out.println(StringPalindrome.isPalindrome2(s));
		int[] a = {1, 9, 6, 8, 8, 8, 0, 1, 1, 0, 6, 5};
		int index = RemoveAdjacentDuplicates.remove(a);
		for(int i = 0; i <= index; i++){
			System.out.print(a[i] + " ");
		}
	}
}
