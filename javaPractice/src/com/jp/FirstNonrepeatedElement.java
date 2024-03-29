package com.jp;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonrepeatedElement {
	
	
	public static char firstNonRepeatedElement(String str) throws Exception {
		Map<Character,Integer> map = new LinkedHashMap<>();
		for(char ch: str.toCharArray()) {
			map.put(ch, map.containsKey(ch)?map.get(ch)+1:1);
		}
		for(Entry<Character,Integer> entry: map.entrySet()) {
			if(entry.getValue()==1)
				return entry.getKey();
		}
	throw new Exception("Did'nt find");
		
	}
	public static void main(String[] args) throws Exception {
		String str = "aabbde";
		System.out.println(firstNonRepeatedElement(str));
		
	}

}
