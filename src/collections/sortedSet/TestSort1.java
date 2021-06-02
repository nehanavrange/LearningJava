package collections.sortedSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {  
	int rollno;  
	String name; 
	int age;  
	String dept;
	Student(int rollno,String name,int age,String dept){  
		this.rollno=rollno;  
		this.name=name;  
		this.age=age; 
		this.dept=dept;
	}  


	public int getRollno() {
		return rollno;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + ", dept=" + dept + "]";
	}



}  
public class TestSort1 {

	public static void main(String[] args) {

		ArrayList<Student> al=new ArrayList<Student>();  
		al.add(new Student(104,"Vijay",23,"IT"));  
		al.add(new Student(106,"Suyog",27,"ECE"));  
		al.add(new Student(105,"Jai",21,"Finance"));  
		al.add(new Student(101,"Suyog",23,"CSE"));
		al.add(new Student(102,"Neha", 22,"MECH"));

		//al.sort(new AgeNameComparator());

		Collections.sort(al,new AgeNameComparator());
		for(Student st:al){  
			System.out.println(st);  
		}  
	}  
}


