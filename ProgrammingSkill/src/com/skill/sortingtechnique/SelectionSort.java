package com.skill.sortingtechnique;

public class SelectionSort {
	public static void main(String[] args) {
		int[] input = { 4, 62, 9, 6, 23, 12, 34,1,44 };
		int[] sortedList = selectionSort(input);
		for (int i = 0; i < sortedList.length; i++) {
			System.out.print(sortedList[i] + ", ");
		}
	}

	public static int[] selectionSort(int input[]) {
		int i, j, min, temp;
		for (i = 0; i < input.length; i++) {
			min = i;
			for (j = i + 1; j < input.length; j++) {
				if (input[j] < input[min]) {
					min = j;
				}
			}
			temp = input[i];
			input[i] = input[min];
			input[min] = temp;
		}
		return input;
	}
}
