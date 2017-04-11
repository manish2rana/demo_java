package com.skill.search;

import java.util.Scanner;

public class LinearSearch {
	public static Scanner scanner;
	public static void main(String[] args) {
		System.out.println("Enter no of elements");
		scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = scanner.nextInt();
		}

		System.out.println("Enter the element to search");
		int ele = scanner.nextInt();
		
		for(int i=0;i<arr.length;i++){
			if(ele==arr[i]){
				System.out.println("Found at position "+(i+1));
			}
		}

	}

}
