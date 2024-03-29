package com.jp;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromString {
	
	public static String removeDuplicates(String str) {
		Set<Character> set = new HashSet<>();       /* Set does not preserve insertion order and do not allow
		                                               duplicates, contains only unique values*/
		                                        
		StringBuffer sf = new StringBuffer();
		int n = str.length();
		System.out.println(n);
		
			char[] charArray = str.toCharArray();
			 for (char ch: charArray) {
			         if(set.add(ch))
			             sf.append(ch);
			 }
		return sf.toString();
	}
	

	public static void main(String[] args) {
		String str = "sandeep";
		System.out.println(removeDuplicates(str));
		

	}

}
