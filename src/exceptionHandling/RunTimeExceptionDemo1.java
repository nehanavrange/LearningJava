package exceptionHandling;

import java.util.ArrayList;
import java.util.Arrays;

class UniqueLanguageException extends RuntimeException{

	public UniqueLanguageException(String str) {
		super(str);
	}
	
	
}

public class RunTimeExceptionDemo1 {
	static ArrayList<String> al=new ArrayList<String>(Arrays.asList("java","C","c++"));
	
	public static void checkLanguage(String language) {
		if(al.contains(language)) {
			throw new UniqueLanguageException("Language is already existed");
		}
		else {
			al.add(language);
			System.out.println("new language added:"+al);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(al);
		
		checkLanguage("oops");
		checkLanguage("java");
		
		
	
	}

}
