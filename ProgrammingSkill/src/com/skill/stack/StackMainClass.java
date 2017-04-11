package com.skill.stack;

import java.util.Arrays;
import java.util.Scanner;

public class StackMainClass {
	static Scanner scan;

	public static void main(String[] args) {
		System.out.println("Enter Size of Stack");
		scan = new Scanner(System.in);
		StackArray myStack=new StackArray(scan.nextInt());
		char ch;
		do {
			System.out.println("\nStack Operations\n");
			System.out.println("1. push");
			System.out.println("2. pop");
			System.out.println("3. Check if empty");
			System.out.println("4. Check if Full");
			System.out.println("5. check top element");
			
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter integer element to Push");
				myStack.push(scan.nextInt());
				break;
			case 2:
				System.out.println("Integer element to Pop = "+myStack.pop());
			
				break;
			case 3:
				if(myStack.isEmpty()){
					System.out.println("Stack is empty");
				}else{
					System.out.println("Stack is not empty");
				}
				break;
			case 4:
				if(myStack.isFull()){
					System.out.println("Stack is Full");
				}else{
					System.out.println("Stack is not Full");
				}
				break;
			case 5:
				System.out.println("Stack top element = "+myStack.getPeek());
				break;
			default:
				System.out.println("Wrong Entry \n ");
				break;
			}
			/* Display List */
			System.out.println(Arrays.toString(myStack.getStack()));
			System.out.println("\nDo you want to continue (Type y or n) \n");
			ch = scan.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');
	}
}
