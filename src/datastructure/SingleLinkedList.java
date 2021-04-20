package datastructure;

public class SingleLinkedList {

	Node head=null;

	//Represent the Node
	static class Node{
		int data;
		Node next;
		public Node(int data) {

			this.data = data;
			this.next = null;
		}	
	}

	void insertFront(int data) {
		Node newNode= new Node(data);
		newNode.next=head;
		head=newNode;
	}

	void insertAtMiddle(Node prev,int data)
	{
		Node newNode= new Node(data);
		Node temp;
		temp=prev.next;
		prev.next=newNode;
		newNode.next=temp;
	}

	void insertAtEnd(int data)
	{
		Node newNode= new Node(data);
		Node temp=head;
		Node prev=null;
		while(temp!=null) { //traversing list
			prev=temp;
			temp=prev.next;
		}
		prev.next=newNode;
		newNode.next=null;
	}
	void delete(int data) {
		Node temp,prev=null;
		temp=head;
		while(temp!=null && temp.data!=data) {
			prev=temp;
			temp=prev.next;
		}

		prev.next=temp.next;


	}
	/* Returns count of nodes in linked list */
	public int getCount()
	{
		Node temp = head;
		int count = 0;
		while (temp != null)
		{
			count++;
			temp = temp.next;
		}
		return count;
	}

	//display() will display all the nodes present in the list    
	void display() {
		//Node current will point to head
		Node current=head;
		if(head == null) {    
			System.out.println("List is empty");    
			return;    
		}    
		System.out.println("Nodes of singly linked list: ");    
		while(current!=null) {
			System.out.println(current.data+" ");
			current =current.next;
		}
		System.out.println();   
	}

	public static void main(String[] args) {
		SingleLinkedList sl=new SingleLinkedList();
		Node first= new Node(10);
		sl.head=first;
		Node second= new Node(20);
		first.next=second;
		Node third= new Node(40);
		second.next=third;
		sl.display();
		sl.insertFront(30);
		sl.insertAtMiddle(second, 5);
		sl.insertAtEnd(6);
		sl.display();
		sl.delete(5);
		sl.display();
		System.out.println("Count of nodes in list is " + sl.getCount());
	}

}
