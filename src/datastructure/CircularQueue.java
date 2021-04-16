package datastructure;

import java.util.Scanner;

public class CircularQueue {

	static int ch,size,Cqueue[],item;
	static int front=-1,rear=-1;
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
				System.out.println("Plz provide proper input");

			}
		}

	}
	private static void create() {

		System.out.println("Enter queue size:");
		size=sc.nextInt();

		Cqueue=new int[size];


	}
	private static void traverse() {
		if(front==-1 ) {
			System.out.println("Queue is underflow to traverse,Plz insert elements");
		}
		
		System.out.println("Elements in the Circular Queue");
		if (rear >= front)
		{
			for (int i = front; i <= rear; i++) {
				System.out.println(Cqueue[i]);	
			}
		}

	}
	private static void delete() {
		if (front==-1 && rear==-1) {
			System.out.println("Circulr queue is empty");
		}
		else if (front==rear) {
			item=Cqueue[front];
			front=rear=-1;
			System.out.println("Removed element:"+item);

		}
		else if (front==size-1) {
			item=Cqueue[front];
			front=0;
			System.out.println("Removed element:"+item);
		}
		else {
			item=Cqueue[front];
			front++;
			System.out.println("Removed element:"+item);
		}


	}
	private static void insert() {

		if(front==rear+1  || rear==size-1 && front==0)
		{
			System.out.println("Circular Queue is full");
		}
		else if (front==-1 && rear==-1) {
			front=rear=0;
			System.out.println("Enter element:");
			item=sc.nextInt();
			Cqueue[rear]=item;
			//rear++;
		}
		else if (rear==size-1) {
			rear=0;
			System.out.println("Enter element:");
			item=sc.nextInt();
			Cqueue[rear]=item;
			//rear++;
		}
		else {
			rear++;
			System.out.println("Enter element:");
			item=sc.nextInt();
			Cqueue[rear]=item;



		}
	}
}
