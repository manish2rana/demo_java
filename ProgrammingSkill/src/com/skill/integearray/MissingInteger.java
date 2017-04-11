package com.skill.integearray;

import java.util.Arrays;
import java.util.BitSet;

public class MissingInteger {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 6, 8, 9, 7 };
		int size = 10;
		//int expectedSum = size * (size + 1) / 2;
		int sum = 0;
		for (int a : arr) {
			sum = sum + a;
		}
		//Arrays.asList(arr);

		//System.out.println("Missing no is " + (expectedSum - sum));
		printMissingNumber(arr, size);

	}

	private static void printMissingNumber(int[] numbers, int count) {
		int missingCount = count - numbers.length;
		BitSet bitSet = new BitSet(count);

		for (int num : numbers) {
			bitSet.set(num - 1);
		}
		System.out
				.printf("Missing numbers in integer array %s, with total number %d is %n",
						Arrays.toString(numbers), count);
		int lastMissingIndex = 0;
		for (int i = 0; i < missingCount; i++) {
			lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
			System.out.println(++lastMissingIndex);
		}

	}

}
