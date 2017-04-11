package com.skill.string;

import java.util.Scanner;

public class Palindrome {

	private static Scanner scanner;
	public static void main(String[] args) {
		
		System.out.println("Enter String = ");
		scanner = new Scanner(System.in);
		String s=scanner.next();
		isPalindrome(s);
	}
	public static void isPalindrome(String str) {
		char [] ch=str.toLowerCase().toCharArray();
		StringBuilder builder=new StringBuilder();
		for(int i=ch.length-1;i>=0;i--){
			builder.append(ch[i]);
		}
		if(builder.toString().equalsIgnoreCase(str)){
			System.out.println(str+" is Palindrome");
		}else{
			System.out.println(str+"is not Palindrome");
		}
	}

}
