package collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArraySubList {
public static void main(String[] args) {
	List<Object> list=new ArrayList<>();
	
	list.add("a");
	list.add("b");
	list.add("c");
	list.add(5);
	list.add(9.4);
	System.out.println("list: "+list);
	
	List<Object> l=list.subList(1, 3); //from index inclusive,end index exclusive
	System.out.println("L:"+l);
	
	//in java 9 methods
	System.out.println(List.of());
	System.out.println(List.of("a"));
	System.out.println(List.of("a",9));
	
	//java10 methods
	System.out.println(List.copyOf(list));
}
}
