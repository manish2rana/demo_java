package com.skill.sortingtechnique;

public class BubbleSort {

	public static void main(String[] args) {
		int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
		int[] srtArray = bubble_srt(input);
		for (int i = 0; i < srtArray.length; i++) {
			System.out.print(srtArray[i] + ", ");
		}
	}

	public static int[] bubble_srt(int[] input) {
		for (int i = 0; i < input.length; i++) {
			boolean flag = false;
			for (int j = 0; j < input.length-1; j++) {
				if (input[j] > input[j + 1]) {
					int temp = input[j];
					input[j] = input[j + 1];
					input[j + 1] = temp;
					flag = true;
				}
			}
			printPasses(input, i);
			if (!flag) {
				break;
			}
		}
		return input;
	}

	public static void printPasses(int[] input, int pass) {
		System.out.println("Pass "+pass);
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i]+", ");
		}
		System.out.println();
	}
}
