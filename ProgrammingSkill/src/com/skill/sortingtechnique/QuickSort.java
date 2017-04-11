package com.skill.sortingtechnique;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };

		int low = 0;
		int high = input.length-1;
		System.out.println("Before Sort ");
		System.out.println(Arrays.toString(input));
		quickSort(input, low, high);
		System.out.println("After Sort ");
		System.out.println(Arrays.toString(input));
		/*
		 * for (int i = 0; i < sortedList.length; i++) {
		 * System.out.print(sortedList[i] + ", "); }
		 */

	}

	public static void quickSort(int[] arr, int low, int high) {
		if (arr == null || arr.length == 0)
			return;

		if (low >= high)
			return;

		// pick the pivot
		int middle = low + (high - low) / 2;
		int pivot = arr[middle];

		// make left < pivot and right > pivot
		int i = low, j = high;
		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
			}
			while (arr[j] > pivot) {
				j--;
			}

			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}

		// recursively sort two sub parts
		if (low < j)
			quickSort(arr, low, j);

		if (high > i)
			quickSort(arr, i, high);
	}

}
