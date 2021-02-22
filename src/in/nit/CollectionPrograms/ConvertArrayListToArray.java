package in.nit.CollectionPrograms;

import java.util.ArrayList;

public class ConvertArrayListToArray {

	public static void main(String[] args) {
		// covert using get()
		ArrayList<String> al=new ArrayList<>();
		al.add("a");
		al.add("b");
		al.add("c");
		System.out.println("size:"+al.size());
		System.out.println("al:"+al);
		
	/*	//ArrayList to array Converion
		String arr[]=new String[al.size()];
		for(int i=0;i<al.size();i++)
		{
			arr[i]=al.get(i);
		
		//System.out.println(arr[i]); Or
		}
	 //using enhance for loop displaying data
		for (String arr1 : arr) {
			System.out.println(arr1);
		}   */
		
		//Convert using toArray()
		//1st method using Objects[]
		Object[] obj=al.toArray();
		for (Object object : obj) {
			System.out.println(object);
		}
		//2nd method  using String[]
		String s[]=new String[al.size()];
		s=al.toArray(s);
		for (String str : s) {
			System.out.println(str);
		}
		
		
		
	}

}
