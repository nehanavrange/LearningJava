package collectionsClass.member;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AddingSortingDemo {

	public static void main(String[] args) {
		
		// create a list
        List<String> items = new ArrayList<>();
       
        // add elements to the list
        items.add("Shoes");
        items.add("Toys");
 
        System.out.println(items);
        // add one or more elements
        Collections.addAll(items, "Fruits", "Bat", "Ball");
        
        System.out.println(items); 
        
    
        List<String> s = Collections.emptyList();
        
        System.out.println(s); 
        
        
        
        
	}

}
