package datastructure;

class Node{
	int data;
	Node prev;
	Node next;
	public Node(int data) {
		this.data=data; 
		prev=null;
		next=null;
	}

}
public class DoublyLinkedList {

	Node head=null;

	public DoublyLinkedList(int data) {
		Node a=new Node(data); //creating head node
		head=a;
	}

	void insertAtFront(Node newNode) {
		newNode.next=head;
		head.prev= newNode;
		head= newNode;
	}

	void insertAtMiddle(Node n,Node b){
		n.next=b.next;
		b.next.prev=n;
		b.next=n;
		n.prev=b;
	}

	void insertEnd(Node n) {
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		n.prev=temp;
		temp.next=n;
		n.next=null;
	}

	void delete(Node n) {

		if(n.prev != null) { //node is not head
			n.prev.next = n.next;
		}
		else { //node a is head
			head = n.next;
		}

		if(n.next != null) {
			n.next.prev = n.prev;
		}
	}


	void display() {
		if(head==null) {
			System.out.println("list is empty");
		}

		System.out.println("Nodes of Doubly linked list: ");
		Node current=head;
		while(current!=null)
		{
			System.out.println(current.data);
			current=current.next;
		}


	}

	public static void main(String[] args) {
		DoublyLinkedList dl=new DoublyLinkedList(10);
		dl.display();

		//creating nodes
		Node a,b,c;
		a=new Node(20); 
		b=new Node(30);
		c=new Node(40);

		//connecting to linklist
		dl.head.next=a;
		a.next=b;
		b.next=c;
		dl.display();

		//insert at front
		Node z;
		z=new Node(50);
		dl.insertAtFront(z);
		dl.display();

		Node d = new Node(100);
		dl.insertAtMiddle(d, b); //inserting node z after node b
		Node e = new Node(-1);
		dl.insertAtMiddle(e, a.next);
		dl.display();

		//insert at End
		Node f = new Node(-100);
		dl.insertEnd(f);
		dl.display();

		dl.delete(dl.head);
		dl.delete(f);
		dl.display();
		dl.delete(e);
		dl.display();


	}

}
