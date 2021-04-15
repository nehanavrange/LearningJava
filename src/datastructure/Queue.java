package datastructure;

import java.util.Scanner;

public class Queue {
	static int ch,size,queue[],item;
	static int front=0,rear=0;
	static Scanner sc=new Scanner(System.in);

	static{
		create();

	}
	public static void main(String[] args) {
		while(true) {
			System.out.println("Performing operations on Queue");
			System.out.println("1. Insert");
			System.out.println("2. Delete");
			System.out.println("3. Traverse");
			System.out.println("4. Quit");

			System.out.println("Enter your choice: ");
			ch=sc.nextInt();

			switch (ch) {
			case 1: insert();
			break;

			case 2: delete();
			break;

			case 3: traverse();
			break;

			case 4: System.exit(1);
			default:
				throw new IllegalArgumentException("Unexpected value: " + ch);
			}
		}

	}
	private static void create() {

		System.out.println("Enter queue size:");
		size=sc.nextInt();

		queue=new int[size];


	}
	private static void traverse() {
		if(front==rear) {
			System.out.println("Queue is underflow to traverse,Plz insert elements");
		}
		else {
			System.out.println("Elements in the Queue");
			for (int i = front; i < rear; i++) {
				System.out.println(queue[i]);	
			}
		}

	}
	private static void delete() {

		if(front==rear) {
			System.out.println("Queue is underflow,Plz insert elements");
		}
		else {
			item=queue[front];
			front++;
			System.out.println("Removed element:"+item);
		}
	}
	private static void insert() {

		if(rear==size) {
			System.out.println("Queue is overflow, Don't insert elements");
		}
		else {
			System.out.println("Enter element to insert");
			item=sc.nextInt();
			queue[rear]=item;
			rear++;
		}
	}
}


