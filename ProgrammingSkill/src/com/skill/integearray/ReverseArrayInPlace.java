package com.skill.integearray;

import java.util.Arrays;

public class ReverseArrayInPlace {

	public static void main(String[] args) {
		int[] arr={4,8,5,3,9,2,1};
		System.out.println("Before reverse");
		System.out.println(Arrays.toString(arr));
		System.out.println("After reverse");
		for(int i=0,j=arr.length-1;i<arr.length/2;i++,j--){
			if(i!=j){
				int last=arr[j];
				int first=arr[i];
				arr[i]=last;
				arr[j]=first;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
