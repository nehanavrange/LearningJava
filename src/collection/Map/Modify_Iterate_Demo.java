package collection.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class Modify_Iterate_Demo {

	//here keySet() contains only key and entrySet() map both key and value
	public static void main(String[] args) {
		Map<Object,Object> m=new HashMap<Object, Object>();
		m.put(1, "a");
		m.put(2, "b");
		m.put("A","c");
		m.put(4,null);
		m.put(5,null);
		System.out.println("original map: "+m);

		m.compute("A",(k, v) -> (v == null) ? 1 : ((String) v).concat("b"));
		m.computeIfPresent(1,(k, v) ->"ab");
		m.computeIfAbsent(6,v ->"abc");

		System.out.println("modified map: "+m);

		// using for-each loop for iteration over Map.entrySet()
		/*	for (Map.Entry<Object, Object>entry : m.entrySet()) {
			System.out.println("key="+entry.getKey()+" value= "
					+entry.getValue());
		}*/

		// using iterators
		/*	Iterator<Map.Entry<Object, Object>>itr=m.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<Object, Object> entry=itr.next();
			System.out.println("k= "+entry.getKey()+" v="+entry.getValue());
		} */
		
		//or
		Iterator<Map.Entry<Object, Object> > itr = m.entrySet().iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// forEach(action) method to iterate map using lambda exp
		//m.forEach((k,v)->System.out.println("k="+k +", v="+v));

		//using Stream
	 /*	Stream<Entry<Object, Object>>s=m.entrySet().stream();
		s.forEach((v)->{
			System.out.println(v);
		}); */


		//m.entrySet().iterator().forEachRemaining(System.out::println);

	}
}
