package collections.set;

import java.util.HashSet;

public class HashSetProgam {

	public static void main(String[] args) {
		HashSet<Object> hs=new HashSet<>();
		//not maintain insertion order 
		//storing base on hashcode
		System.out.println("a:"+hs.add("a"));
		System.out.println("a:"+hs.add("a")); //only unique duplicate not allow
	    System.out.println("b:"+hs.add("b"));
		System.out.println("8:"+hs.add(8));//hetergenous allow
		System.out.println("b:"+hs.add("b"));
		System.out.println("null:"+hs.add(null)); 
		System.out.println("null2:"+hs.add(null));
		System.out.println("8.9:"+hs.add(8.9));
		System.out.println("new b:"+hs.add(new String("b")));
		
		System.out.println(hs.size());
		System.out.println(hs);
		
	}

}
