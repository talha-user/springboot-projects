package com.jp;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8_Programes {

	public static void main(String[] args) {
		String str = "aabbccs";
		 
				
		System.out.println(Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
				 .entrySet().stream().filter(x->x.getValue()==1).findFirst().get().getKey());

	}

}
