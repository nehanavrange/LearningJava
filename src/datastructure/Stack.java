package datastructure;

import java.util.Scanner;

public class Stack {

	static int ch;
	static Scanner sc=new Scanner(System.in);
	static int stack[],size,items;
	static int top = -1;
	static{
		create();

	}
	public static void main(String[] args) {

		while(true) {
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Peek");
			System.out.println("4. Traverse");
			System.out.println("5. Quit");

			System.out.println("Enter your choice: ");
			ch=sc.nextInt();

			switch (ch) {
			case 1: push();
			break;

			case 2: pop();
			break;

			case 3: peek();
			break;
			case 4: traverse();
			break;
			case 5: System.exit(1);
			default:
				throw new IllegalArgumentException("Unexpected value: " + ch);
			}
		}

	}
	private static void traverse() {

		for (int i = top; i >= 0; i--) {
			System.out.println(stack[i]);
			
		}
		System.out.println();

	}
	private static void peek() {
		if(top==-1) {
			System.out.println("Stack is underflow");	
		}
		else {
			items=stack[top];
			System.out.println("Peek element:"+items);
		}
	}
	private static void pop() {
		if(top==-1) {
			System.out.println("Stack is underflow");	
		}
		else {
			items=stack[top];
			top--;
			System.out.println("Removed element:"+items);
		}

		

	}
	private static void push() {
		if(top==size-1) {
			System.out.println("Stack is overflow");
		}
		else {
			++top;
			System.out.println("Enter Elements to push in statck:");
		    items = sc.nextInt();
		    stack[top]=items;
		}
		


	}
	static void create() {
		System.out.println("Enter stack size:");
		size= sc.nextInt();
		stack= new int[size]; //creating array of size

	}

}
