package serialization.demo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Persist {

	public static void main(String[] args) {

		//creating Object of Student class
		Student s=new  Student(1,"abc");

		//Creating serialize stream and writing the object    
		try {
			FileOutputStream fout=new FileOutputStream("f.txt");
			ObjectOutputStream out=new ObjectOutputStream(fout);
			out.writeObject(s);
			out.flush();
			
			//closing stream
			out.close();
			System.out.println("success");

		}
		catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
