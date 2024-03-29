package com.jp;

import java.util.Arrays;

public class RemoveElementFromArray {
	/* When element in the given array is sorted, we find index of the element using binary search algo 
	 * and then shift the element from right to left..*/
	public static int binarySearch(int[] array, int low, int high, int key) {
		if(high<low)
			return -1;
		int mid = (low+high)/2;
		if(array[mid]==key)
			return mid;
		if(key<array[mid])
			return binarySearch(array,low,mid-1,key);
		return binarySearch(array,mid+1,high,key);
	}
	
	
	public static int deleteElement(int[] array, int n, int key) {
		int pos = binarySearch(array,0,n-1,key);
		if(pos==-1) {
			System.out.println("Element not found");
		}
		for(int i=pos; i<n-1; i++) {
			array[i] = array[i+1];
		}
		return n-1;
	}
	
	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5};
		int n = array.length;
		int key = 3;
		
		System.out.println("Array before deletion: \n"+Arrays.toString(array));	
		
		n = deleteElement(array,n,key);
		System.out.println("Array after deletion: ");
		for(int i=0; i<n; i++) {
			System.out.print(array[i]+" ");
		}
		
	}

}
