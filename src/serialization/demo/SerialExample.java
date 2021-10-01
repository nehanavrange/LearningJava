package serialization.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Emp implements Serializable{
	transient int a;
	static int b;
	String name;
	int age;

	public Emp(int a,int b, String name, int age) {
		super();
		this.a = a;
		this.b=b;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Emp [a=" + a + ",b=" + b + ", name=" + name + ", age=" + age + "]";
	}




}

public class SerialExample {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Emp obj=new Emp(1,22, "suyog", 30);

		// Serialization

		// Saving of object in a file
		FileOutputStream file = new FileOutputStream("s.txt");

		ObjectOutputStream out = new ObjectOutputStream(file);

		// Method for serialization of object
		out.writeObject(obj);

		out.close();
		file.close();

		System.out.println("Object has been serialized\n"
				+ "Data before Deserialization.");

		System.out.println(obj);

		// value of static variable changed
		obj.b = 2000;
		System.out.println("\nchanging static value b to 2000");
		System.out.println(obj);

		System.out.println("\n making existing obj null ");
		obj = null;
		// Deserialization
		System.out.println(obj);
		
		// Reading the object from a file
        FileInputStream file1 = new FileInputStream
                                     ("s.txt");
        ObjectInputStream in = new ObjectInputStream
                                     (file1);

        // Method for deserialization of object
        obj = (Emp)in.readObject();

        in.close();
        file1.close();
        System.out.println("\n Object has been deserialized\n"
                            + "Data after Deserialization.");
       
        System.out.println("\n transient variable will not  deserialized");
        System.out.println(obj);

		
	}



}
