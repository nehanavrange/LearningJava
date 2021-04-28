package collections.queue;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// Creating a priority queue
		PriorityQueue<Integer> pq= new PriorityQueue<>();

		// Using the add() method
		pq.add(4);
		pq.add(2);
		System.out.println("PriorityQueue: " + pq);

		// Using the offer() method
		pq.offer(1);
		System.out.println("Updated PriorityQueue: " +pq);

		//Using the iterator() method
		System.out.print("PriorityQueue using iterator(): ");
		Iterator<Integer> itr=pq.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}

		System.out.println();
		// Using the peek() method
		//returns the head of the queue.
		int number = pq.peek();
		System.out.println("Accessed Peek Element: " + number);

		// Using the remove() method
		// removes the specified element from the queue
		boolean result = pq.remove(2);
		System.out.println("Is the element 2 removed? " + result);

		System.out.println("Updated PriorityQueue: " +pq);

		// Using the poll() method
		//returns and removes the head of the queue
		int number1 = pq.poll();
		System.out.println("Removed Element Using poll(): " + number1);

		System.out.println("Updated PriorityQueue: " +pq);
		
		
	}
}

