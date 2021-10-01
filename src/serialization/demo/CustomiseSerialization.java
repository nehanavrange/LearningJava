package serialization.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//Customized serialization can be implemented using the following two methods:
//1. private void readObject(ObjectInputStream ois) throws Exception:
//2. private void writeObject(ObjectOutputStream oos) throws Exception: 
// this method is executed by jvm 
class Admin implements Serializable{

	String UN="admin";
	transient String pass="hello";
	
	private void writeObject(ObjectOutputStream oos)throws Exception
	{
		 // to perform default serialization 
		oos.defaultWriteObject();
		
	//epwd (encrypted password)
		String epwd="123"+pass;
		
		// writing encrypted password to the file
		oos.writeObject(epwd);
	
	}
	
	 // this method is executed by jvm when readObject()call
	 private void readObject(ObjectInputStream ois) throws Exception
	 { 
		 // performing default deserialization of Account object
		 ois.defaultReadObject();
		 
		 // deserializing the encrypted password from the file
	        String epwd = (String)ois.readObject();
		 
	        pass=epwd.substring(3);
	        
	 }	
}


public class CustomiseSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Admin a=new Admin();
		
		 System.out.println("Username :" + a.UN +
                 "       Password :" + a.pass);
		 
		 //serialization
		 FileOutputStream fos = new FileOutputStream("abc.ser");
		  
	        ObjectOutputStream oos = new ObjectOutputStream(fos);
	  
	        // writeObject() method on Account class will
	        // be automatically called by jvm
	        oos.writeObject(a);
	        
	        //deserialization
	        FileInputStream fis = new FileInputStream("abc.ser");
	        
	        ObjectInputStream ois = new ObjectInputStream(fis);
	        
	        Admin a2=(Admin) ois.readObject();
	       
	        System.out.println();
	        System.out.println("Username :" + a.UN +
	                 "       Password :" + a.pass);
	}
}
