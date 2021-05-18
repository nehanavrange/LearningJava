package markerInterface.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Emp implements Serializable{

	private static final long serialVersionUID = 1L;
	transient int a; //transient variable not serialized during serilizable
	static int b;
	String name;
	int age;

	public Emp(int a, int b, String name, int age) {
		super();
		this.a = a;
		Emp.b = b;
		this.name = name;
		this.age = age;
	}
}


public class Serializable_Interface_Demo {

	public static void main(String[] args) {
		Emp obj=new Emp(1,2,"neha",25);
		String filename="neha.txt";

		//Serialization
		try {
			//saving of object in a file
			FileOutputStream fos=new FileOutputStream(filename);
			ObjectOutputStream oos=new ObjectOutputStream(fos);

			//method of serialization of object
			oos.writeObject(obj);

			oos.close();
			fos.close();

			System.out.println("Object has been serialize\n"+"Data before Deserialization");
			printdata(obj);
			Emp.b=9;

		} catch (IOException e) {
			System.out.println("IOException is caught");
		}

		//DeSerialization
		try {
			//reading the object from file
			FileInputStream fis=new FileInputStream(filename);
			ObjectInputStream ois=new ObjectInputStream(fis);

			//method of Deserialization of object
			obj=(Emp)ois.readObject();
			ois.close();
			fis.close();
			System.out.println("Object has been Deserialize\n"+"Data before Deserialization");
			printdata(obj);

		}
		catch (IOException | ClassNotFoundException e) {
			System.out.println("IOException is caught");
		}
		obj=null;
	}

	private static void printdata(Emp obj) {
		System.out.println("a: "+obj.a);
		System.out.println("b: "+Emp.b);
		System.out.println("name: "+obj.name);
		System.out.println("age "+obj.age);

	}
}
