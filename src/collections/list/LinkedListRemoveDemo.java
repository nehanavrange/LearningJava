package collections.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListRemoveDemo {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();  
		ll.add("Neha");  
		ll.add("Suyog");  
		ll.add("Sachin");  
		ll.add("Anuja");  
		ll.add("Pinki");  
		ll.add("Harshali");  
		ll.add("Roshni");  
		ll.add("Pinki");  
		ll.add("Harshali");  
		ll.add("Amit");  
		System.out.println("Initial list of elements: "+ll);  

		//Removing specific element from Linkedlist  
		ll.remove("Suyog");  
		System.out.println("After invoking remove(object) method: "+ll);   

		//Removing element on the basis of specific position  
		ll.remove(0);  
		System.out.println("After invoking remove(index) method: "+ll);   

		LinkedList<String> ll2=new LinkedList<String>();  
		ll2.add("RaviTeja");  
		ll2.add("Hanumata");  
		// Adding new elements to Linkedlist  
		ll.addAll(ll2);  
		System.out.println("Updated list : "+ll);   

		//Removing all the new elements from Linkedlist  
		ll.removeAll(ll2);  
		System.out.println("After invoking removeAll() method: "+ll);   

		//Removing first element from the list  
		ll.removeFirst();  
		System.out.println("After invoking removeFirst() method: "+ll);  
		
		//Removing first element from the list  
		ll.removeLast();  
		System.out.println("After invoking removeLast() method: "+ll);  
		
		//Removing first occurrence of element from the list  
		ll.removeFirstOccurrence("Pinki");  
		System.out.println("After invoking removeFirstOccurrence() method: "+ll);  
		
		//Removing last occurrence of element from the list  
		ll.removeLastOccurrence("Harshali");  
		System.out.println("After invoking removeLastOccurrence() method: "+ll);  

		//Removing all the elements available in the list       
		ll.clear();  
		System.out.println("After invoking clear() method: "+ll); 
	
		//Traversing the list of elements in reverse order  
        Iterator i=ll2.descendingIterator();  
        while(i.hasNext())  
        {  
            System.out.print(i.next()+" ");  
        }  
	}

}
