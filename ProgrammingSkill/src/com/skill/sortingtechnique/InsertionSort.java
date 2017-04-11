package com.skill.sortingtechnique;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] input = { 4, 2, 91, 6, 23, 12, 34, 0, 1 };
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(input));
		/*for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + ", ");
		}*/
		System.out.println();
		int[] sortedList = insertionSort(input);
		/*for (int i = 0; i < sortedList.length; i++) {
			System.out.print(sortedList[i] + ", ");
		}*/
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(sortedList));
	}
	
	public static int[] insertionSort(int input[]) {
		
		int j=0;
		for(int i=0;i<input.length;i++){
			int element=input[i];
			j=i;
			while(j>0 && input[j-1]>element){
				input[j]=input[j-1];
				j=j-1;
			}
			input[j]=element;
			//printArray(input,i);
		}
		return input;
	}
	
	public static void printArray(int [] ip,int pass){
		for (int i = 0; i < ip.length; i++) {
			System.out.print("pass["+pass+"]= "+ip[i] + ", ");
		}
		System.out.println();
	}
}
