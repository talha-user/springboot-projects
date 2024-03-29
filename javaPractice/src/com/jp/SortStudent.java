package com.jp;
//
//import java.util.ArrayList;
//import java.util.Collections;
//
//
//public class SortStudent {
//	
////	
//	
//
//		public static void main (String [] args) {
//
//		char ch [] = {'T', 'e', 'l', 'u', 's', 'k', 'o'};
//
//		String st1 = new String(ch);
//
//		String st2 = new String(st1);
//
//		System.out.println(st1);
//
//		System.out.println(st2);
//		
//
//}}
interface MyCode{

double myScore();

}

public class SortStudent {

public static void main(String[] args) {

MyCode myScore = () ->  87;
   
System.out.println(myScore.myScore());

}

}