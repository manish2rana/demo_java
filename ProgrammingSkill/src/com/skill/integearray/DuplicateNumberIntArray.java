package com.skill.integearray;

import java.util.Scanner;

public class DuplicateNumberIntArray {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		System.out.print("Enter Length of Array");
		int num = scan.nextInt();

		int[] arr = new int[num];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}

		double[] unique = new double[arr.length];
		for (int i = 0; i < unique.length; i++) {
			unique[i] = -.5;
		}

		for (int i = 0; i < arr.length; i++) {

			boolean flag = true;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					flag = false;
				}
			}
			if (!flag) {
				unique[i] = arr[i];
			}
		}

		for (int i = 0; i < unique.length; i++) {
			if (!(unique[i] == -.5)) {
				System.out.println((int) (unique[i]));
			}
		}
	}

}
