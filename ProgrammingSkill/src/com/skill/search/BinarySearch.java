package com.skill.search;

import java.util.Scanner;

public class BinarySearch {

	private static Scanner scanner;

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
		System.out.println(" " + bSearch(arr, ele));
		if (bSearch(arr, ele) == -1) {
			System.out.println("Element no present " + bSearch(arr, ele));
		} else {
			System.out.println("Element present at " + bSearch(arr, ele));
		}
	}

	public static int bSearch(int[] arr, int ele) {

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;
			if (ele == arr[mid]) {
				return mid;
			} else if (ele < arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}

}
