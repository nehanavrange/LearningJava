package collections.set;

import java.util.HashSet;
import java.util.Iterator;

public class IterateHAshSet {

	public static void main(String[] args) {
		//in hashSet duplictes not allowed
		HashSet<Object> h=new HashSet<>();
		h.add(1);
		h.add(2);
		h.add(3);
		h.add(2);
	/*	//using iterator
		Iterator<Object> i=h.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
			
		}*/
		
		//using foreach loop
		for (Object obj : h) {
			System.out.println(obj);
			
		}
		//using lambda expresiion
		h.forEach(obj->System.out.println(obj));
		
		
		
	}

}
