package collections.sortedSet;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetProgm  {

	public static void main(String[] args) {
		//default element store in ascending sorting  order
		TreeSet<Object>ts=new TreeSet<>();
		ts.add("a");
		ts.add("c");
		ts.add("b");
		System.out.println(ts.size());
		System.out.println(ts);
		
		//default element store in ascending sorting  order
		TreeSet<EX> t=new TreeSet<>();
		t.add(new EX(3,2));
		t.add(new EX(5,6));
		t.add(new EX(9,4));
		t.add(new EX(11,1));
		System.out.println(t.size());
		System.out.println(t);
		
		//using custom comparator element store in desc order without disturbing EX class code
		//bad practice so use anonymous class
		TreeSet<EX> t1=new TreeSet<>(new EXDescXComparator());
		t1.add(new EX(3,2));
		t1.add(new EX(5,6));
		t1.add(new EX(9,4));
		t1.add(new EX(11,1));
		System.out.println(t1.size());
		System.out.println(t1);
		
		//best approaach using anonymous for custom comparator 
		TreeSet<EX> t2=new TreeSet<>(new Comparator<EX>(){

			public int compare(EX o1, EX o2) {
				
				return o2.getX() - o1.getX();}}
                                    );
		t2.add(new EX(3,2));
		t2.add(new EX(5,6));
		t2.add(new EX(9,4));
		t2.add(new EX(11,1));
		System.out.println(t2.size());
		System.out.println(t2);
		
		//using lambda expression bcoz comparator r funtional interface
		TreeSet<EX> t3=new TreeSet<>(( o1,  o2)->
		                     o2.getX() - o1.getX()
									);
		t3.add(new EX(3,2));
		t3.add(new EX(5,6));
		t3.add(new EX(9,4));
		t3.add(new EX(11,1));
		System.out.println(t3.size());
		System.out.println(t3);
		
	}

}
