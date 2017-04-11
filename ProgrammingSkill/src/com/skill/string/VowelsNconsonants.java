package com.skill.string;

import java.util.Scanner;

/**
 * 
 * @author Manish count number of vowels and consonants in a String
 *
 */

public class VowelsNconsonants {

	public static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		System.out.println("Enter string 1");
		String st1 = sc.next();
		int vCount=0;
		int cCount=0;
		for(int i=0;i<st1.length();i++){
			char ch=st1.toLowerCase().charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
				vCount++;
			}else{
				cCount++;
			}
		}
		System.out.println("vowels ="+vCount);
		System.out.println("consonants ="+cCount);
		
	}

}
