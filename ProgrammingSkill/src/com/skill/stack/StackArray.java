package com.skill.stack;

public class StackArray {
	private int size;
	private int top;
	private int[] arr;

	public StackArray(int count) {
		arr = new int[count];
		size = count;
		top = -1;
	}

	public int[] getStack() {
		return arr;
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (top == size - 1);
	}
	
	public int getPeek(){
		return arr[top];
	}
	
	public void push(int ele){
		if(isFull()){
			System.out.println("Stack is Full");
		}else{
			top++;
			arr[top]=ele;
		}
	}
	
	public int pop(){
		int i = 0;
		if(isEmpty()){
			System.out.println("Empty Stack");
		}else{
			arr[top]=0;
			top--;
			i=arr[top];
		}
		return i;
	}
}
