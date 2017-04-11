package com.skill.sortingtechnique;

import java.util.Arrays;

public class BucketSort {

	public static void main(String[] args) {
		int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
		int maxVal=0;
		for (int i = 0; i < input.length; i++) {
			if(maxVal<input[i]){
				maxVal=input[i];
			}
		}
		System.out.println("unsorted array "+Arrays.toString(input));
		bucketSort(input, maxVal);
		System.out.println("sorted array  "+Arrays.toString(input));
	}
	
	public static void bucketSort(int[] a, int maxVal) {
	      int [] bucket=new int[maxVal+1];
	 
	      for (int i=0; i<bucket.length; i++) {
	         bucket[i]=0;
	      }
	 
	      for (int i=0; i<a.length; i++) {
	         bucket[a[i]]++;
	      }
	 
	      int outPos=0;
	      for (int i=0; i<bucket.length; i++) {
	         for (int j=0; j<bucket[i]; j++) {
	            a[outPos++]=i;
	         }
	      }
	   }

}
