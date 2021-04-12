package collections.list.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public class ArrayListDemo {
	public static void main(String[] args) {

		//performing different operation on ArrayList

		//creating collection
		ArrayList<Object> al=new ArrayList<>();
		/*ArrayList l=new ArrayList();

    	System.out.println("size:"+l.size());
        System.out.println("element:"+l);*/

		//counting size and printing
		System.out.println("size:"+al.size());
		System.out.println("element:"+al);

		//checking is collecton empty
		System.out.println("isEmpty:"+al.isEmpty());
		//adding all types of objects

		al.add("a");
		al.add("a");
		al.add('b');
		al.add("d");
		al.add(true);
		al.add(null);
		al.add(5);
		al.add(true);

		//counting size and printing
		System.out.println("size:"+al.size());
		System.out.println("element:"+al);

		//checking is collection empty
		System.out.println("isEmpty:"+al.isEmpty());
		al.add("null");
		//counting size and printing
		System.out.println("size:"+al.size());
		System.out.println("element:"+al);

		//checking is collection empty
		System.out.println("isEmpty:"+al.isEmpty());

		//  retriving one element from collection
		System.out.println("retrive no.5 element: "+al.get(5));
		Object obj=al.get(5);
		System.out.println(obj);

		//  retriving all elements from collection
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
		//for searching
		System.out.println("isContains String a :"+al.contains("a"));
		System.out.println("isContains null :"+al.contains("null"));

		//	System.out.println(al.removeAll(al));
		//counting size and printing
		System.out.println("size:"+al.size());
		System.out.println("element:"+al);

		//checking is collection empty
		System.out.println("isEmpty:"+al.isEmpty());

		System.out.println(al.indexOf("a")); //first occurrence element
		System.out.println(al.lastIndexOf("a")); //last occurrence element
		System.out.println(al.lastIndexOf(true));
		System.out.println(al.indexOf(true));

	/*	al.add(7, "p"); 
		//System.out.println(al.iterator());

		System.out.println(al);
		System.out.println(al.remove(0));//index wise
		System.out.println(al);
		System.out.println(al.remove((Integer)5));//object wise casting needs
		System.out.println(al);  */
		al.add(9);
		System.out.println(al);
		System.out.println("size:"+al.size());
	/*	System.out.println(al.remove(0));
		System.out.println(al);
		System.out.println(al.remove(true));
		System.out.println(al);   */
		
		al.set(0, 8); // set() for replacing
		System.out.println(al);
		System.out.println("size:"+al.size());
		
		al.add(1, 0.9); //inserting in the middle of array 
		System.out.println(al);
		System.out.println("size:"+al.size());

		//Collections.sort(al1);  giving error--not for heterogenous objs

		ArrayList<String> al1=new ArrayList<>();
		al1.add("b");
		al1.add("d");
		al1.add("a");

		System.out.println("al1:"+al1);
		//verion 1.7 upto
		//Collections.sort(al1); //use only for same data types
		al1.sort(null); //java 8

		System.out.println("al1:"+al1);

		//ArrayList<Object> al2=new ArrayList<>(al1);
		ArrayList<String> al2=new ArrayList<>();
		al2.add("b");
		al2.add("a");
		al2.add("d");

		al2.add("8");
		System.out.println("al2 obj data:"+ al2);
		System.out.println("al::"+al);
		System.out.println("al1::"+al1);
		System.out.println("al2::"+al2);

		//subset
		System.out.println(al.containsAll(al2));
		System.out.println(al2.containsAll(al));
		System.out.println(al1.containsAll(al2));
		System.out.println("Does al2 contains all elements of al1:"+al2.containsAll(al1));
		
		//removeAll
		// System.out.println(al2.removeAll(al1)); //all al1 data remove from al2
		// System.out.println(al1.removeAll(al2));
		System.out.println("al1:"+al1);
		System.out.println("al2:"+al2);

		//intersection
		/* System.out.println(al1.retainAll(al2));//except al2, all r remove
  System.out.println("al1:"+al1);
  System.out.println("al2:"+al2);*/
		//System.out.println(al2.retainAll(al2));

		// System.out.println(al2.retainAll(al1));//correct

		System.out.println("al1:"+al1);
		System.out.println("al2:"+al2);

		//store data in one collection type  in another collection type
		LinkedList<Object> ll=new LinkedList<>(al2);
		System.out.println(ll);

		//diff betwn add and addAll method

		//1.creating an array
		ArrayList< Object> b=new ArrayList<>();
		b.add('c');
		b.add(2);
		b.add("a");
		b.add(true);
		System.out.println("b :"+b);

		//2.creating 2nd array
		ArrayList< Object> c=new ArrayList<>();
		c.add('d');
		c.add(0.3);
		c.add("m");
		c.add(false);

		//concating one collection to another and store whole array refernce in index with bracket
		c.add(b);
		System.out.println("c :"+c);

		//diff of add and addAll
		//addAll() for union
		c.addAll(b); //storing not reference means without bracket
		System.out.println("c :"+c);

		//to make arraylist as syncronized
		List<Object> list= Collections.synchronizedList(c);













	}
}
