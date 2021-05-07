package collection.Map;

import java.util.HashMap;

public class HashMapInternal {

	public static void main(String[] args) {
		HashMap<Object,Object> hm= new HashMap<Object, Object>();
		System.out.println(hm.size());
		System.out.println(hm);
		System.out.println();
		hm.put("a", 1);
		hm.put("a",2); //hashCode is 97 and reference wise same so replace 
		hm.put(new String("a"),3);//hashCode is 97 reference wise diff but datawise("a"=="a")same so replace
        hm.put(97, 4); //hashCode is 97 but reference wise and datawise is diff so store in same bucket
        hm.put(97, 5);//hashCode is 97 and reference wise same so replace
        hm.put(new Integer(97), 6);
        hm.put(new EX(5,6), 7);
        hm.put(new EX(5,6), 8);
        EX e1 = new EX(7,8);
        hm.put(e1,9);
        hm.put(e1,10);
		System.out.println(hm);
		
		
	}

}
