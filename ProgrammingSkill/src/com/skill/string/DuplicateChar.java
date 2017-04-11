package com.skill.string;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 
 * @author Manish find duplicate characters in a String
 *
 */

public class DuplicateChar {
	
	public static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		System.out.println("Enter string 1");
		String st1 = sc.next();
		HashMap<Character, Integer> hashMap=new HashMap<Character, Integer>();
		for(int i=0;i<st1.length();i++){
			char ch=st1.charAt(i);
			if(hashMap.containsKey(ch)){
				hashMap.put(ch, hashMap.get(ch)+1);
			}else{
				hashMap.put(ch, 1);
			}
		}
		System.out.println(hashMap);
	}

}
