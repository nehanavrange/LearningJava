package collections.list;

import java.util.LinkedList;

public class LinkedListAddDemo {
	public static void main(String args[]){  
		LinkedList<String> ll=new LinkedList<String>();  
		System.out.println("Initial list of elements: "+ll);  
		ll.add("Neha");  
		ll.add("Suyog");  
		ll.add("Jay");  
		System.out.println("After invoking add(E e) method: "+ll);  

		//Adding an element at the specific position  
		ll.add(1, "Gaurav");  
		System.out.println("After invoking add(int index, E element) method: "+ll);  

		LinkedList<String> ll2=new LinkedList<String>();  
		ll2.add("Roshni");  
		ll2.add("Sachin");  
		//Adding second list elements to the first list  
		ll.addAll(ll2);  
		System.out.println("After invoking addAll(Collection<? extends E> c) method: "+ll);  

		LinkedList<String> ll3=new LinkedList<String>();  
		ll3.add("Pinki");  
		ll3.add("Mona");  
		//Adding second list elements to the first list at specific position  
		ll.addAll(1, ll3);  
		System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+ll);  

		//Adding an element at the first position  
		ll.addFirst("Lokesh");  
		System.out.println("After invoking addFirst(E e) method: "+ll);  
		//Adding an element at the last position  
		ll.addLast("Harshali");  
		System.out.println("After invoking addLast(E e) method: "+ll);  

	}  
}
