package collection.Map;

import java.util.LinkedHashMap;

public class LinkedHashMapProgm {

	public static void main(String[] args) {
		LinkedHashMap<Object, Object>lhm =new LinkedHashMap<>();
		//maintaing insertion order
		System.out.println(lhm.size());
		System.out.println(lhm);
		lhm.put("a", 97);
		lhm.put("a", 0); //replacing old value to new one if key is same
		lhm.put(9,"a");
		lhm.put(null,null);
		lhm.put(8,9);
		System.out.println(lhm.size());
		System.out.println(lhm);
		

	}

}
