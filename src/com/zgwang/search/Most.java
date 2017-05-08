package com.zgwang.search;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Most {
	public static int most(int[] a){
		int count, max = 0;
		for(int i = 0; i < a.length; i++){
			count = 0;
			for(int j = 0; j < a.length; j++){
				if(a[i] == a[j]){
					count++;
				}
			}
			if(count > max){
				max = count;
			}
		}
		return max;
	}
	public static int most2(int[] a){
		int max = 0;
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(int i = 0; i < a.length; i++){
			if(hm.containsKey(a[i])){
				hm.put(a[i], hm.get(a[i]) + 1);
			}else{
				hm.put(a[i], 1);
			}			
		}
		Iterator<Entry<Integer, Integer>> iter = hm.entrySet().iterator();
		while(iter.hasNext()){
			Entry<Integer, Integer> entry = iter.next();
			if(entry.getValue() > max){
				max = entry.getValue();
			}
		}
		return max;
	}
}
