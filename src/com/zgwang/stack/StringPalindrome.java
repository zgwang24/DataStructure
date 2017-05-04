package com.zgwang.stack;

import java.util.Stack;

public class StringPalindrome {
	public static boolean isPalindrome(String str){
		int i = 0, j = str.length() - 1;
		while(i < j && str.charAt(i) == str.charAt(j)){
			i++;
			j--;
		}
		if(i < j){
			return false;
		}else{
			return true;
		}
	}
	
	public static boolean isPalindrome2(String str){
		char[] c = str.toCharArray();
		Stack<Character> s = new Stack<Character>();
		for(int i = 0; i < c.length; i++){
			s.push(c[i]);
		}
		for(int i = 0; i < c.length; i++){
			if(c[i] != s.pop()){
				return false;
			}
		}
		return true;
	}
}
