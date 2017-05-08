package com.zgwang.search;

import java.util.HashMap;

public class FirstDuplicate {
	public static int first(int[] a){
		for(int i = 0; i < a.length; i++){
			for(int j = i + 1; j < a.length; j++){
				if(a[i] == a[j]){
					return a[i];
				}
			}
		}
		return -1;
	}
	public static int first2(int[] a){
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(int i = 0; i < a.length; i++){
			if(hm.containsKey(a[i]) && hm.get(a[i]) > 0){
				hm.put(a[i], -hm.get(a[i]));
			}else if(hm.containsKey(a[i]) && hm.get(a[i]) < 0){
				continue;
			}else{
				hm.put(a[i], (i + 1));
			}
		}
		Integer max = Integer.MIN_VALUE;
		for(Integer i : hm.keySet()){
			if(hm.get(i) < 0 && hm.get(i) > max){
				max = hm.get(i);
			}
		}
		return a[-(max + 1)];
	}
}
