package serialization.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DePersit {

	public static void main(String[] args) {
		 //Creating stream to read the object  
	//deserialization
		try {
			ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));
			
			Student s=(Student) in.readObject();
			 //printing the data of the serialized object  
			  System.out.println(s.id+" "+s.name);  
			  //closing the stream  
			  in.close();  	
	
		}
		catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	
	}

}
