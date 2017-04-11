package com.skill.string;

public class ReverseSentence {

	public static void main(String[] args) {
		reverse("My Name is Manish");
	}
	public static void reverse(String str) {
		String[] arr=str.split(" ");
		StringBuilder builder=new StringBuilder();
		for(int i=arr.length-1;i>=0;i--){
			builder.append(arr[i]).append(" ");
		}
		System.out.println(builder);
	}

}
