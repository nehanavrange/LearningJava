package collection.Map;

import java.util.HashMap;

public class HashMapProgm {

	public static void main(String[] args) {
	
		HashMap<Object, Object> hm=new HashMap<>();
		//not mainting storing order
		hm.put("a", 97);
		hm.put("a", 0);//replacing 1st value with new one if key is same
		hm.put(9,"a");
		hm.put(new String("a"), 5);
		hm.put(97, 4);
		hm.put(null,null);
		hm.put('w',"null");
		
		
		System.out.println(hm.size());
		System.out.println(hm);
		
	}

}
