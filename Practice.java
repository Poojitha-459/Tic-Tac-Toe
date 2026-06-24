package com.tasks;

public class Practice {

	public static void main(String[] args) {
		int[] arr1 = { 1,2,4,5};
		int[] arr2= {5,8,2,1,3};
		int[]merged=new int[arr1.length+arr2.length];
		System.out.println("merged sort");
		for(int i=0;i<arr1.length;i++) {
			merged[i]=arr1[i];
		}
		for(int i=0;i<arr2.length;i++) {
			merged[arr1.length+i]=arr2[i];
		}
		for(int i=0;i<merged.length;i++) {
			System.out.println(merged[i]+" ");
		}
		
	}
}