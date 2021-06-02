package collections.sortedSet;

import java.util.Comparator;

public class AgeNameComparator implements Comparator<Student> {

	//sort by age.if age is same then compare by roll no.
	@Override
	public int compare(Student o1, Student o2) {
		int comparison=0;
		comparison=o1.age-o2.age;
		if(comparison==0)  // means both value are same
		{
			comparison=o1.rollno-o2.rollno;
		}
		return comparison;
	}

	/*	//sort by age, if age is same then compare by name 
	@Override
	public int compare(Student o1, Student o2) {
		int comparison=0;
		comparison=o1.age-o2.age;
		if(comparison==0) {
			comparison=o1.name.compareTo(o2.name);
		}

		return comparison;
	}   */

	/*	//sort by name, if name is same then compare by dept
		@Override
	public int compare(Student o1, Student o2) {
		int comparison=0;
		comparison=o1.name.compareTo(o2.name);
		if(comparison==0) {
			comparison=o1.dept.compareTo(o2.dept);
		}
		return comparison;
	} */

}
