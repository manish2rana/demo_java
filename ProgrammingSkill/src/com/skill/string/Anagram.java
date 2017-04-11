package com.skill.string;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		System.out.println("Enter string 1");
		String st1 = sc.next();
		System.out.println("Enter string 2");
		String st2 = sc.next();

		if (st1.length() == st2.length()) {
			char ch1[] = st1.toLowerCase().toCharArray();
			Arrays.sort(ch1);
			char ch2[] = st2.toLowerCase().toCharArray();
			Arrays.sort(ch2);

			System.out.println(Arrays.equals(ch1, ch2));

		} else {
			System.out.println(false);
		}
	}
}
