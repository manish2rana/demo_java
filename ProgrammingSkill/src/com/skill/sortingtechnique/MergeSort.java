package com.skill.sortingtechnique;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
		mergeSort(input);
		System.out.println(Arrays.toString(input));
	}

	static void mergeSort(int[] unSortedArray) {
		if (unSortedArray.length > 1) {
			int q = unSortedArray.length / 2;

			int[] leftArray = Arrays.copyOfRange(unSortedArray, 0, q);
			int[] rightArray = Arrays.copyOfRange(unSortedArray, q, unSortedArray.length);

			mergeSort(leftArray);
			mergeSort(rightArray);

			merge(unSortedArray, leftArray, rightArray);
		}
	}

	static void merge(int[] a, int[] l, int[] r) {
		int totElem = l.length + r.length;
		// int[] a = new int[totElem];
		int i, li, ri;
		i = li = ri = 0;
		while (i < totElem) {
			if ((li < l.length) && (ri < r.length)) {
				if (l[li] < r[ri]) {
					a[i] = l[li];
					i++;
					li++;
				} else {
					a[i] = r[ri];
					i++;
					ri++;
				}
			} else {
				if (li >= l.length) {
					while (ri < r.length) {
						a[i] = r[ri];
						i++;
						ri++;
					}
				}
				if (ri >= r.length) {
					while (li < l.length) {
						a[i] = l[li];
						li++;
						i++;
					}
				}
			}
		}
		// return a;

	}
}
