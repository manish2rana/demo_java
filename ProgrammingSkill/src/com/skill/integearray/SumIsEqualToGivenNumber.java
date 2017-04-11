package com.skill.integearray;

import java.util.Arrays;

/** 
 * Java Program to find pairs on integer array whose sum is equal to k 
 *  @author Manish 
 */

public class SumIsEqualToGivenNumber {

	public static void main(String[] args) {
		int[] numbers = { 2, 4, 3, 5, 7, 8, 9 }; 
		int[] numbersWithDuplicates = { 2, 4, 3, 5, 6, -2, 4, 7, 8, 9 }; 
		prettyPrint(numbers, 7); 
		prettyPrint(numbersWithDuplicates, 7);


	}

	public static void printPairs(int[] array, int sum) {
		
		for(int i=0;i<array.length;i++){
			int first=array[i];
			for(int j=i+1;j<array.length;j++){
				int second=array[j];
				if((first+second)==sum){
					System.out.println(first+" + "+second+" = "+sum);
				}
			}
		}
	}

	public static void prettyPrint(int[] givenArray, int givenSum){
		System.out.println("Given array : " + Arrays.toString(givenArray));
		System.out.println("Given sum : " + givenSum); 
		System.out.println("Integer numbers, whose sum is equal to value : " + givenSum); 
		printPairs(givenArray, givenSum);

	}
	     
		
	
}
