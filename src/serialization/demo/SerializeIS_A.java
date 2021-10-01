package serialization.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{

	int id;
	String name;
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


}

class Student1 extends Person{

	String course;
	int fee;

	public Student1(int id, String name, String course, int fee) {
		super(id, name);
		this.course = course;
		this.fee = fee;
	}

}



public class SerializeIS_A {

	public static void main(String[] args)  {

		//Creating the object    
		Student1 s1=new Student1(22,"cc", "java",4000);

		//Creating stream and writing the object   

		try {
			FileOutputStream fout = new FileOutputStream("t.txt");

			ObjectOutputStream	out = new ObjectOutputStream(fout);


			out.writeObject(s1);

			out.flush();    
			//closing the stream    
			out.close();    
			System.out.println("success");    

			//Creating stream to read the object  
			ObjectInputStream in=new ObjectInputStream(new FileInputStream("t.txt"));  

			Student1 s=(Student1)in.readObject();    
			//printing the data of the serialized object    
			System.out.println(s.id+" "+s.name+" "+s.course+" "+s.fee);    
			//closing the stream    
			in.close();    
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
