package collections.set;

import java.util.LinkedHashSet;

public class LinkedHashSetProgram {

	public static void main(String[] args) {
		LinkedHashSet<Object> ll=new LinkedHashSet<>();
		//maintains insertion order
		System.out.println("a:"+ll.add("a"));
		System.out.println("aa:"+ll.add("a")); //only unique duplicate not allow
	    System.out.println("b:"+ll.add("b"));
		System.out.println("8:"+ll.add(8));//hetergenous allow
		System.out.println("bb:"+ll.add("b"));
		System.out.println("null:"+ll.add(null)); 
		System.out.println("null2:"+ll.add(null));//only one null allowed
		System.out.println("8.9:"+ll.add(8.9));
		System.out.println("new b:"+ll.add(new String("b")));
		System.out.println("c:"+ll.add('c'));
		System.out.println("space:"+ll.add(""));
		System.out.println(ll.size());
		System.out.println(ll);
	}

}
