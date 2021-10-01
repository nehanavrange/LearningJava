package exceptionHandling;

class NullPointerException1 extends RuntimeException {
	NullPointerException1(String str){
		super(str);
	}
	
	
}

public class RunTimeExceptionDemo {

	

	public static void main(String[] args) {
	
		String str = null;
		
		
				validateLength(str);
			
		
		
	}

	private static void validateLength(String str)   {
		
		
		if(str.length()==0) {
			throw new NullPointerException1("string is null");
			
		}
		else {
			System.out.println(str.length());	
		}
		
	}

}
