package collections.sortedSet;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;

public class EmployeeSortOnMuiltipleField {

	public static void main(String[] args) {
		List<Employee> emp=new ArrayList<Employee>();
		emp.add(new Employee(2, "nnn", "IT", 2000));
		emp.add(new Employee(1,"nnn", "etc", 1000));
		emp.add(new Employee(3,"ccc", "ECE",4000));
		emp.add(new Employee(4, "bbb", "CS", 4000));

		System.out.println("before sorting list");
		for (Employee employee : emp) {
			System.out.println(employee );
		}

		Collections.sort(emp);


		System.out.println("After sorting list");
		for (Employee employee : emp) {
			System.out.println(employee );
		}

	}


}
