package com.skill.string;

import java.util.Scanner;

public class RemoveDuplicateCharacters {
	private static Scanner scanner;
	private static String sb;
	public static void main(String[] args) {
		System.out.println("Enter String = ");
		scanner = new Scanner(System.in);
		String s=scanner.next();
		System.out.println("Enter Character to remove ");
		String ch=scanner.next();
		removeDupChar(s,ch);
	}
	
	public static void removeDupChar(String str,String ch){
		
		for(int i=0;i<str.length();i++){
			char ctemp=ch.charAt(0);
			if(ctemp==str.charAt(i)){
				sb=str.replace(ctemp, ' ');
			}
		}
		System.out.println(sb.trim().replace(" ", ""));
	}

}
