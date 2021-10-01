package serialization.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Demo implements  Serializable{

	int a;
	String b;
	public Demo(int a, String b) {
		super();
		this.a = a;
		this.b = b;
	}


}

public class Test{
	public static void main(String[] args) {

		//creatng object of Demo class
		Demo d=new Demo(1,"hi");

		String fileName="h.txt";

		// Serialization

		//Saving of object in a file

		try {
			FileOutputStream file=new FileOutputStream(fileName);
			ObjectOutputStream out=new ObjectOutputStream(file);

			// Method for serialization of object
			out.writeObject(d);
			out.close();
			file.close();
			System.out.println("Object has been serialized");
			 System.out.println("a = " + d.a);
	            System.out.println("b = " + d.b);

			// Deserialization

			Demo obj1=null;
			// Reading the object from a file
			FileInputStream in=new FileInputStream(fileName);
			ObjectInputStream ob=new ObjectInputStream(in);

			// Method for deserialization of object
			obj1=(Demo) ob.readObject();

			in.close();
			file.close();

			System.out.println("Object has been deserialized ");
			System.out.println("a = " + obj1.a);
			System.out.println("b = " + obj1.b);
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}