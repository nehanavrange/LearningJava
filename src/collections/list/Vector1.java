package collections.list;

import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		Vector<Object> v=new Vector<>();
		System.out.println("capacity:"+v.capacity());//initial capacity

		for(int i=0;i<10;i++)
		{
			v.add(i);
		}
		System.out.println(v.add("a"));//increases capacity by double
		System.out.println("elemetnt:"+v);
		System.out.println("capacity:"+v.capacity());
	
		Vector<Object> v1=new Vector<>(2);
		System.out.println("v1 capacity:"+v1.capacity());//initial capacity

		v1.add(9);
		v1.add(0);
		v1.add(8);
		v1.add("a");
		System.out.println("elemetnt:"+v1);
		System.out.println("capacity:"+v1.capacity());
	 
		Vector<Object> v2=new Vector<>(2,1);
		System.out.println("v2 capacity:"+v2.capacity());//initial capacity
		v2.add(9);
		v2.add(0);
		v2.add("a");
		System.out.println("elemetnt:"+v2);
		System.out.println("capacity:"+v2.capacity());
	 
		
		
		
	}

}
