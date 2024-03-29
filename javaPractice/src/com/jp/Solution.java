package com.jp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.StringJoiner;
import java.util.TreeSet;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution {
	
	public static void main(String[] args) {
//		List<String> langList = Arrays.asList("Java","Ruby","PHP");
//		String lang = langList.stream().map(String::valueOf).collect(Collectors.joining(","));
//		System.out.println(lang);
		
//		Stream<String> empStream = Stream.empty();
//		System.out.println(empStream);
//		System.out.println(Stream.empty());
//		System.out.println(Stream.empty());
//	    StringJoiner stringJoiner = new StringJoiner(":","[","]");
//	    stringJoiner.add("Peter");
//	    stringJoiner.add("Peter");
//	    System.out.println(stringJoiner);
//	    System.out.println(Integer.parseUnsignedInt("4294967295"));
		
//	Map<String,Double> map = new HashMap<>();
//	map.put("Lenovo",34450.00);
//	map.put("Apple",92500.00);
//	map.put("Toshiba", 53600.00);
//	map.forEach((k,v)->{System.out.println("key: "+k+" Value: "+v);});
//	}
//		List<Integer> list = IntStream.range(1, 100).boxed().collect(Collectors.toCollection(ArrayList::new));
//		System.out.println(list);
//		Predicate<String> predicate = (t)->t.contains("ab");
//		System.out.println(predicate.test("abcgh"));
//		Supplier<Float> sup = () -> (float)Math.random();
//		System.out.println(sup.get());
//		
//		
//		Function<Integer,String> fun= (t)-> t.toString();
//		System.out.println(fun.apply(0xA));
//		
//		Optional<String> opt = Optional.of("Talha");
//		
//		System.out.println(opt.map(p->p.concat(" khan")).get());
//        
//		File file = new File("myfile.txt");
//		try {
//			if(file.createNewFile())
//				System.out.println("Created "+file.getName());
//			else
//				System.out.println(file.getName()+" Already exist");
//		}
//		catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
//		try {
//			FileWriter writer = new FileWriter("myfile.txt");
//			writer.write("Hello this is a demo file created using File() class");
//			writer.close();
//			System.out.println("Successfully written");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		//File file = new File("myfile1.txt");
////		try {
////			file.createNewFile();
////		} catch (IOException e) {
////			// TODO Auto-generated catch block
//		e.printStackTrace();
//		}
//		try {
//			Scanner sc = new Scanner(file);
//			while(sc.hasNext()) {
//				System.out.println(sc.nextLine());
//			}
//			sc.close();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		

		//		if(file.delete())
//			System.out.println(file.getName()+" Deleted");
//		else
//			System.out.println(file.getName()+"Not Deleted");
//		Map<String,Double> map = new HashMap<>();
//		map.put("Lenovo", 34450.00);
//		map.put("Apple", 92500.00);
//		map.put("Toshiba", 53600.00);
//		map.forEach((k,v)->{System.out.println("Key: "+k+" value:"+v);});
//		
//	    HashSet<Integer> list = (HashSet<Integer>) (IntStream.range(10, 20).boxed().collect(Collectors.toSet()));
//		System.out.println(list);
//		String str[] = {"a","b"};
//		int count=0; 
//		while(str[count++]!=null) {
//			System.out.println(count);
//		}
//		System.out.println(count);
//		int x=0, y=10;
//		Solution s = new Solution();
//		while(x<3) {
//			x++;
//			y--;
//		}
//		System.out.println("x = "+x+" y = "+y);
//		Optional<String> optional = Optional.of("null");
//		Optional<Object> empty = Optional.ofNullable("null");
//		System.out.println(empty.get());
//		StringJoiner joinNames = new StringJoiner(",");
//		joinNames.add("Rahul"); 
//        joinNames.add("Raju"); 
//        StringJoiner joinNames2 = new StringJoiner(":", "[", "]"); 
//        joinNames2.add("Peter"); 
//        joinNames2.add("Raheem");
//        StringJoiner merge = joinNames.merge(joinNames2); 
//        System.out.println(joinNames2);
//        System.out.println(merge);   // Output: [Rahul,Raju,Peter:Raheem]
//		
		System.out.println("\nhello\nworld");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}}
